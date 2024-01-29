# **Folder for drools usecase lab**

# 1. Tech Stack
- Java 17
- 
- Docker
- Drools
- Spring Cloud
- Spring Boot
- PostgreSQL

# 2. Instructions
2.1 Install and Setup JDK 17
2.2 Install and Setup Maven 2
2.3 Install and Setup Docker


# 3. Build and deploy
# 3.1 Build each project
- mvn clean install

# 3.2 Run Eureka, Config Server and Gateway
- mvn spring-boot:run



# 4. Docker
# 4.1 Drools Training 
### Docker build ####
# 4.2 Eureka
docker build -t drools-training/drools-training-eureka:1.0.0-SNAPSHOT .
docker image tag drools-training/drools-training-eureka:1.0.0-SNAPSHOT
docker run -d --name drools-training-eureka --hostname drools-training-eureka -p 8761:8761 drools-training/drools-training-eureka:1.0.0-SNAPSHOT 

# 4.3 Config Server
docker build -t drools-training/drools-training-config-server:1.0.0-SNAPSHOT .
docker image tag drools-training/drools-training-config-server:1.0.0-SNAPSHOT
docker run -d --name drools-training-config-server --hostname drools-training-config-server -p 8888:8888 drools-training/drools-training-config-server:1.0.0-SNAPSHOT 
http://localhost:8888/drools-training-gateway/dev/latest

# 4.4 Gateway
docker build -t drools-training/drools-training-gateway:1.0.0-SNAPSHOT .
docker image tag drools-training/drools-training-gateway:1.0.0-SNAPSHOT
docker run -d --name drools-training-gateway --hostname drools-training-gateway -p 8000:8000 drools-training/drools-training-gateway:1.0.0-SNAPSHOT 

# 4.5 Insurance
docker build -t drools-training/drools-training-insurance:1.0.0-SNAPSHOT .
docker image tag drools-training/drools-training-insurance:1.0.0-SNAPSHOT
docker run -d --name drools-training-insurance --hostname drools-training-insurance -p 8001:8001 drools-training/drools-training-insurance:1.0.0-SNAPSHOT 


# Install PostgreSql Docker image
docker pull postgres
docker run --name drools-training-postgres -p 5431:5431 -e POSTGRES_USER=drools -e POSTGRES_PASSWORD=drools -e POSTGRES_DB=drools -d postgres

# from \Drools\Course Material\labs\drools-training-scripts\drools-training run the command:
- docker-compose up

# Componentes Urls
Eureka - http://localhost:8761/

# Case 1 - Life Insurance
 Rule "Checking Client Age for Elibility"
  when age < 18
  Then "Client is eligible for Life Insurance"
  End

Rule "Checking Amount of Life Insurance"
when salary >= 18000 and salary <= 50000
then life insurance amount = 1000000
else
when salary > 50000 and salary <= 100000
then life insurance amount = 5000000
else
life insurance amount = 5000000
# Case 2 - Loan Application
# Case 3 - ????

# References:
https://spring.io/projects/spring-cloud/
