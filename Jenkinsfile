pipeline {
    agent any 
    environment {
	PATH = '/usr/share/maven/bin:$PATH'
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
