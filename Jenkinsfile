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
	            sh './microservices/creditrisk-advisory-service/mvnw -f ./code/services/dp-common-standalone-main/dp-common-event-api_def/pom.xml clean install'
	        }
	    }
	    stage('Build modeling-service') {
	        steps {
	            sh './microservices/creditrisk-modeling-service/mvnw -f ./code/services/adapters/events/rabbitmq/code/dp-events-rabbitmq-main/pom.xml clean install'
	        }
	    }
    	
	}
}