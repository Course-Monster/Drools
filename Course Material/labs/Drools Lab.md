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
#### 🏗 Build and Deploy

**Building Projects**

To compile and package your Java projects, including the loan application processor, follow these steps:

1. **Open Terminal**:
   - Navigate to the root directory of each Maven project within your workspace.

2. **Execute Maven Build**:
   - Run the Maven build command to compile, test, and package your application:
     ```shell
     mvn clean install
     ```
   - This command cleans any existing compiled directories, compiles the source code, runs any tests, and packages the compiled code into a JAR or WAR file.

**Running Essential Services**

If your project includes Spring Boot applications like Eureka, Config Server, and Gateway, you can start each application with Maven:

1. **Navigate to Project Directory**:
   - Open a new terminal window for each project to keep them running simultaneously.
   - Change to the directory of the Eureka Server, Config Server, or Gateway application.

2. **Start Spring Boot Application**:
   - Use the Spring Boot Maven plugin to run the application:
     ```shell
     mvn spring-boot:run
     ```
   - Repeat this step for each project (Eureka, Config Server, and Gateway) in their respective directories.

**🐳 Docker Configuration**

**Setting Up Docker for Each Component**

To containerize and run your components, follow these Docker commands for each service:

**Drools Training Eureka**:

```shell
docker build -t drools-training/drools-training-eureka:1.0.0-SNAPSHOT .
docker run -d --name drools-training-eureka --hostname drools-training-eureka -p 8761:8761 drools-training/drools-training-eureka:1.0.0-SNAPSHOT
```

**Config Server**:

```shell
docker build -t drools-training/drools-training-config-server:1.0.0-SNAPSHOT .
docker run -d --name drools-training-config-server --hostname drools-training-config-server -p 8888:8888 drools-training/drools-training-config-server:1.0.0-SNAPSHOT
```

**Gateway**:

```shell
docker build -t drools-training/drools-training-gateway:1.0.0-SNAPSHOT .
docker run -d --name drools-training-gateway --hostname drools-training-gateway -p 8000:8000 drools-training/drools-training-gateway:1.0.0-SNAPSHOT
```

**Insurance Service**:

```shell
docker build -t drools-training/drools-training-insurance:1.0.0-SNAPSHOT .
docker run -d --name drools-training-insurance --hostname drools-training-insurance -p 8001:8001 drools-training/drools-training-insurance:1.0.0-SNAPSHOT
```

**PostgreSQL Setup**:

```shell
docker pull postgres
docker run --name drools-training-postgres -p 5432:5432 -e POSTGRES_USER=drools -e POSTGRES_PASSWORD=drools -e POSTGRES_DB=drools -d postgres
```

**Using Docker Compose**

For managing multi-container Docker applications, use Docker Compose:

1. **Create `docker-compose.yml`**:
   - In your project directory, create a `docker-compose.yml` file defining services, networks, and volumes.

2. **Start Services with Docker Compose**:
   - Run the following command in the directory containing your `docker-compose.yml`:
     ```shell
     docker-compose up
     ```

**🌐 Component URLs**

After deploying your services, access them using the following URLs:

- **Eureka Dashboard**: [http://localhost:8761/](http://localhost:8761/)

> [!Summary]
> By following these steps, you'll be able to build, deploy, and run your loan application processing components both locally and within Docker containers, providing a robust environment for development and testing.


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
