---
title: Lab 6 — Detect an Event Pattern
description: Hands-on lab 6 implementing bounded temporal reasoning with synthetic events.
sidebar_position: 6
---

# Lab 6 — Detect an Event Pattern

## Goal

Implement synthetic transaction-event detection over a bounded time period.

**Expected effort:** 90–150 minutes.

## Tasks

1. Create a transaction event with event time and amount.
2. Detect three qualifying events within a ten-minute window.
3. Use a controlled/pseudo clock in tests where supported by the chosen implementation.
4. Test late/duplicate assumptions explicitly.
5. Ensure a flagged account does not generate uncontrolled repeated alerts.

## Acceptance criteria

- [ ] Time source is documented.
- [ ] Window is bounded.
- [ ] Tests do not sleep for real time.
- [ ] Duplicate/replay policy is stated.
- [ ] Session/state lifecycle is bounded.

## Required evidence

Source commit, temporal tests, rule/model source and event-lifecycle note.
