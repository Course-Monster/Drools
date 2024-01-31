# **Folder for drools usecase lab**

To enhance your `Drools Lab.md` for the Drools UseCase lab, I'll add more detailed instructions, missing code snippets, and steps to make the README visually appealing and comprehensive. Let's start by structuring the document into clear sections, including prerequisites, setup instructions, build and deployment guides, Docker configurations, and case studies with Drools.
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

#### ☕ **JDK 17**


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

#### 🖼️ **Maven**

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

#### 🐳 **Docker**

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
---

>🚧 **Summary**
> By following these steps, you'll be able to build, deploy, and run your loan application processing components both locally and within Docker containers, providing a robust environment for development and testing.


---

