---
title: Lab 3 — Compare Runtime Models
description: Hands-on lab 3 comparing stateless and stateful Drools execution.
sidebar_position: 3
---

# Lab 3 — Compare Runtime Models

## Goal

Implement the same simple decision with stateless and stateful execution and justify the production choice.

**Expected effort:** 90–150 minutes.

## Tasks

1. Create an independent quote decision suited to stateless execution.
2. Create a small evolving-case scenario where state changes over several steps.
3. Record lifecycle/disposal responsibilities.
4. Run tests appropriate to each design.
5. Write a one-page architecture decision record (ADR).

## Required evidence

Source commit, tests, ADR and learner notes.

## Acceptance criteria

- [ ] Choice is justified from state lifetime, not preference.
- [ ] Stateful facts are explicitly updated/retracted.
- [ ] Test isolation is clear.
- [ ] ADR identifies concurrency and failure/recovery implications.

## Reflection

What operational responsibility appears when state survives longer than one request?
