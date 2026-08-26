# Drools Self-Paced Course Modernisation Audit

**Audit date:** 2026-08-26  
**Repository:** `skunkworks-academy/drools`  
**Target delivery:** Docusaurus static learning site at `drools.skunkworksacademy.com`  
**Course baseline:** Drools 10.2.0 / Apache KIE 10.2 documentation family

## Executive assessment

The repository contains valuable legacy instructor-led assets, including a substantial student handbook, day-based PDF slide decks, day-based lab PDFs, exercise folders, and insurance case-study material. The root course outline is explicitly framed as a three-day **Drools 8** course. This is useful source material, but it is not yet a publishable self-paced learning product.

The principal gaps are:

1. **Version drift** — the learning narrative is centred on Drools 8 while the current Apache KIE documentation family is Drools 10.2.0.
2. **Delivery-model mismatch** — content is organized around instructor-led “Day 1/2/3” delivery rather than asynchronous learning paths, learner pacing, mastery checks, remediation, and completion rules.
3. **Weak traceability** — objectives, activities, labs, assessments, and completion evidence are not linked through a formal outcome/assessment matrix.
4. **Assessment governance** — there is no formal blueprint, pass standard, retake/remediation policy, marking rubric, answer-key separation, or evidence-retention model.
5. **Accessibility evidence** — existing PDF-heavy delivery does not provide a WCAG 2.2 AA publishing baseline or a repeatable accessibility QA gate.
6. **Publishing controls** — there is no course-specific static-site build, structured metadata, automated link/content checks, release checklist, or versioned quality record.
7. **Learner support** — no self-paced orientation, expected workload, study strategy, troubleshooting route, accessibility statement, glossary, note templates, or progress model.
8. **Content lifecycle** — no documented SME review cadence, version support policy, change-control mechanism, or deprecation process for technical content.
9. **Legacy asset risk** — binary PDFs are difficult to diff, maintain, accessibility-test, and update. They should be retained as source evidence while canonical course content moves to text-first, version-controlled Markdown/MDX.
10. **Certification boundary** — a repository can be designed to support ISO-aligned evidence, but ISO conformity/certification is an organizational management-system determination and cannot be asserted by source code alone.

## Modernisation decision

Build a new `course-site/` Docusaurus learning layer while preserving `Course Material/` unchanged as legacy source material. The self-paced site becomes the canonical learner-facing source, with explicit standards mapping, version metadata, review controls, labs, formative checks, summative assessment, capstone rubric, learner notes, facilitator/assessor material, and slide source.

## Standards and frameworks used

The implementation is designed to support evidence relevant to:

- **ISO 21001:2025** — Educational organizations management systems; learner-centred design, competence development, inclusion, monitoring, and continual improvement.
- **ISO 29993:2017** — Learning services outside formal education; defined goals, learner information, learning-service delivery, assessment, and evaluation.
- **ISO/IEC 40180:2017** — Quality reference framework for ICT-enhanced learning.
- **ISO/PAS 25171:2026** — audit-oriented guidance for ISO 21001:2025 evidence and measures.
- **WCAG 2.2 Level AA** — stronger current web-accessibility target for the learner site.
- **Revised Bloom taxonomy** — measurable outcome verbs and cognitive progression.
- **Backward design / constructive alignment** — outcome → activity → evidence mapping.
- **SCORM/xAPI readiness** — interoperability hooks are documented, but no LMS package is claimed in this foundation release.

No claim of ISO certification or accredited status is made.

## Release gates before public launch

- Technical SME verifies Drools 10.2.0 examples and executes all labs from a clean environment.
- Independent instructional-design review checks outcome/assessment alignment.
- Accessibility review reaches WCAG 2.2 AA for authored pages and interactive elements.
- All external links and Docusaurus build checks pass.
- Assessment keys and lab solutions remain outside the public Docusaurus `docs/` tree.
- Course owner approves version, review date, support window, and change record.
- Learner evaluation and incident/support channels are configured in the target platform.
