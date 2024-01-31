# Case 2: Automating Loan Application Processing with Drools

### Objective:
Learn to automate the decision-making process in loan applications using Drools. Understand how to structure and execute Drools rules, manipulate domain objects, and apply business rules to automate loan approvals and interest rate assignments.

### Prerequisites:
- JDK 1.8 or higher
- Maven
- An IDE (Eclipse, IntelliJ IDEA, or similar)
- Basic understanding of Java and Maven project structure
- Familiarity with Drools (optional)

### Tasks Overview:
1. **Setup and Configuration**
2. **Create Domain Model**
3. **Drools Rule Development**
4. **Integration with Java**
5. **Testing and Validation**

---

### Task 1: Setup and Configuration

#### 1.1 Initialize a Maven Project
- Open your IDE and create a new Maven project.
- Use `com.yourcompany` as GroupId and `loanapplicationprocessor` as ArtifactId.

#### 1.2 Configure Drools Dependencies
- Edit `pom.xml` to add dependencies for Drools and JUnit:
  - Drools Core, Compiler, and API
  - JUnit for testing

### Task 2: Create Domain Model

#### 2.1 Define `LoanApplication` Class
- In `src/main/java`, navigate to `com.yourcompany.loanapplication.model`.
- Create `LoanApplication.java` with properties: `creditScore`, `annualIncome`, `loanAmount`, `approved`, `interestRate`.
- Include getters, setters, and a constructor initializing these properties.

### Task 3: Drools Rule Development

#### 3.1 Create Drools Rule File
- In `src/main/resources`, create a `drools` folder.
- Add a file named `LoanRules.drl` and input the provided Drools rules.

#### 3.2 Understand and Analyze Rules
- Review each rule in `LoanRules.drl`, focusing on conditions (`when`) and actions (`then`).

### Task 4: Integration with Java

#### 4.1 Develop Drools Service
- Create a `DroolsService.java` in `com.yourcompany.loanapplication.service`.
- Implement methods to initialize Drools, load rules, and insert `LoanApplication` instances.

#### 4.2 Execute Rules within the Service
- Develop a method in `DroolsService` to execute rules for a given `LoanApplication` and update its status and interest rate.

### Task 5: Testing and Validation

#### 5.1 Create Test Cases
- Under `src/test/java`, create tests for `DroolsService` simulating various loan application scenarios.

#### 5.2 Execute and Observe
- Run the tests or a main application flow to process `LoanApplication` instances.
- Validate the results, ensuring the `approved` status and `interestRate` are set as expected by the rules.

### Expected Outcomes:
- Understand Drools rule structure and execution for business decision automation.
- Manipulate and evaluate `LoanApplication` objects using Drools.
- Apply Drools for automated decision-making in loan processing.

### Submission:
- Ensure your code is well-commented, especially within the `LoanRules.drl`.
- Document any assumptions or decisions you made during the exercise.

---
### Task 1: Setup and Configuration

This lab exercise aims to provide a hands-on experience with Drools, focusing on practical implementation for automating loan application decisions. Upon completion, delegates should have a foundational understanding of using Drools in real-world applications.

#### 1.1 Initialize a Maven project for the "Case 2: Loan Application" lab exercise, follow these detailed steps:

**Step-by-Step Instructions:**

**Step 1: Launch Your IDE**
- Start your preferred Integrated Development Environment (IDE) that supports Maven, such as IntelliJ IDEA, Eclipse, or Apache NetBeans.

**Step 2: Create New Project**
- Look for an option to create a new project. This is usually found under the "File" menu as "New" → "Project..." or something similar.

**Step 3: Select Project Type**
- In the project creation wizard, choose "Maven" as the type of project. If prompted to select a JDK for the project, make sure you select a version that is JDK 1.8 or higher.

**Step 4: Configure Project Metadata**
- When asked for GroupId, ArtifactId, and version, fill in the details as follows:
  - **GroupId**: `com.yourcompany`
    - This is usually used to identify your organization or group. It's common to use domain names in reverse.
  - **ArtifactId**: `loanapplicationprocessor`
    - This should be the name of your project. It's typically in lowercase and can include hyphens to separate words.
  - **Version**: Use the default version suggested by the IDE (usually `1.0-SNAPSHOT` or similar).

**Step 5: Project Naming and Location**
- You might be asked to name your project and choose a location on your computer to save it. Choose a meaningful name and a location where you can easily find your project later.

