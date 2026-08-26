---
title: Lab 7 — Break, Diagnose and Repair a Rule Set
description: Hands-on lab 7 using test-first defect isolation and permanent regression evidence.
sidebar_position: 7
---

# Lab 7 — Break, Diagnose and Repair a Rule Set

## Goal

Use tests and diagnostics to find a deliberately introduced rule defect and create permanent regression evidence.

**Expected effort:** 90–150 minutes.

## Tasks

1. Introduce/select one realistic defect: boundary, overlap, missing update or broad join.
2. Capture the failing test first.
3. Use logs/listeners or activation evidence to localize the problem.
4. Repair the smallest responsible rule/model.
5. Add regression coverage.
6. Run the complete test suite.

## Acceptance criteria

- [ ] Failing evidence precedes the fix.
- [ ] Root cause is stated, not only the symptom.
- [ ] Regression test would fail if the defect returned.
- [ ] Diagnostic code does not add business side effects.

## Required evidence

Before/after commit references, failing/passing test output and root-cause note.
