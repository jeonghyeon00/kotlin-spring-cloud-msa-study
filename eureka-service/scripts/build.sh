#!/bin/bash

./gradlew eureka-service:bootJar || exit 1
docker build -t eureka-service ./eureka-service || exit 1