**Step 6: Finalize and Create**
- Review your settings, and if everything looks correct, finish the wizard to create the project. Your IDE will set up the project structure and a basic `pom.xml` file for you.

**Step 7: Open `pom.xml`**
- Once the project is created, navigate to the `pom.xml` file at the root of your project. You will use this file to add dependencies in the next steps.

### Tips:
- Ensure your IDE is configured with the correct JDK version. You can check this in the project structure or settings of your IDE.
- Familiarize yourself with the Maven project structure. The main code will reside in `src/main/java`, and resources like your Drools `.drl` files will go in `src/main/resources`.
- If you encounter any issues creating the project, consult the documentation for your specific IDE or look for online tutorials that provide a step-by-step guide for setting up a Maven project.

> [!Summary]
> By completing these steps, you'll have a Maven project ready for developing the loan application processor using Drools.

---
### Task 2: Drools Rule Development

#### Step 2.1: Create the Drools Rule File
- In `src/main/resources`, create a folder named `drools`.
- Inside the `drools` folder, create a file named `LoanRules.drl`.
- Copy the provided `LoanRules.drl` content into this file.

#### Step 2.2: Understand the Rules
- Review each rule in the `LoanRules.drl` file, noting the conditions under `when` and the actions under `then`.
- Pay special attention to how the `LoanApplication` properties are used to make decisions.

### Task 3: Integration with Java

#### Step 3.1: Develop the Drools Service
- Create a package `com.yourcompany.loanapplication.service`.
- Inside this package, create a class `DroolsService` with methods to initialize the Drools session, load rules, and execute them.

#### Step 3.2: Implement Methods for Rule Execution
- Implement a method `executeLoanRules` that takes a `LoanApplication` object, inserts it into the session, fires all rules, and then disposes of the session.

### Task 4: Testing and Validation

#### Step 4.1: Create Test Cases
- Under `src/test/java`, mirror your main package structure and create test cases for `DroolsService`.
- Test various `LoanApplication` scenarios, such as different credit scores and income levels.

#### Step 4.2: Execute and Validate
- Run the tests or a main class that creates `LoanApplication` instances with different data sets.
- Observe the console output or use a debugger to see how each rule is applied.
- Validate that the `approved` status and `interestRate` are set as expected based on the rules.


> [!Tips]
> - Ensure your IDE is configured with the correct JDK and Maven settings.
> - Use online Drools documentation and forums for additional help on rule syntax and best practices.
> - Regularly check the console output and IDE debugger to understand how rules are being applied during execution.

---

#### Expected Outcomes:
- Understand how Drools rules are structured and executed.
- Learn to manipulate and evaluate domain objects using Drools.
- Gain insights into decision automation for business processes, specifically for loan application processing.
##### 1. Understanding Drools Rule Structure and Execution

- **Rule Syntax**: You'll become familiar with the basic syntax of Drools rules, including the `when` (condition) and `then` (action) parts.
- **Rule Execution**: Gain an understanding of how Drools rules are fired based on the data provided, and how the rule engine evaluates conditions to execute the corresponding actions.
- **Knowledge Sessions**: Learn how to create and manage Drools knowledge sessions, which are essential for inserting facts (like `LoanApplication` instances) and firing rules.

##### 2. Manipulating and Evaluating Domain Objects with Drools

- **Domain Model Interaction**: Through the `LoanApplication` model, you'll see firsthand how Drools rules can read from and write to the properties of Java objects.
- **Dynamic Decision Making**: Experience how changes to domain object properties within Drools rules (such as setting `approved` status or `interestRate`) can dynamically alter the flow of your application logic based on business rules.

##### 3. Insights into Decision Automation for Business Processes

- **Automated Decision Making**: Understand the power of using a rules engine like Drools for automating complex decision-making processes, reducing the need for lengthy if-else blocks or switch cases in your code.
- **Business Rule Management**: Learn the importance of externalizing business rules from application code, allowing for easier updates and management of business logic without the need for recompilation.
- **Scalability and Maintenance**: Appreciate how maintaining business rules in a centralized repository (like a `.drl` file) can simplify the process of updating business logic as requirements change, making your application more adaptable and easier to maintain.

##### Additional Learning Outcomes

