---
title: Troubleshooting Guide
description: Structured root-cause workflow for Drools lab and runtime failures.
sidebar_position: 3
---

# Troubleshooting Guide

## Build failure

Capture `java -version`, `mvn -version`, the full Maven error and `mvn dependency:tree`. Confirm the project uses the intended Drools release family and that the IDE is not silently running a different JDK.

## Rule compiles but does not fire

Check:

1. Is the expected fact inserted?
2. Does its runtime type match the pattern?
3. Do all constraints evaluate as expected?
4. Is a field null or differently normalized?
5. Is the rule in the expected KIE base/session?
6. Is an agenda/rule attribute suppressing execution?
7. Does the test actually execute/fire rules?

Reduce to one fact and one rule.

## Rule fires repeatedly

Look for a consequence updating a fact without moving it out of the condition. Add a stable transition/guard and test termination.

## Unexpected multiple matches

Search for overlapping rules and unconstrained joins. Record all matched rule names for the smallest reproducible input.

## Decision model boundary defect

Write three tests around the threshold: below, equal and above. Verify hit/overlap semantics and missing-input handling.

## CEP test is flaky

Replace real waiting with a controllable clock/test time source. Make event timestamps explicit and define ordering/replay/duplicate assumptions.

## Production-style incident worksheet

- correlation ID:
- application version:
- rule/model version:
- sanitized input class:
- expected outcome:
- actual outcome:
- first known bad version:
- reproducible test:
- root cause:
- corrective change:
- regression test:
- rollback/forward-fix decision:
