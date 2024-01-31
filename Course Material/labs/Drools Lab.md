# **Folder for drools usecase lab**

To enhance your `lab.md` for the Drools UseCase lab, I'll add more detailed instructions, missing code snippets, and steps to make the README visually appealing and comprehensive. Let's start by structuring the document into clear sections, including prerequisites, setup instructions, build and deployment guides, Docker configurations, and case studies with Drools.
# Drools UseCase Lab Guide

This lab guide is designed to walk you through the setup, build, and deployment of a Drools-based project utilizing Java, Docker, Spring Cloud, Spring Boot, and PostgreSQL.

### 🛠 Tech Stack
- Java 17
- Docker
- Drools
- Spring Cloud
- Spring Boot
- PostgreSQL

### 📋 Prerequisites
Ensure you have the following installed:
- IntelliJ
- JDK 17
- Maven
- Docker
- Docker Compose (for orchestrating multiple containers)

### 🔧 Setup Instructions

Ensure your development environment is ready by installing JDK 17, Maven, and Docker. These tools are essential for building and running the loan application processing project.

---

JDK 17

To work with Java applications, JDK 17 is required. Here's how to set it up:

1. **Download JDK 17**:
   - Visit [AdoptOpenJDK](https://adoptopenjdk.net/) or your preferred JDK provider.
   - Select JDK 17 from the available versions.
   - Choose the appropriate installer for your operating system (Windows, macOS, Linux).

2. **Install JDK 17**:
   - Run the downloaded installer.
   - Follow the on-screen instructions to complete the installation.

3. **Configure `JAVA_HOME` and Update `PATH`**:
   - **Windows**:
     - Search for "Environment Variables" in the Start menu and select "Edit the system environment variables".
     - In the System Properties dialog, click "Environment Variables".
     - Under "System Variables", click "New" to add `JAVA_HOME` and point it to the JDK installation directory (e.g., `C:\Program Files\Java\jdk-17`).
     - Find the `Path` variable and add the JDK `bin` directory (e.g., `C:\Program Files\Java\jdk-17\bin`).
   - **macOS/Linux**:
     - Open your terminal.
     - Edit your shell profile file (e.g., `~/.bash_profile`, `~/.zshrc`, etc.).
     - Add `export JAVA_HOME=$(/usr/libexec/java_home -v 17)` and `export PATH=$JAVA_HOME/bin:$PATH`.
     - Save the file and run `source <profile-file>` to apply the changes.

---

**Maven**

Maven is a build automation tool used primarily for Java projects.

1. **Download Maven**:
   - Go to the [Apache Maven download page](https://maven.apache.org/download.cgi).
   - Download the latest version of Maven (zip or tar.gz).

2. **Extract Maven**:
   - Extract the downloaded archive to a location of your choice (e.g., `C:\apache-maven` on Windows or `/opt/apache-maven` on macOS/Linux).

3. **Update `PATH` Environment Variable**:
   - Follow similar steps as for setting `JAVA_HOME`, but add the Maven `bin` directory to your `PATH`.

4. **Verify Maven Installation**:
   - Open a new terminal or command prompt.
   - Execute `mvn -version` to verify that Maven is correctly installed and can be accessed from anywhere.

---

#### [[Docker]]

Docker is a platform for developing, shipping, and running applications inside lightweight containers.

1. **Download Docker Desktop**:
   - Visit [Docker Hub](https://hub.docker.com/) and download Docker Desktop for your operating system.

2. **Install Docker Desktop**:
   - Run the downloaded installer and follow the instructions to install Docker Desktop on your machine.

3. **Verify Docker Installation**:
   - Open a terminal or command prompt.
   - Run `docker --version` to ensure Docker was installed successfully.

4. **Launch Docker Desktop**:
   - Start Docker Desktop from your applications menu. On the first launch, it might ask for additional permissions or setup steps, especially on macOS and Windows.

---

After completing these setup instructions, your environment will be ready for developing and running Java applications, building projects with Maven, and creating and managing Docker containers for your applications.

---

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

---

# Case 1 - Life Insurance
### Lab Exercise Series: Understanding Drools with Health Insurance Scenario

These lab exercises are designed to guide delegates through understanding and using the Drools Rules Engine in the context of a Health Insurance scenario. Delegates will learn to define, manipulate, and extend rules for determining health insurance coverage based on various factors like salary, family size, health risk factors, and geographical location.

``` Rule
Rule "Checking Amount of Life Insurance"
when salary >= 18000 and salary <= 50000
then life insurance amount = 1000000
else
when salary > 50000 and salary <= 100000
then life insurance amount = 5000000
else
life insurance amount = 5000000
```

#### Exercise 1: Environment Setup
1. **Objective**: Set up your development environment for Drools.
2. **Tasks**:
   - Install JDK 17 and set `JAVA_HOME`.
   - Install Maven and configure the `PATH`.
   - Install Docker Desktop and verify the installation.
   - Install and set up IntelliJ IDEA or your preferred IDE.

#### Exercise 2: Maven Project Initialization
1. **Objective**: Create a new Maven project for the Health Insurance scenario.
2. **Tasks**:
   - Use `com.yourcompany.healthinsurance` as GroupId and ArtifactId.
   - Add Drools dependencies in `pom.xml`.

#### Exercise 3: Domain Model Creation
1. **Objective**: Define the `Applicant` Java class.
2. **Tasks**:
   - Create the `Applicant` class with properties like `salary`, `familySize`, `smoker`, `sedentaryLifestyle`, and `geographicalLocation`.
   - Implement getters, setters, and a constructor.

#### Exercise 4: Basic Drools Setup
1. **Objective**: Set up the Drools environment in your project.
2. **Tasks**:
   - Create a `kmodule.xml` file in `src/main/resources/META-INF`.
   - Set up a basic Drools session in a Java class.

#### Exercise 5: Writing Basic Coverage Rules
1. **Objective**: Write Drools rules for basic, enhanced, and premium health insurance coverage.
2. **Tasks**:
   - Create `HealthInsuranceRules.drl` in `src/main/resources`.
   - Implement the rules for coverage based on salary brackets.

#### Exercise 6: Rule Execution Service
1. **Objective**: Develop a service to execute Drools rules.
2. **Tasks**:
   - Create a `RuleService` class to load and execute rules from the `.drl` file.
   - Write a method to insert `Applicant` instances and fire rules.

#### Exercise 7: Extending Coverage Rules
1. **Objective**: Extend the insurance coverage rules to include family size and health risk factors.
2. **Tasks**:
   - Add rules in `HealthInsuranceRules.drl` for adjusting coverage based on family size and health risk factors like smoking and sedentary lifestyle.

#### Exercise 8: Geographical Adjustment Rules
1. **Objective**: Implement rules for adjusting insurance coverage based on geographical location.
2. **Tasks**:
   - Write rules in `HealthInsuranceRules.drl` to adjust coverage for applicants living in high-cost and low-cost areas.

#### Exercise 9: Testing with Different Scenarios
1. **Objective**: Test the Drools rules with various applicant scenarios.
2. **Tasks**:
   - Create unit tests in `src/test/java` for the `RuleService`.
   - Test different combinations of salary, family size, lifestyle choices, and geographical locations.

#### Exercise 10: Rule Management and Optimization
1. **Objective**: Learn best practices for managing and optimizing Drools rules.
2. **Tasks**:
   - Explore strategies for organizing `.drl` files and rules.
   - Learn about rule attributes like `salience`, `agenda-group`, and `no-loop` to optimize rule execution.

### Deliverables for Each Exercise:
- **Code**: Complete the coding tasks as specified.
- **Documentation**: Document your approach, key learnings, and any challenges faced.
- **Reflection**: Reflect on how Drools can be applied to other scenarios and its impact on decision automation.

By completing these exercises, delegates will gain hands-on experience with Drools, from setting up the environment to writing complex rules for a real-world application, testing, and optimizing rule execution.

---


# Case 2 - Loan Application
# Case 3 - ????

# References:
https://spring.io/projects/spring-cloud/
