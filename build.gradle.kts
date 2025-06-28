plugins {
  id("java")
  alias(libs.plugins.google.protobuf.plugin)
}

java {
  toolchain {
    languageVersion.set(JavaLanguageVersion.of(24))
  }
}

val savaBOMVersion = providers.gradleProperty("savaBOMVersion").get()

dependencies {
  implementation(platform("software.sava:solana-version-catalog:${savaBOMVersion}"))

  implementation(libs.bundles.grpc.protobuf)

  implementation("software.sava:sava-core")
  implementation("software.sava:solana-programs")
}

protobuf {
  protoc {
    artifact = "com.google.protobuf:protoc:${libs.versions.protoc.get()}"
  }
  plugins {
    create("grpc") {
      artifact = "io.grpc:protoc-gen-grpc-java:${libs.versions.grpc.get()}"
    }
  }
  generateProtoTasks {
    all().forEach { task ->
      task.plugins {
        create("grpc") {
          // https://github.com/grpc/grpc-java/issues/9179
          option("jakarta_omit")
          option("@generated=omit")
        }
      }
    }
  }
}
