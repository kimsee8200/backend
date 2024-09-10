FROM ubuntu:latest
FROM bellsoft/liberica-openjdk-alpine:22
FROM openjdk:22-jdk
VOLUME /tep

LABEL authors="user"
ARG JAR_FILE=../build/libs/projectForDeploy-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} "app.jar"

CMD ["./gradlew","clear","bulid"]
ENTRYPOINT ["java", "-jar","app.jar"]