pipeline {
    agent any 
    environment {
	PATH = '/opt/maven/apache-maven-3.8.6/bin:$PATH'
    }
    stages { 
        stage('SCM Checkout') {
            steps{
            checkout scm
            }
        }
		
		stage('Build') {
            steps {  
                sh ' mvn clean package '
            }
        }
	}
}	
