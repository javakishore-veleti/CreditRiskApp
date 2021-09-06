# CreditRiskApp Jenkins Server

A Docker container based Jenkins Server with pre-configured "SeedJob" Jenkins project to setup the CreditRiskApp codebase CI/CD pipeline project(s).

You can access this Jenkins Server (after Docker container running) at http://localhost:8080

## Jenkins Plugins Installation

- In this codebase, you find plugins.txt. This text file contains all the additional plugins you like to automatically installed when the Docker based Jenkins Server is "up & running" for the first time

- In Dockerfile, you find above plugins.txt file is read and Jenkins Install Plugins command line tool is executed during this codegase Jenkins's Docker container image creation

## Jenkins Docker Image Creation

Execute below commands to create the Jenkins Docker image with this codebase additional Jenkins configuration and default Jenkins Seed Project creation.

```sh

# Assuming you are in the root folder of this Github project codebase i.e. CreditRiskApp folder

cd devops/cicd/jenkins-server

# Note: Below remove bash script might give error if you are running for the first time. This error because of non-availability of this codebase specific Jenkins Docker container or Docker Image
./jenkins_remove_docker.sh 

# Command to create this codebase specific Jenkins Docker Image with default Seed Project creation
./jenkins_build_docker.sh

# After executing below "run" script, you see a log "hudson.WebAppMain$3#run: Jenkins is fully up and running"
./jenkins_run_docker.sh

# Now open browser and access the Jenkins Server at http://localhost:8080


```

Figure for Jenkins Docker Image build creation.
![This codebase Jenkins Docker Image Creation](../../../docs/assets/images/jenkins_server_docker_build.png)

Figure for Jenkins Docker Container running first time. Watch message "hudson.WebAppMain$3#run: Jenkins is fully up and running".
![This codebase Jenkins Up and Running](../../../docs/assets/images/Jenkins_Up_Running.png)

Figure for Jenkins Docker Container home page when accessed in browser http://localhost:8080
![This codebase Jenkins Home page first time](../../../docs/assets/images/Jenkins_HomePage_FirstTime.png)


## Seed Job Jenkins Project

- In this codebase, you find seedJob.xml. This is an XML configuration for a Jenkins Project, with name "seed-job"

- In Dockerfile, you find above seedJob.xml is copied as seed-job/config.xml inside Jenkins installation

- When you run Docker container and access Jenkins server at http://localhost:8080, you will find seed-job Jenkins project already created

## About pipelineJob.groovy


## About createJobs.groovy
