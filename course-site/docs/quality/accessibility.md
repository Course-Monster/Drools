---
title: Accessibility and Inclusive Publishing
description: WCAG 2.2 AA authoring and QA requirements for the course.
sidebar_position: 2
---

# Accessibility and Inclusive Publishing

## Target

Learner-facing web content targets **WCAG 2.2 Level AA**.

## Authoring requirements

- Use headings in logical hierarchy.
- Give links meaningful text; avoid repeated “click here”.
- Provide text alternatives for informative images.
- Do not encode meaning by colour alone.
- Ensure tables have understandable headers and avoid layout tables.
- Provide captions/transcripts for instructional audio/video.
- Keep code examples available as selectable text.
- Explain diagrams in surrounding prose.
- Avoid timed interactions for ordinary learning content.
- Use plain language without removing necessary terminology.
- Expand acronyms at first use.

## Interaction requirements

- All site navigation/controls must be operable by keyboard.
- Focus must remain visible and not be obscured.
- Custom touch/click targets should satisfy WCAG 2.2 target-size expectations.
- Host-platform authentication should follow accessible-authentication criteria.
- Error messages must identify the error and recovery guidance.

## QA procedure before release

1. Build the production site.
2. Navigate every route keyboard-only.
3. Test responsive layouts at 320 px and common desktop widths.
4. Run automated accessibility scanning on representative page types.
5. Manually inspect headings, landmarks, link purpose, code and table semantics.
6. Verify captions/transcripts for media.
7. Check contrast for authored/custom styles.
8. Test zoom/reflow at 200–400% as applicable.
9. Record defects and corrective commits.
10. Retain the accessibility review with release evidence.

Automated scanning is necessary but not sufficient; manual testing remains required.
