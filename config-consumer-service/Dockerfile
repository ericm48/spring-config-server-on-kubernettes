FROM openjdk:17-jdk-slim
MAINTAINER Eric Manley
RUN apt-get update && apt-get install -y curl
WORKDIR /app
COPY /target/config-consumer-service-0.0.1-SNAPSHOT.jar /app/
ENTRYPOINT ["java", "-jar", "config-consumer-service-0.0.1-SNAPSHOT.jar"]