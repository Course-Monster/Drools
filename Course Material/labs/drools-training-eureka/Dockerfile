# Docker file for the Read Service
#
# Version 1.0.1-SNAPSHOT

# Java 17 Image
FROM openjdk:17-alpine

# install

# label for the image
LABEL Description="Eureka Server" Version="1.0.3-SNAPSHOT"

# the version of the archive
ARG VERSION=1.0.3-SNAPSHOT

# The port
EXPOSE 8762

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} quankee-engine-eureka-*.jar
ENTRYPOINT ["java","-jar","/quankee-engine-eureka-*.jar"]