- **Integration Skills**: By integrating Drools with a Java application, you'll enhance your ability to incorporate third-party libraries and frameworks into your projects.
- **Testing and Debugging**: Through writing test cases and validating rule execution, you'll sharpen your testing and debugging skills, which are crucial for software development.
- **Problem-Solving**: This exercise will also enhance your problem-solving skills as you figure out how to represent complex business logic as a set of declarative rules and debug issues when rules don't fire as expected.

By the end of this lab exercise, you should feel comfortable working with Drools to manage and execute business rules and understand how rule engines can be leveraged to automate business decisions within software applications.

#### Additional Challenges:
- Extend the `LoanApplication` model to include more attributes, such as employment status or existing debts, and update the rules to consider these new attributes.
- Implement a basic front-end form to submit loan applications and display the evaluation results dynamically.

#### Submission Guidelines:
- Ensure your project is well-documented, including comments in the `LoanRules.drl` to explain rule logic.
- Prepare a brief report summarizing your approach, challenges faced, and how you resolved them.

This structured exercise will help delegates apply Drools Rules Engine to a practical problem, reinforcing their understanding of rule-based systems and their applications in real-world scenarios.

**Provided steps and Drools rules for processing loan applications.**

For the Loan Application use case in the Drools rules engine, we'll design a scenario where the system evaluates loan applications based on the applicant's credit score, income, and requested loan amount. The rules will determine whether the application is approved, and if so, at what interest rate.

**Let's plan this out:**

1. **Input**: The system takes in details of the loan application, including applicant's name, credit score, annual income, and the amount requested for the loan.

2. **Rules**: 
   - Rule 1: Check if the credit score is above a certain threshold for eligibility.
   - Rule 2: Assess the risk based on the income and requested loan amount ratio.
   - Rule 3: Determine the interest rate based on the risk level.

3. **Output**: The system outputs the decision on the loan application (Approved or Denied) and, if approved, specifies the interest rate.

### Directory Structure
For the loan application processing use case with Drools, the directory structure of the project can be organized as follows to ensure a clean separation of concerns and ease of navigation:

```
LoanApplicationProcessor/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   └── yourcompany/
│   │   │   │       └── loanapplication/
│   │   │   │           ├── controller/  # REST controllers to handle HTTP requests
│   │   │   │           ├── service/     # Service layer for business logic and Drools integration
│   │   │   │           ├── model/       # Domain models such as LoanApplication
│   │   │   │           └── config/      # Configuration classes, including Drools setup
│   │   │   │
│   │   │   └── resources/
│   │   │       ├── application.properties  # Spring Boot configuration file
│   │   │       └── drools/                 # Folder containing Drools rule files (.drl)
│   │   │           └── loan-rules.drl      # Drools rules for loan application processing
│   │   │
│   │   └── webapp/
│   │       └── WEB-INF/  # Web application files, if necessary
│   │
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── yourcompany/
│       │           └── loanapplication/
│       │               ├── controller/  # Tests for REST controllers
│       │               └── service/     # Tests for service layer
│       │
│       └── resources/
│           └── drools/  # Test resources for Drools, if needed
│
├── pom.xml  # Maven project file for dependency management and build configuration
└── README.md  # Project documentation for setup, configuration, and usage instructions
```

### Key Components:

- **`controller/`**: This directory contains REST controllers that expose endpoints to accept loan applications, process them, and return decisions.

- **`service/`**: The service layer is responsible for the business logic, including initializing Drools sessions, applying rules to loan applications, and interpreting the results.

- **`model/`**: Here, you define your domain models such as `LoanApplication`, which includes properties like `creditScore`, `annualIncome`, `loanAmount`, and `approvalStatus`.

- **`config/`**: Configuration classes, including the setup for Drools (`KieSession`, `KieContainer`, etc.), database configurations, and any other Spring Boot configurations.

- **`resources/drools/`**: This folder contains the `.drl` files where you define your Drools rules. These rules are applied to loan applications to determine approval status and other decisions.

- **`test/`**: Contains unit and integration tests for your application, ensuring that your controllers, services, and Drools rules work as expected.

- **`pom.xml`**: Maven configuration file for managing project dependencies, plugins, and other configurations.

- **`README.md`**: A markdown file providing an overview of the project, setup instructions, how to run the application, and any other relevant information for users and contributors.

> This structure provides a solid foundation for developing a loan application processing system using Drools within a Spring Boot application, ensuring modularity, ease of maintenance, and scalability.


### Drools Rules Example (`LoanRules.drl`)

