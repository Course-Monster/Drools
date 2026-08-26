---
title: Module 6 — Complex Event Processing
description: Self-paced Drools module on events, stream reasoning, temporal constraints and bounded state.
sidebar_position: 6
---

# Module 6 — Complex Event Processing

<div className="course-meta">

**Nominal effort:** 4–5 hours  
**Prerequisite:** Module 5  
**Evidence:** Lab 6 + temporal tests

</div>

## Learning outcomes

- Distinguish state facts from occurrence events.
- Explain stream-oriented processing and temporal reasoning.
- Use windows/temporal constraints to express bounded event patterns.
- Identify operational risks in long-lived event sessions.

## Facts versus events

A fact often represents current state; an event represents something that occurred at a point/interval in time. CEP is valuable when a decision depends on what happened, when, and in what sequence/frequency.

## Stream reasoning

Temporal operators and windows allow bounded reasoning rather than retaining every event forever.

Example intent: flag an account when at least three high-value transactions occur within ten minutes and it is not already under review. Define timestamp source, threshold, bounded window, duplicate/replay behaviour and stable action semantics.

## Time semantics

Specify ingestion time vs event time vs test clock. Production systems must account for late, duplicate and out-of-order events. Tests should control time rather than sleep.

## Memory and lifecycle

Long-running sessions can accumulate state. Use expiration/window semantics and monitoring. A correct rule set that grows without bound is unsafe.

## Knowledge check

1. Why is a time window both business and resource-management policy?
2. What happens when duplicate events replay?
3. Why should tests control time?
4. How does CEP state differ operationally from a stateless quote decision?

**Mastery target:** 80%.
