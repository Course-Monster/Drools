---
title: Module 3 — KIE Runtime and Sessions
description: Self-paced Drools course module 3 covering KIE runtime, stateful/stateless sessions and Rule Units.
sidebar_position: 3
---

# Module 3 — KIE Runtime and Sessions

<div className="course-meta">

**Nominal effort:** 4–5 hours  
**Prerequisite:** Module 2  
**Evidence:** Lab 3 + architecture decision note

</div>

## Learning outcomes

- Explain KIE base/container/session responsibilities.
- Choose stateless versus stateful execution from requirements.
- Describe lifecycle obligations of a stateful session.
- Compare traditional KIE session and Rule Unit-oriented designs.

## Runtime layers

A KIE base represents compiled knowledge. A KIE session is the runtime context that accepts data and executes rules. Applications may work through KIE containers/sessions or newer Rule Unit-oriented APIs. The decision is based on runtime state and isolation, not API brevity.

## Stateless sessions

A stateless session fits validation, calculation, routing and filtering when requests are independent and no prior invocation state is required.

## Stateful sessions

A stateful session retains facts and supports iterative inference/event scenarios. Define session ownership, concurrency boundaries, fact update/retraction, disposal, memory bounds and recovery/persistence behaviour.

## Rule Units

Drools 10 supports Rule Unit style; official getting-started guidance recommends it for microservice/cloud-native-oriented applications. Treat it as an architectural option, not a mandatory rewrite of every KIE session application.

## Selection exercise

Choose and justify an execution model for:

- one independent insurance quote;
- transaction events correlated over a rolling period;
- a batch of independent validations;
- an evolving eligibility case with inserted/retracted evidence.

Your justification must mention state lifetime, concurrency, explainability and recovery.

## Knowledge check

1. Why is a long-lived stateful session an operational resource?
2. What does stateless execution simplify?
3. What evidence would justify a stateful design?
4. When might Rule Units be preferable?

**Mastery target:** 80%.
