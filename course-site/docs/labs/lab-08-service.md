---
title: Lab 8 — Service-Ready Decision Component
description: Hands-on lab 8 wrapping a Drools decision behind a secure and observable application boundary.
sidebar_position: 8
---

# Lab 8 — Service-Ready Decision Component

## Goal

Wrap a Drools decision behind a clean application boundary with trace metadata and safe configuration.

**Expected effort:** 90–150 minutes.

## Tasks

1. Define a request/response contract using synthetic data.
2. Validate input before rule invocation.
3. Return outcome plus rule/model/application version metadata.
4. Keep external side effects outside rules.
5. Add structured logging without sensitive values.
6. Document rollout and rollback steps.

## Acceptance criteria

- [ ] Invalid input fails predictably.
- [ ] Decision version is traceable.
- [ ] Secrets are not in source.
- [ ] Rule assets are immutable in the built artifact.
- [ ] Rollback is documented.

## Required evidence

Source commit, automated tests, sample sanitized response and rollout/rollback runbook.
