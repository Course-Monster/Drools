# Docker file for the Read Service
#
# Version 1.0.0-SNAPSHOT

# Java 17 Image
FROM openjdk:17-alpine

# install

# label for the image
LABEL Description="Drools Training Eureka Server" Version="1.0.0-SNAPSHOT"

# the version of the archive
ARG VERSION=1.0.0-SNAPSHOT

# The port
EXPOSE 8761

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} drools-training-eureka-*.jar
ENTRYPOINT ["java","-jar","/drools-training-eureka-*.jar"]