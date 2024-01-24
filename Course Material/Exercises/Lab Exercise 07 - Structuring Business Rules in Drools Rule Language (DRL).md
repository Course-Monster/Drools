**Lab Exercise 07: Structuring Business Rules in Drools Rule Language (DRL)**

**Objective:**

Convert the theoretical business rules created in the Lab Exercise 01 into structured Drools rules using the basic DRL syntax. This exercise will help you gain an understanding of how to structure rules in a rule engine, focusing on defining clear conditions (Left-Hand Side) and actions (Right-Hand Side).

**Prerequisites:**

- Completion of Lab Exercise 01 - Module 01 Practical Task
- Basic understanding of the Drools Rule Language (DRL) structure
- Familiarity with the concept of conditions and actions in rule-based systems

**Task Description:**

1. **Review Your Theoretical Rules:** Begin by reviewing the rules you created in Lab Exercise 01. Remember, these rules are currently in a theoretical format.
2. **Learn DRL Structure:** Understand the basic components of a DRL file:

- **Rule Name:** A unique identifier for each rule.
- **When (LHS):** The condition(s) part of the rule. It specifies the criteria that must be met for the rule to execute.
- **Then (RHS):** The actions part of the rule. It defines what actions to perform when the conditions are met.
- **End:** A keyword to signify the end of the rule.

4. **Convert to DRL Format:** For each of your theoretical rules, create a corresponding DRL rule. Ensure each rule has:

- A clear **Rule Name**.
- Defined **Conditions** in the When (LHS) section.
- Specified **Actions** in the Then (RHS) section.
- An **End** statement to conclude the rule.

6. **Example Transformation:**

- Theoretical Rule: "If a customer purchases items worth more than 100, then apply a 10% discount."
- DRL Format:

```
        **rule** **"**Discount on Large Purchases"

        **when**

      $order : Order(total > 100)

        **then**

      $order.setDiscount(10);

               System.out.println("A discount of 10% is applied for purchases over 100.");

```
**end**

5. **Document Your Rules:** Create a document listing all your transformed rules. Clearly outline the Rule Name, LHS, RHS, and any assumptions or explanations needed.
6. **Justify Your Choices:** Briefly explain why you structured each rule in the way you did. Discuss the logic behind the conditions and actions you have chosen.