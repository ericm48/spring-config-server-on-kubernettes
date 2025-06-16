FROM openjdk:17-jdk-slim
#FROM openjdk:11-jre-slim-buster
MAINTAINER Eric Manley
RUN apt-get update && apt-get install -y curl
WORKDIR /app
COPY /target/config-server-service-0.0.1-SNAPSHOT.jar /app/
ENTRYPOINT ["java", "-jar", "config-server-service-0.0.1-SNAPSHOT.jar"]