FROM ubuntu:latest
FROM bellsoft/liberica-openjdk-alpine:22
FROM openjdk:21-jdk
LABEL authors="user"

ARG JAR_FILE=/build/libs/*.jar
COPY ${JAR_FILE} app.jar


CMD ["./gradlew","clear","build"]
ENTRYPOINT ["java", "-jar","app.jar"]