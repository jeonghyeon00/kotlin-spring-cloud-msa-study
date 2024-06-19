#!/bin/bash

./gradlew gateway:bootJar || exit 1
docker build -t gateway ./gateway || exit 1