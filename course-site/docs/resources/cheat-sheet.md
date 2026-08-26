---
title: Drools Cheat Sheet
description: Compact reference for course labs and troubleshooting.
sidebar_position: 2
---

# Drools Cheat Sheet

## DRL pattern

```text
package academy.example

rule "Intent-revealing business rule"
when
  $fact : DomainFact(field >= 10)
then
  $fact.setOutcome("VALUE");
  update($fact);
end
```

## Condition reminders

- Bind a fact: `$a : Applicant(...)`
- Relate facts using a shared key.
- Use `exists` when only existence matters.
- Use `not` when absence is the condition.
- Guard state transitions to avoid loops.
- Treat broad joins as a performance warning.

## Test checklist

- positive match
- negative/no-match
- lower boundary
- exact boundary
- upper boundary
- null/missing input
- multi-rule interaction
- repeat/idempotency
- regression case

## Reproduction commands

```bash
java -version
mvn -version
mvn -q test
mvn dependency:tree
git status
git rev-parse HEAD
```

## Review questions

- What business statement does this rule represent?
- Could two rules write contradictory outcomes?
- Does the consequence contain hidden I/O?
- What causes this rule to stop matching?
- Which test proves the boundary?
- Which artifact/version produced the decision?
