pipeline {
    agent any

    triggers {
        pollSCM '* * * * *'
    }
    stages {
	    stage('Build research-service') {
	        steps {
	            sh './microservices/creditrisk-creditresearch-service/mvnw -f ./microservices/creditrisk-creditresearch-service/pom.xml clean install'
	        }
	    }
	    stage('Build advisory-service') {
	        steps {
	            sh './microservices/creditrisk-advisory-service/mvnw -f ./microservices/creditrisk-advisory-service/pom.xml clean install'
	        }
	    }
	    stage('Build modeling-service') {
	        steps {
	            sh './microservices/creditrisk-modeling-service/mvnw -f ./microservices/creditrisk-modeling-service/pom.xml clean install'
	        }
	    }
    	
	}
}