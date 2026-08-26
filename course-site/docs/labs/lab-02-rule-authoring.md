---
title: Lab 2 — Insurance Eligibility Rule Set
description: Hands-on lab 2 for the Drools self-paced course.
sidebar_position: 2
---

# Lab 2 — Insurance Eligibility Rule Set

## Goal

Implement a maintainable synthetic insurance eligibility rule set with joins and review controls.

**Expected effort:** 90–150 minutes.

## Tasks

1. Define synthetic `Applicant`, `PolicyRequest` and `Alert` facts.
2. Implement eligibility rules using explicit constraints and bindings.
3. Use `exists` or `not` where it better expresses intent.
4. Create a manual-review rule for open alerts.
5. Add a conflicting-policy test and resolve the ambiguity in the rule design.
6. Document one rejected design and why it was rejected.

## Required evidence

Retain source commit SHA, relevant rules, automated test output and `LAB-NOTES.md`.

## Acceptance criteria

- [ ] No real health/financial data.
- [ ] Rule overlap is intentional or eliminated.
- [ ] A join is constrained by a shared identifier.
- [ ] At least six automated tests.
- [ ] Consequences contain no network/database calls.

## Reflection

Explain the most important ambiguity you discovered and how tests made it visible.
