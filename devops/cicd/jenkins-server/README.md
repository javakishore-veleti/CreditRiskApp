# CreditRiskApp Jenkins Server

A Docker container based Jenkins Server with pre-configured "SeedJob" Jenkins project to setup the CreditRiskApp codebase CI/CD pipeline project(s).

You can access this Jenkins Server (after Docker container running) at http://localhost:8080

## Seed Job Jenkins Project

- In this codebase, you find seedJob.xml. This is an XML configuration for a Jenkins Project, with name "seed-job"
- In Dockerfile, you find above seedJob.xml is copied as seed-job/config.xml inside Jenkins installation
- When you run Docker container and access Jenkins server at http://localhost:8080, you will find seed-job Jenkins project already created

## About pipelineJob.groovy


## About createJobs.groovy
