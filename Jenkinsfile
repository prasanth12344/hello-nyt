pipeline {
	agent { label 'java-build-node' }

    tools {
        maven "maven-3.8.6"
    }
	environment {
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
                sh " mvn clean package "
            }
        }
		stage('Build docker image') {
            steps {  
                sh 'docker build -t prasanth12344/japp:$BUILD_NUMBER .'
            }
        }
        stage('login to dockerhub') {
            steps{
                sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
            }
        }
        stage('push image') {
            steps{
                sh 'docker push prasanth12344/japp:$BUILD_NUMBER'
            }
        }
	}
}
