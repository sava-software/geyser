# Geyser

A hello world example project for using gRPC to communicate with a Solana RPC node with
the [Geyser plugin](https://docs.anza.xyz/validator/geyser/)
installed.

The proto files are provided from [rpcpool/yellowstone-grpc](https://github.com/rpcpool/yellowstone-grpc) and located
[locally here](https://github.com/sava-software/geyser/tree/main/src/main/proto).

The Gradle gRPC
plugin [generates client code](https://github.com/sava-software/geyser/tree/main/src/main/proto)
based on the proto files when building the project (`/.gradlew build`).

An example using the generated code to subscribe to transactions for an account can be found
in [HelloGeyser](https://github.com/sava-software/geyser/tree/main/src/main/java/software/sava/grpc/geyser/HelloGeyser.java).
