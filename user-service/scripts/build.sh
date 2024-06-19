#!/bin/bash

./gradlew user-service:bootJar || exit 1
docker build -t user-service ./user-service || exit 1