# **Folder for drools usecase lab**

# Tech Stack
- Java 17
- 
- Docker
- Drools
- Spring Cloud
- Spring Boot
- PostgreSQL

# Instructions
1. Install and Setup JDK 17
2. Install and Setup Maven 2
3. Install and Setup Docker


# Build and deploy
- mvn clean install

# Docker

# Install PostgreSql Docker image
docker pull postgres
docker run --name drools-training-postgres -p 5432:5432 -e POSTGRES_USER=drools -e POSTGRES_PASSWORD=drools -e POSTGRES_DB=drools -d postgres

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
