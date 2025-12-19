pipeline {
    agent any
    tools {
        maven 'Maven 3.9.11'
    }
    stages {
        stage('Checkout') {
            steps {
            git branch: 'main',
                url: 'https://github.com/Ayoub-oumha/jenkins-workshop.git'
            }
        }
        
        stage('Build') {
            steps {
               bat 'mvnw.cmd clean install'
            }
        }
        
        stage('Test') {
            steps {
                bat 'mvnw.cmd test'
            }
        }
        
        stage('Deploy') {
            steps {
                echo "Deploying to production server..."
            }
        }
    }
}