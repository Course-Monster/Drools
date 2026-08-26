---
title: Capstone — Governed Decision Service
description: End-to-end performance assessment combining rules, decision modeling, testing and operational controls.
sidebar_position: 20
---

# Capstone — Governed Decision Service

## Scenario

Build a synthetic **commercial insurance quotation and review decision service**. It receives an applicant/request model, determines eligibility, calculates a risk band, applies a policy adjustment and produces a traceable decision. A small event component flags suspicious quote activity using synthetic events.

You may substitute another approved domain if it demonstrates the same outcomes.

## Required capabilities

1. At least one maintainable DRL rule set.
2. At least one tabular or DMN decision.
3. A justified runtime/session model.
4. An explicit inference or multi-rule interaction.
5. A bounded event/CEP rule.
6. Automated positive, negative, boundary and interaction tests.
7. A service/application boundary with input validation.
8. Version/trace metadata in the response.
9. Secure configuration with no embedded secrets.
10. A concise operational runbook and rollback plan.

## Required submission

- source repository/branch and commit SHA;
- `README.md` with architecture and local execution;
- requirements-to-test traceability table;
- automated test report;
- decision/rule inventory;
- architecture decision record;
- security/privacy checklist;
- operational runbook;
- 5–8 minute demonstration or equivalent platform evidence;
- final reflection.

## Rubric

| Criterion | Weight | Excellent | Competent | Not demonstrated |
|---|---:|---|---|---|
| Requirements and traceability | 10% | Complete bidirectional trace | Main requirements traced | Material gaps |
| Rule/model correctness | 20% | Clear, deterministic, boundary-safe | Meets stated policy | Incorrect/ambiguous |
| Drools architecture | 15% | Runtime model strongly justified | Appropriate and functional | Misused/uncontrolled state |
| Testing evidence | 20% | Deep positive/negative/boundary/interaction suite | Key cases covered | Insufficient evidence |
| Maintainability/explainability | 10% | Intent, naming and representation exemplary | Understandable | Opaque/fragile |
| Security/privacy | 10% | Threat-aware, minimal data, no secrets | Baseline controls present | Critical unsafe practice |
| Operations/observability | 10% | Versioned rollout/rollback + telemetry | Basic operational readiness | No operational plan |
| Communication/reflection | 5% | Clear, evidence-based | Adequate | Cannot explain work |

**Pass:** 70% overall and no critical failure in correctness, testing or security/privacy.

## Critical fail conditions

A submission cannot pass if it contains real sensitive learner/customer data, committed secrets, no executable verification, intentionally deceptive evidence, or a decision implementation the learner cannot explain.

## Assessor calibration

Assessors should use the private `instructor-notes/assessment-guide.md` and record comments against this rubric, not unstated preferences.
