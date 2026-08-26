---
title: Publishing Checklist
description: Release gate for technical, instructional, accessibility and governance quality.
sidebar_position: 3
---

# Publishing Checklist

A release owner must complete this checklist for each public course version.

## Technical

- [ ] Drools baseline/version verified against current Apache KIE documentation.
- [ ] All lab projects execute from a clean environment.
- [ ] Docusaurus production build passes.
- [ ] Content validation script passes.
- [ ] Internal Markdown links and routes pass.
- [ ] No secrets or credentials are present.
- [ ] Dependency changes reviewed.

## Instructional design

- [ ] Outcomes use measurable performance verbs.
- [ ] Every course outcome has learning activity and assessment evidence.
- [ ] Labs contain goal, tasks, evidence and acceptance criteria.
- [ ] Final assessment blueprint matches stated outcomes.
- [ ] Capstone rubric is calibrated by a second reviewer.
- [ ] Estimated effort is checked against pilot learner evidence.

## Content

- [ ] Technical SME approves examples.
- [ ] Terminology is consistent.
- [ ] Deprecated Drools patterns are identified or removed.
- [ ] References are current.
- [ ] Legacy PDF content is not the sole source of required learning.

## Accessibility

- [ ] WCAG 2.2 AA review completed for representative pages and custom interactions.
- [ ] Keyboard navigation verified.
- [ ] Images/diagrams have alternatives.
- [ ] Media has captions/transcripts.
- [ ] Contrast/reflow/zoom checks completed.
- [ ] Accessibility defects are closed or accepted with remediation plan.

## Governance

- [ ] Course owner identified.
- [ ] Version/release date recorded.
- [ ] Next review date recorded.
- [ ] Changes summarized in `CHANGELOG.md`.
- [ ] Controlled assessment keys are not published in learner docs.
- [ ] Learner support/feedback channels are configured.
- [ ] Completion/certificate rules are configured in the host learning platform.
- [ ] Release approval recorded.

## Post-release

- [ ] Monitor learner completion and assessment difficulty.
- [ ] Review accessibility/support incidents.
- [ ] Review broken/external links.
- [ ] Analyse evaluation feedback.
- [ ] Open corrective actions for material defects.
