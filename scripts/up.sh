#!/bin/bash

docker-compose down || exit 1
./eureka-service/scripts/build.sh || exit 1
./user-service/scripts/build.sh || exit 1
./example-service/scripts/build.sh || exit 1
./gateway/scripts/build.sh || exit 1
docker-compose up -d || exit 1
