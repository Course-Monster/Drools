---
title: Module 2 — DRL Rule Authoring
description: Self-paced Drools course module 2 with concepts, examples, checks and practice guidance.
sidebar_position: 2
---

# Module 2 — DRL Rule Authoring

<div className="course-meta">

**Nominal effort:** 4–5 hours  
**Prerequisite:** Module 1  
**Evidence:** Lab 2 + knowledge-check responses

</div>

## Learning outcomes

- Write readable DRL patterns, constraints and bindings.
- Use collections, logical composition and rule attributes deliberately.
- Separate domain intent from technical side effects.
- Review rule sets for ambiguity, overlap and maintainability.

## Rule anatomy

```text
rule "Adult applicant with standard risk"
when
  $a : Applicant(age >= 18, riskScore < 60)
then
  $a.setBand("STANDARD");
end
```

Constraints narrow matches. Bindings make matched objects available to later patterns or consequences.

## Constraint composition

Use explicit conditions a reviewer can reason about. If a rule represents regulatory/commercial policy, include a traceable policy identifier in metadata or comments. Consider overlap: two valid rules may match the same fact and create contradictory outcomes.

## `exists`, `not`, collections and joins

```text
rule "Require manual review for applicant with open alert"
when
  $a : Applicant($id : id)
  exists Alert(applicantId == $id, status == "OPEN")
then
  $a.setManualReview(true);
end
```

When joining fact types, constrain relationships. Broad patterns can create cross-products and performance problems.

## Consequence hygiene

Prefer consequences that update domain state or emit a decision result. Do not hide database access, HTTP calls, credential use or retry loops in consequences.

## Rule attributes

Salience and agenda grouping can control execution, but they should not substitute for a clear model. A web of numeric priorities is difficult to maintain. Where ordering is essential, document why and test it.

## Language level

Drools 10 includes newer language capabilities. Record the chosen language level and avoid mixing examples from incompatible documentation versions.

## Knowledge check

1. What problem can an unconstrained join create?
2. How does `exists` differ from binding every matching fact?
3. Why can extensive salience values become a maintenance smell?
4. How would you move an HTTP side effect outside a consequence?

**Mastery target:** 80%.
