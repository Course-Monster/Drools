# Case 1 - Health Insurance
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

>[!NOTE]
By completing these exercises, delegates will gain hands-on experience with Drools, from setting up the environment to writing complex rules for a real-world application, testing, and optimizing rule execution.

---

## 📖 References
- [Spring Cloud](https://spring.io/projects/spring-cloud/)

---

> !Attention
> 
> Feel free to enhance this guide further with additional cases, detailed setup instructions, or troubleshooting tips to make the lab session as informative and engaging as possible.


---


