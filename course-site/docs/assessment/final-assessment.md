---
title: Final Assessment
description: Summative knowledge and application assessment for the Drools self-paced course.
sidebar_position: 2
---

# Final Assessment

**Pass mark:** 75%  
**Recommended time:** 60 minutes  
**Format:** 20 selected/short-response items plus two scenario responses  
**Attempt policy:** defined by the publishing LMS; remediation should precede a retake.

The public course contains the assessment specification and sample-style prompts. The controlled item bank and marking key must remain outside the public Docusaurus content tree.

## Assessment blueprint

| Domain | Weight |
|---|---:|
| Engine concepts and DRL | 25% |
| Runtime, inference and execution | 20% |
| Decision models | 15% |
| CEP | 10% |
| Testing/troubleshooting | 15% |
| Integration/security/operations | 15% |

## Sample-style prompts

1. A quote API evaluates each request independently. Explain why stateless execution may be suitable.
2. A rule joins every `Applicant` to every `Policy`. Identify the likely defect and missing relationship.
3. A rule updates a fact and repeatedly reactivates itself. Give two design remedies.
4. Choose DRL, a decision table or DMN for a visible premium matrix and justify the choice.
5. A CEP test uses `Thread.sleep(600000)`. Explain why this is unsuitable and propose an alternative.
6. Identify four non-sensitive metadata fields that improve decision traceability.
7. Explain why rule assets require change control even when non-developers author them.
8. Describe minimum evidence proving a boundary bug is fixed.

## Scenario A

A decision service returns more “manual review” outcomes after a rule release. Describe the investigation sequence, evidence to collect and rollback conditions.

## Scenario B

A team proposes an HTTP fraud-check call inside a Drools consequence. Evaluate the design and propose a safer architecture.

## Remediation

Map missed items to outcomes, revisit the relevant module/lab evidence, then retake using a different controlled item set.
