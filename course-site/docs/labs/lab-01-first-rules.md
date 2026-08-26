---
title: Lab 1 — Build and Explain Your First Rules
description: Hands-on lab 1 for the Drools self-paced course.
sidebar_position: 1
---

# Lab 1 — Build and Explain Your First Rules

## Goal

Create a small Maven-based Drools project that classifies synthetic orders and prove the result with tests.

**Expected effort:** 90–150 minutes.

## Tasks

1. Create a clean project pinned to Drools 10.2.0.
2. Model `Order` with `total`, `customerTier` and `reviewRequired`.
3. Write at least three rules with non-overlapping business intent.
4. Add positive, negative and boundary tests.
5. Run tests from the command line.
6. Explain which facts matched and why.

## Required evidence

Retain source commit SHA, rule/model files, automated test results and `LAB-NOTES.md` explaining design choices/problems.

## Acceptance criteria

- [ ] Project builds from a clean checkout.
- [ ] Rules have intent-revealing names.
- [ ] A 9,999.99 / 10,000 boundary is tested.
- [ ] Tests prove match and no-match cases.
- [ ] No credentials or external services are required.

## Reflection

In 100–200 words: what assumption did you test rather than believe, what changes before production, and which course outcome did this lab demonstrate?

## Integrity

Do not use instructor solution files while completing the lab. AI-generated code, if allowed by the publishing platform, must be reviewed, tested and explainable by you.
