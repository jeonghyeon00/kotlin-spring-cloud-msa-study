FROM amazoncorretto:17
ADD ./build/libs/gateway.jar app.jar
ENTRYPOINT ["java","-Dspring.profiles.active=docker", "-jar","app.jar"]