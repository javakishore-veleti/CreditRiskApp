# Credit Risk Application
The purpose of this project is to adapt MicroServices to Credit Risk domain. This is a simple application with each Microservice exposing REST API end points that returns various products related to Credit Risk solutions.

# Table of contents
1. [Project Primary Focus](#project-primary-focus)
2. [Multiple MicroServices Projects setup](#multiple-microservices-projects-setup)
3. [Tools Versions](#tools-versions)
4. [Maven Projects creation](#maven-projects-creation)
5. [Jenkins Server Docker Container](#jenkins-server-docker-container)

# Project Primary Focus <a name="project-primary-focus"></a>
The primary focus of this project is more on technology than on Credit Risk domain. So, the technology focused aspects in this codebase are:
- MicroServices design patterns
- Java 8 Streams / Functional Programming
- Kafka streaming architecture
- CI/CD DevOps practices like Jenkins, Azure DevOps, Kubernetes
- Serverless technologies, Functions As a Service
- Cloud services like AWS, GCP, Azure and more.
- Angular, React, JWT

# Multiple MicroServices Projects setup <a name="multiple-microservices-projects-setup"></a>
This codebase have following Microservices
- creditrisk-advisory-service
- creditrisk-creditsearch-service
- creditrisk-modeling-service

## Tools Versions <a name="tools-versions"></a>
Following tools and versions are used to create and maintain this codebase:

| Tool Name        		| Version           | Commands           	| Additional Notes   							|
| ---------------- 		|-------------------| ----------------------|-----------------------------------------------|
| Java JDK     	   		| 11                | 						|  					 							|
| Apache Maven     		| 3.8.1             | 						|  https://www.baeldung.com/maven-wrapper		|
| mvnw Maven Wrapper 	|               	|  						|												|
| Eclipse IDE      		| 2021-06 (4.20.0)  | 						|  					 							|
| Jenkins Server   		| 2.249.1  		   	| 						|  					 							|
| Docker   		   		| 	     		   	| 						|  					 							|
| Spring Boot   		| 2.5.4	     		| 						|  					 							|
| H2 Database Server 	| 1.4.200	     	| 						|  					 							|

## Maven Projects creation <a name="maven-projects-creation"></a>
- Created Eclipse Working Set for each of the Microservice
- Using Eclipse -> New Project -> Maven -> maven-archetype-quickstart, created all MicroServices Java projects
- After creating Maven projects, for each Microservice src/main/resources/application.properties files are created manually

#### Maven Wrapper (mvnw) commands
Below mvnw (Maven Wrapper) commands are executed only after the above MicroServices Maven projects created.


```sh

	cd CreditRiskApp
	mvn -N io.takari:maven:wrapper


	cd CreditRiskApp/microservices/creditrisk-modeling-service
	mvn -N io.takari:maven:wrapper	

	cd CreditRiskApp/microservices/creditrisk-advisory-service
	mvn -N io.takari:maven:wrapper	

	cd CreditRiskApp/microservices/creditrisk-creditresearch-service
	mvn -N io.takari:maven:wrapper	

```

![This codebase Maven workingsets](./docs/assets/images/eclipse_working_sets_maven_projects.png)


# Jenkins Server Docker Container <a name="jenkins-server-docker-container"></a>
In this codebase, a Docker container based Jenkins server is used.

## Automatic CreditRiskApp Jenkins Project setup
- Once Docker container based Jenkins server bash/shell scripts (in subfolders of this codebase - ./devops/cicd/jenkins-server) are executed, then you can accesss Jenkins server at http://localhost:8080
- Read more about Jenkins Server Job DSL feature usage for this codebase in README.md file at ./devops/cicd/jenkins-server/README.md



