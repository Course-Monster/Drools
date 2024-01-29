# Docker file for the Read Service
#
# Version 1.0.1-SNAPSHOT

# Java 17 Image
FROM openjdk:17-alpine

# install

# label for the image
LABEL Description="Drools Training Gateway" Version="1.0.0-SNAPSHOT"

# the version of the archive
ARG VERSION=1.0.0-SNAPSHOT

# The port
EXPOSE 8000

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} drools-training-gateway-*.jar
ENTRYPOINT ["java","-jar","/drools-training-gateway-*.jar"]