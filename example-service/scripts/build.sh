#!/bin/bash

./gradlew example-service:bootJar || exit 1
docker build -t example-service ./example-service || exit 1