---
title: Module 5 — Decision Tables and DMN
description: Self-paced module on choosing DRL, decision tables or DMN and validating decision boundaries.
sidebar_position: 5
---

# Module 5 — Decision Tables and DMN

<div className="course-meta">

**Nominal effort:** 4–5 hours  
**Prerequisite:** Module 4  
**Evidence:** Lab 5 + decision-model tests

</div>

## Learning outcomes

- Select DRL, decision tables or DMN based on decision structure and audience.
- Explain DMN decision requirements and FEEL expressions at a practical level.
- Create tabular logic with coverage/overlap review.
- Test decision models with representative boundaries.

## Choose a representation deliberately

- **DRL** fits expressive rule interactions and fact-centric reasoning.
- **Decision tables** fit repetitive condition/action matrices reviewers naturally understand as policy tables.
- **DMN** fits explicit decision requirements, business-readable decision logic and portable decision-service models.

The best representation makes policy easiest to understand, validate, test and change without losing technical control.

## Decision tables

Define input columns, output/action columns, hit expectations and boundaries. Review uncovered combinations, overlap, defaults and null/missing-input behaviour.

## DMN

DMN is an OMG standard for operational decision modeling. A model can show input data, decisions and dependencies, with logic expressed using FEEL or decision tables.

Example chain: `Applicant data → Eligibility → Risk Band → Premium Adjustment → Decision`.

## Boundary testing

For an age threshold of 18, test 17, 18 and 19. For a band ending at 79, test 78, 79 and 80. Boundary tests reveal specification defects efficiently.

## Knowledge check

1. When is a decision table preferable to DRL?
2. What does a DMN decision-requirements view communicate?
3. Why are boundary tests essential?
4. What is the risk of hiding policy in Java helpers?

**Mastery target:** 80%.
