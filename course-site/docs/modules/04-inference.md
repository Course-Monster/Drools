---
title: Module 4 — Inference, Truth Maintenance and Execution Control
description: Self-paced Drools module on forward chaining, truth maintenance, agenda behaviour and loop prevention.
sidebar_position: 4
---

# Module 4 — Inference, Truth Maintenance and Execution Control

<div className="course-meta">

**Nominal effort:** 4–5 hours  
**Prerequisite:** Module 3  
**Evidence:** Lab 4 + interaction tests

</div>

## Learning outcomes

- Explain forward chaining and inference.
- Use logical insertion/truth maintenance conceptually and safely.
- Analyse agenda/conflict behaviour rather than assuming source order.
- Design tests that prove rule interaction.

## Forward chaining

A matched rule can change state, satisfy another rule and continue until no relevant activations remain or execution is controlled. This is inference. Test the rule set as a system, not only rule-by-rule.

## Truth maintenance

Truth maintenance links logically derived facts to the evidence supporting them. When support disappears, derived conclusions can be retracted. Use this only where derivation semantics are explicit.

## Conflict and agenda reasoning

Multiple rules can be eligible simultaneously. Do not assume visual file order is business ordering. Model and test essential control explicitly.

## Avoiding loops

A rule update can reactivate itself. Design stable transitions and state guards:

```text
rule "Classify unprocessed applicant"
when
  $a : Applicant(classification == null, riskScore >= 80)
then
  $a.setClassification("HIGH");
  update($a);
end
```

The null guard helps make the transition one-way.

## Interaction tests

Cover single-rule firing, cooperative multiple rules, conflict, evidence removal, repeated evaluation and termination/no-loop behaviour.

## Knowledge check

1. What is inference?
2. Why is source-file order a poor business control?
3. What problem does truth maintenance solve?
4. How can a state guard prevent a loop?

**Mastery target:** 80%.
