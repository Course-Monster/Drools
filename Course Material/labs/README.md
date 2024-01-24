 README.md for Drools Labs


# **Folder for drools usecase lab**

# Tech Stack
- Docker
- Drools
- Spring Cloud
- Spring Boot
- PostgreSQL

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


> [!BOASTING]
> 
>![th](https://github.com/Course-Monster/Drools/assets/126121348/4751eabb-12c6-40c9-a7e2-def23cee0408)
>
> 
> Raydo's got some skills. lol. Thanks ChatGPT 
> 



## Comprehensive Guide for Practical Scenarios in Drools
Welcome to the Drools Labs repository! This guide offers hands-on experience in implementing Drools rules across various real-world scenarios, providing you with practical insights and knowledge.

### Table of Contents

1. [Loan Processing Rules](#loan-processing-rules)
2. [Life Insurance Calculation](#life-insurance-calculation)
3. [Commodities and Futures Contracts Rules](#commodities-and-futures-contracts-rules)

---

## 1. Loan Processing Rules

### Overview

In this lab, we explore the creation of Drools rules for a loan processing system, focusing on debt, annual salary, and credit score.

### Lab Exercises

#### Rule Implementation in Drools for Loan Processing

##### Debt-to-Loan Ratio Rule

**Objective:** Reject applications if the loan amount exceeds twice the existing debt.

**Drools Rule:**

``` drools

rule "Debt to Loan Ratio"
when
    $application : LoanApplication(loanAmount > (existingDebt * 2))
then
    $application.setApplicationStatus("Rejected: High Debt-to-Loan Ratio");
    retract($application);
end

```

##### Annual Salary Rule

**Objective:** Deny applications if the applicant's salary is below $50,000.

**Drools Rule:**
``` drools

rule "Annual Salary Check"
when
    $application : LoanApplication(applicant.getAnnualSalary() <= 50000)
then
    $application.setApplicationStatus("Rejected: Low Annual Salary");
    retract($application);
end

```

##### Credit Score-Based Rate Assignment

**Objective:** Determine loan rates based on the applicant's credit score.

**Drools Rule:**

```drools

rule "Assign Loan Rate Based on Credit Score"
when
    $application : LoanApplication(applicant.getAnnualSalary() > 50000, loanAmount <= (existingDebt * 2))
    $creditScore : CreditScore(score > 0)
then
    // Example rate assignment
    if ($creditScore.getScore() >= 750) {
        $application.setLoanRate(0.05);
    } else if ($creditScore.getScore() >= 650) {
        $application.setLoanRate(0.07);
    } else {
        $application.setLoanRate(0.10);
    }
    retract($application);
end

```

### Notes on Implementation
- Rules start with `rule "Rule Name"` and conclude with `end`.
- The `when` part defines rule conditions.
- The `then` part describes the actions upon condition fulfillment.
- `retract($application)` removes processed applications.
- Customize the loan rate logic as needed.

### Guidance for Next Steps
1. **Testing the Rules:** Implement unit tests for rule verification.
2. **Application Integration:** Integrate these rules into the loan processing system.
3. **Performance Monitoring:** Regularly review and adjust rules based on real-world data and feedback.

#### Test Scenarios
- **High Debt Scenario:** Applications with loan amounts greatly exceeding existing debt.
- **Low Salary Scenario:** Applicants with salaries below the set threshold.
- **Qualified Applicant Scenario:** Evaluate rate assignments for applicants meeting criteria.

### Expected Output
- **High Debt Scenario:** Rejection due to high debt ratio.
- **Low Salary Scenario:** Rejection due to insufficient salary.
- **Qualified Applicant Scenario:** Assigned loan rates based on credit score.

### Additional Scenarios
1. **Multiple Loans:** Handling applicants with various debts.
2. **Borderline Salary:** Assessing near-threshold salary cases.
3. **Diverse Credit Scores:** Rate assignments for varied credit scores.

---

## 2. Life Insurance Calculation

### Overview

This lab addresses the development of rules for calculating life insurance premiums, taking into account age, health, lifestyle, and risk factors.

### Lab Exercises

#### Rules for Life Insurance Premium Calculation in Drools

##### Premium Calculation Based on Age

**Objective:** Set insurance premiums according to age groups.

**Drools Rule Example:**

``` drools

rule "Age-Based Premium Calculation"
when
    $applicant : InsuranceApplicant(age >= 18 && age < 25)
then
    setPremium(standardPremium * 1.1); // For ages 18-24
end

rule "Senior Age Premium Increase"
when
    $applicant : InsuranceApplicant(age >= 50)
then
    setPremium(standardPremium * 1.5); // For senior ages
end

```

##### Health Condition Adjustment

**Objective:** Modify premiums based on health conditions.

**Drools Rule Example:**

``` drools

rule "Health Condition Premium Adjustment"
when
    $applicant : InsuranceApplicant(healthConditions contains "diabetes")
then
    increasePremiumBy(0.2); // 20% increase for diabetes
end

```

##### Lifestyle Factor Influence

**Objective:** Alter premiums for lifestyle choices like smoking.

**Drools Rule Example:**

``` drools

rule "Smoking Premium Adjustment"
when
    $applicant : InsuranceApplicant(isSmoker == true)
then
    increasePremiumBy(0.3); // 30% increase for smokers
end

```

##### Family Medical History Consideration

**Objective:** Further adjust premiums based on family health history.

**Drools Rule Example:**

``` drools

rule "Family History Premium Adjustment"
when
    $applicant : InsuranceApplicant(familyMedicalHistory includes "heart disease")
then
    increasePremiumBy(0.15); // 15% increase for family heart disease
end

```

### Guidance for Next Steps
1. **Rule Expansion:** Broaden rules to encompass more scenarios.
2. **Accuracy Testing:** Validate rules through comprehensive testing.
3. **Real-world Application:** Apply rules in practical settings for validation.

#### Risk Assessment Rules
- Create rules assessing overall risk from combined factors.
- Classify insurance policies into risk categories like low, medium, or high.

#### Scenario Testing
- Simulate various customer profiles for premium calculation accuracy.
- Validate premium and risk assessments across diverse scenarios.

### Expected Output
- **Age-Based Premiums:** Display premiums for different age groups.
- **Health-Condition Adjustments:** Show adjusted premiums for health issues.
- **Lifestyle Factor Influence:** Reflect premium changes for lifestyle choices.
- **Family Medical History:** Additional premium adjustments for hereditary health risks.
- **Overall Risk Category:** Display risk categories based on comprehensive assessments.

### Additional Scenarios
1. **Youth with High-Risk Hobbies:** Assess premiums for young, high-risk individuals.
2. **Seniors in Good Health:** Evaluate premiums for older, healthy individuals.
3. **Chronic Disease Family History:** Examine premium adjustments for hereditary diseases.

---

## 3. Commodities and Futures Contracts Rules

### Overview

Explore the creation and application of Drools rules for commodities and futures contracts, focusing on validity and compliance.

### Lab Exercises

#### Contract Validation Rules

1. **Terms Validation:**
   - Develop rules to ensure contract terms like duration, commodity type, quantity, and price are appropriate.

2. **Counterparty Eligibility:**
   - Implement rules to verify counterparty eligibility based on credit score and reputation.

#### Compliance Check

1. **Regulatory Adherence:**
   - Create rules ensuring contracts comply with financial regulations and trading limits.

2. **Reporting Compliance:**
   - Develop rules to meet mandatory reporting standards.

#### Scenario Testing

### Drools Rules for Commodities and Futures Contracts

##### Contract Validation Rules

**Objective:** Ensure contract terms are within acceptable limits.

**Drools Rule Example:**

``` drools

rule "Contract Terms Validation"
when
    $contract : FuturesContract(
        duration <= 12, 
        commodity in ("gold", "oil", "wheat"), 
        quantity > 0, 
        price > 0)
then
    System.out.println("Contract is valid.");
end

```

##### Counterparty Eligibility

**Objective:** Confirm that counterparties meet credit and reputation criteria.

**Drools Rule Example:**

``` drools

rule "Counterparty Eligibility"
when
    $contract : FuturesContract(
        counterparty.getCreditScore() >= 700,
        counterparty.getReputation() >= 4)
then
    System.out.println("Counterparty is eligible.");
end

```

##### Regulatory Compliance

**Objective:** Check for adherence to market manipulation laws and trading volume limits.

**Drools Rule Example:**

``` drools

rule "Regulatory Compliance Check"
when
    $contract : FuturesContract(
        isCompliantWithMarketManipulationLaws(),
        tradingVolume <= getRegulatoryTradingLimit())
then
    System.out.println("Contract is compliant with regulatory standards.");
end

```

##### Reporting Compliance

**Objective:** Ensure contracts comply with reporting standards.

**Drools Rule Example:**

``` drools

rule "Reporting Compliance"
when
    $contract : FuturesContract(reportsSubmitted == true)
then
    System.out.println("Contract meets reporting requirements.");
end

```

### Guidance for Next Steps
1. **Rule Development and Testing:** Ensure all rules are thoroughly tested.
2. **Scenario Analysis:** Design diverse scenarios to test rule effectiveness.
3. **Outcome Evaluation:** Critically evaluate results to enhance rule accuracy.

### Expected Output
- **Standard Contracts:** Confirmation of validity and compliance.
- **High-Risk Counterparties:** Notifications based on risk assessment.
- **Regulatory Breaches:** Alerts for non-compliance issues.

### Additional Scenarios
1. **Diverse Commodities:** Evaluate contracts with different commodities.
2. **International Contracts:** Test cross-border contracts for compliance.
3. **Market Volatility:** Assess contracts under fluctuating market conditions.

---

### Guidance
