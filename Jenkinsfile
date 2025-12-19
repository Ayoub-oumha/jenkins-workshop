pipeline {
    agent any
    tools {
        maven 'Maven 3'
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Ayoub-oumha/jenkins-workshop.git'
            }
        }
        
        stage('Build') {
            steps {
                sh './mvnw clean install'
            }
        }
        
        stage('Test') {
            steps {
                sh './mvnw test'
            }
        }
        
        stage('Deploy') {
            steps {
                echo "Deploying to production server..."
            }
        }
    }
}