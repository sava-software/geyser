#!/usr/bin/env bash

set -e

rm -rf glam/
git clone -n --depth=1 --filter=tree:0 https://github.com/rpcpool/yellowstone-grpc.git grpc
cd grpc
# https://github.com/rpcpool/yellowstone-grpc/tree/master/yellowstone-grpc-proto/proto
git sparse-checkout set --no-cone yellowstone-grpc-proto/proto
git checkout

cd ..

exit 0
