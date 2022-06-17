pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "maven-3.8.6"
    }

    stages { 
        stage('SCM Checkout') {
            steps{
            checkout scm
            }
        }
		
		stage('Build') {
            steps {  
                sh " mvn clean package "
            }
        }
	}
}
