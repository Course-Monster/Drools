---
title: Module 1 — Decision Automation Foundations
description: Self-paced Drools course module 1 with concepts, examples, checks and practice guidance.
sidebar_position: 1
---

# Module 1 — Decision Automation Foundations

<div className="course-meta">

**Nominal effort:** 3–5 hours  
**Prerequisite:** Environment Setup  
**Evidence:** linked lab + knowledge-check responses

</div>

## Learning outcomes

By the end of this module, you can:

- Differentiate procedural control flow from declarative rule evaluation.
- Explain rules, facts, working memory, production memory, activations and agenda.
- Create and execute a minimal rule project.
- Recognize suitable and unsuitable rule-engine use cases.

## Why a rule engine?

A rule engine externalizes decision logic that would otherwise become scattered conditional code. The value is not simply “fewer `if` statements”; it is the ability to represent changing policy in a form that can be reviewed, tested, versioned and evaluated against facts.

A strong use case has explicit decision policy, frequent rule change, many interacting conditions, a need for explanation or business/technical collaboration, or a requirement to apply the same policy consistently across channels. A weak use case is a trivial deterministic transformation with no policy volatility.

## Core engine model

Drools evaluates **facts** against **rules**. Rules are stored in production memory. Facts are inserted into working memory. Matching conditions create activations coordinated through the agenda. A consequence can change state or derive new facts, potentially creating more matches.

Think: *declare what conditions make a rule applicable, then let the engine determine matches and execution according to runtime semantics.*

## First DRL

```text
package academy.pricing

rule "Flag high value order"
when
  $o : Order(total >= 10000)
then
  $o.setReviewRequired(true);
end
```

The left-hand side describes the pattern; the right-hand side describes the consequence. `$o` binds the matched fact.

## Design discipline

Use intent-revealing rule names. Keep conditions side-effect free and consequences small. Keep external I/O out of rule consequences; use application/service boundaries for network calls and durable side effects.

## Scenario

The course reuses the legacy repository's insurance theme with synthetic data. You will progressively automate eligibility, risk classification, premium adjustments and event-driven fraud indicators without processing real health or financial records.

## Knowledge check

1. Why is “many `if` statements” not by itself a sufficient reason to introduce Drools?
2. What changes in working memory can cause new activations?
3. Why should external REST calls normally not occur inside a rule consequence?
4. Describe one decision that benefits from traceable policy rules.

**Mastery target:** 4/4 with explanations in your own words.
