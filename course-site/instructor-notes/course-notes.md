# Course Owner / SME Notes

## Technical baseline

- Course target: Drools / Apache KIE 10.2.0
- Minimum learner Java baseline: JDK 17+
- Maven baseline used in course setup: 3.9.6+
- Docusaurus: 3.10.2

## Legacy material policy

`Course Material/` remains a source archive. It contains a Drools 8 course outline, student handbook, day-based slide PDFs, lab PDFs and case material. Do not remove it until copyright, accessibility, technical currency and records-retention requirements have been reviewed.

Canonical learner content is `course-site/docs/`.

## SME review hotspots

Review these first after any Drools upgrade:

- Maven artifacts/dependencies and archetype guidance;
- DRL language-level changes;
- deprecated engine/MVEL patterns;
- Rule Unit APIs;
- DMN version support;
- CEP temporal APIs;
- Quarkus/integration guidance.

## Maintenance cadence

- link/build check: every change;
- content quality review: each release;
- technical baseline review: at least every 6 months;
- full course review: annually or on a major Drools release;
- immediate corrective review after a material learner/production defect.
