#!/usr/bin/env bash

set -e

readonly SRC_PROTO_DIRECTORY='grpc/yellowstone-grpc-proto/proto'
readonly DST_PROTO_DIRECTORY='src/main/proto'

insert_option_lines() {
  local proto_file="$1"
  local temp_file="${proto_file}.tmp"

  awk '
    /^package / {
      print "option java_package = \"software.sava.grpc.geyser.generated\";";
      print "option java_multiple_files = true;";
      print "";
      print $0;
      next;
    }
    { print }
  ' "$proto_file" | cat -s > "$temp_file"

  mv "$temp_file" "$proto_file"
}

cd "$SRC_PROTO_DIRECTORY"

git pull

cd ../../..

cp ${SRC_PROTO_DIRECTORY}/*.proto "$DST_PROTO_DIRECTORY"

sed -i '' '/^option /d' ${DST_PROTO_DIRECTORY}/*.proto

proto_files=$(find "$DST_PROTO_DIRECTORY" -name "*.proto")
for proto_file in $proto_files; do
  insert_option_lines "$proto_file"
done

#./gradlew build

exit 0
