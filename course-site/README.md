# Drools Self-Paced Course Site

Canonical learner-facing course source.

## Local use

```bash
cd course-site
npm install
npm run validate:content
npm run build
npm start
```

Docusaurus 3.10.2 requires Node.js 20 or later.

## Content boundaries

- `docs/` — public learner material.
- `instructor-notes/` — controlled assessor/SME guidance; not routed by Docusaurus.
- `governance/` — course-design and evidence controls.
- `slides/` — editable Markdown slide source.
- repository `Course Material/` — preserved legacy material.

## Publishing

Production host: `https://drools.skunkworksacademy.com`.

The GitHub Actions workflow validates structure and builds the static site. Deployment should be enabled only after branch protection, domain/DNS and release approval are confirmed.
