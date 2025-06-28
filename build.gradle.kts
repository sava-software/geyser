plugins {
  `java-library`
  id("com.google.protobuf") version "0.9.5"
}

java {
  toolchain {
    languageVersion.set(JavaLanguageVersion.of(24))
  }
}

repositories {
  mavenCentral()
}

// https://mvnrepository.com/artifact/com.google.protobuf/protoc
val protocVersion = "4.31.1"
val grpcVersion = "1.73.0"
val savaVersion = "24.19.7"
val savaProgramsVersion = "24.20.3"

dependencies {
  implementation("com.google.protobuf:protobuf-java:${protocVersion}")

  implementation("io.grpc:grpc-netty-shaded:${grpcVersion}")
  implementation("io.grpc:grpc-stub:${grpcVersion}")
  implementation("io.grpc:grpc-protobuf:${grpcVersion}")
  implementation("io.grpc:protoc-gen-grpc-java:${grpcVersion}")

  implementation("software.sava:sava-core:${savaVersion}")
  implementation("software.sava:solana-programs:${savaProgramsVersion}")
}

protobuf {
  protoc {
    artifact = "com.google.protobuf:protoc:${protocVersion}"
  }
  plugins {
    create("grpc") {
      artifact = "io.grpc:protoc-gen-grpc-java:${grpcVersion}"
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
