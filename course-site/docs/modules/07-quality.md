---
title: Module 7 — Testing, Performance and Troubleshooting
description: Self-paced Drools module on automated verification, diagnostics, performance risks and root-cause analysis.
sidebar_position: 7
---

# Module 7 — Testing, Performance and Troubleshooting

<div className="course-meta">

**Nominal effort:** 4–5 hours  
**Prerequisite:** Module 6  
**Evidence:** Lab 7 + regression test

</div>

## Learning outcomes

- Build positive, negative, boundary and interaction tests.
- Use logs/listeners/diagnostics without business side effects.
- Identify broad joins, unbounded state and activation churn.
- Use a systematic defect-isolation workflow.

## Rule quality is executable evidence

Compilation proves syntax/packaging, not business correctness. Build tests for positive, negative, boundary, null/missing, interaction, repeated evaluation and regression cases.

## Testing levels

Use fast rule-level tests, integration tests for packaging/configuration, and a small number of critical end-to-end tests. Every production policy defect should become a regression test.

## Diagnostics

Use runtime event listeners/logging to understand activations while keeping diagnostic code simple and side-effect free.

## Performance

Watch for broad cross-products, expensive constraints, unnecessary updates, activation churn, unbounded sessions and excessive hot-path logging. Measure with representative data before optimizing.

## Defect isolation

1. Capture input and expected decision.
2. Pin versions.
3. Reduce to the smallest failing test.
4. Inspect matches/activations.
5. Verify fact lifecycle.
6. Check control mechanisms.
7. Fix the responsible policy/implementation.
8. Add regression evidence.

## Knowledge check

1. What does a compilation test fail to prove?
2. Why use representative facts for performance testing?
3. Why can unnecessary `update()` calls be expensive?
4. What is the value of one smallest failing test?

**Mastery target:** 80%.
