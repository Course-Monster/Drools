---
title: Environment Setup
description: Reproducible development environment for the Drools 10.2 labs.
sidebar_position: 4
---

# Environment Setup

## Baseline

Use JDK 17 or later, Apache Maven 3.9.6 or later, Git, an editor/IDE with Java support, and Drools / Apache KIE 10.2.0 dependencies for lab projects. The course uses a Maven-first workflow because it is reproducible and maps directly to the Java/Drools build model.

## Verify the workstation

```bash
java -version
mvn -version
git --version
```

Record the output in your learner notes.

## Minimal Maven version pattern

Pin the Drools release used for assessment evidence and manage versions centrally.

```xml
<properties>
  <maven.compiler.release>17</maven.compiler.release>
  <drools.version>10.2.0</drools.version>
</properties>
```

A production project should follow the Apache KIE 10.2 dependency guidance and should not silently mix release families.

## Clean-environment check

1. Create a disposable Maven project.
2. Run `mvn -q test`.
3. Confirm the IDE uses the same JDK as Maven.
4. Confirm the repository has no credentials.
5. Create a lab branch and make one test commit.

## Troubleshooting baseline

If Maven resolves incompatible artifacts, run `mvn dependency:tree`. If runtime behaviour differs from the course, confirm exact Drools/Java/Maven versions, run from a clean checkout, remove IDE-specific assumptions, and reduce the scenario to one fact and one rule.

## Lab safety

Use only synthetic data. Never store secrets in source, configuration, screenshots or logs. Do not expose a local development endpoint to the public internet merely to complete a course exercise.
