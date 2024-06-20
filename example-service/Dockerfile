FROM amazoncorretto:17
ADD ./build/libs/example-service.jar app.jar
ENTRYPOINT ["java","-Dspring.profiles.active=docker", "-jar","app.jar"]