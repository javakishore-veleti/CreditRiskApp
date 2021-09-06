# CreditRiskApp Jenkins Server

A Docker container based Jenkins Server with pre-configured "SeedJob" Jenkins project to setup the CreditRiskApp codebase CI/CD pipeline project(s).

You can access this Jenkins Server (after Docker container running) at http://localhost:8080

## Jenkins Plugins Installation

- In this codebase, you find plugins.txt. This text file contains all the additional plugins you like to automatically installed when the Docker based Jenkins Server is "up & running" for the first time

- In Dockerfile, you find above plugins.txt file is read and Jenkins Install Plugins command line tool is executed during this codegase Jenkins's Docker container image creation


![This codebase Jenkins Docker Image Creation](../docs/assets/images/jenkins_server_docker_build.png)


## Seed Job Jenkins Project

- In this codebase, you find seedJob.xml. This is an XML configuration for a Jenkins Project, with name "seed-job"

- In Dockerfile, you find above seedJob.xml is copied as seed-job/config.xml inside Jenkins installation

- When you run Docker container and access Jenkins server at http://localhost:8080, you will find seed-job Jenkins project already created

## About pipelineJob.groovy


## About createJobs.groovy