```drools
package com.yourcompany.loanapplication.rules

import com.yourcompany.loanapplication.model.LoanApplication

// Rule for checking credit score eligibility
rule "Check Credit Score Eligibility"
when
    LoanApplication(creditScore < 650)
then
    System.out.println("Loan Application Denied: Credit score too low.");
    application.setApproved(false);
end

// Rule for assessing loan amount based on annual income
rule "Assess Loan to Income Ratio"
when
    $application: LoanApplication(loanAmount / annualIncome > 0.5)
then
    System.out.println("Loan Application Denied: Loan to income ratio too high.");
    $application.setApproved(false);
end

// Rule for determining interest rate
rule "Determine Interest Rate"
when
    $application: LoanApplication(approved == true, creditScore >= 650 && creditScore < 750)
then
    System.out.println("Loan Application Approved: Standard Interest Rate Applied.");
    $application.setInterestRate(5.0);  // Standard interest rate
end

rule "Determine Interest Rate for High Credit Score"
when
    $application: LoanApplication(approved == true, creditScore >= 750)
then
    System.out.println("Loan Application Approved: Reduced Interest Rate Applied.");
    $application.setInterestRate(3.5);  // Reduced interest rate for high credit scores
end
```

This setup includes rules for eligibility based on credit score, a check against high loan-to-income ratios, and setting interest rates based on creditworthiness. Each rule modifies the `LoanApplication` object, setting its `approved` status and `interestRate` as needed.

To proceed with coding, let's start with defining the `LoanApplication` model and the basic structure for the Drools configuration within the Spring Boot application. 

## LoanApplication Model

Let's start with defining the `LoanApplication` model. This Java class will hold the details of each loan application, including the applicant's credit score, annual income, loan amount requested, and the fields that will be set by our Drools rules, such as approval status and interest rate.

### Step 1: Define the LoanApplication Model

```java
package com.yourcompany.loanapplication.model;

public class LoanApplication {
    private String applicantName;
    private int creditScore;
    private double annualIncome;
    private double loanAmount;
    private boolean approved;
    private double interestRate;

    // Constructors, Getters, and Setters

    public LoanApplication() {
    }

    public LoanApplication(String applicantName, int creditScore, double annualIncome, double loanAmount) {
        this.applicantName = applicantName;
        this.creditScore = creditScore;
        this.annualIncome = annualIncome;
        this.loanAmount = loanAmount;
        this.approved = false; // Default value
        this.interestRate = 0.0; // Default value
    }

    // Getters and setters for all fields
}
```

### Step 2: Configure Drools within Spring Boot

Next, we'll set up the Drools configuration in our Spring Boot application. This involves creating a `KieContainer` bean that will be responsible for containing our knowledge base, including all our Drools rules.

```java
package com.yourcompany.loanapplication.config;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DroolsConfig {

    @Bean
    public KieContainer kieContainer() {
        return KieServices.Factory.get().getKieClasspathContainer();
    }
}
```

This configuration assumes that the Drools rule files (`*.drl`) are placed under `src/main/resources` in the appropriate package directory, which matches the package declared in the `.drl` files.

### Step 3: Create a Service to Apply Rules

Now, we'll create a service that applies our Drools rules to a given `LoanApplication` instance.

```java
package com.yourcompany.loanapplication.service;

import com.yourcompany.loanapplication.model.LoanApplication;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanApplicationService {

    private final KieContainer kieContainer;

    @Autowired
    public LoanApplicationService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public LoanApplication applyRules(LoanApplication application) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(application);
        kieSession.fireAllRules();
        kieSession.dispose();
        return application;
    }
}
```

This service injects the `KieContainer`, creates a new `KieSession` for each application, inserts the `LoanApplication` object into the session, and fires all rules. The `LoanApplication` object is then returned with the fields modified by the rules (e.g., `approved`, `interestRate`).

### Next Steps

- Implement a REST controller to accept loan applications and use the `LoanApplicationService` to process them.
- Add exception handling and validation to ensure that the application data is valid before processing.
- Write unit tests to cover various scenarios and rule outcomes.

This provides a solid foundation for your Drools-based loan application processing system. If you need further assistance with any of these components or additional functionalities, feel free to ask! 😄

---

## 📖 References
- [Spring Cloud](https://spring.io/projects/spring-cloud/)

> :warning: **ATTENTION**:
> Feel free to enhance this guide further with additional cases, detailed setup instructions, or >troubleshooting tips to make the lab session as informative and engaging as possible.
> 
---
