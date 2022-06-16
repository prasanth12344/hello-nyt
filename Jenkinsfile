pipeline {
    agent any 
    environment {
	PATH = '/opt/apache-maven-3.8.6/bin:$PATH'
    DOCKERHUB_CREDENTIALS = credentials('docker-hub-prasanth12344')
    }
    stages { 
        stage('SCM Checkout') {
            steps{
            checkout scm
            }
        }
		
		stage('Build') {
            steps {  
                sh " mvn clean "
            }
        }
	}
}	
