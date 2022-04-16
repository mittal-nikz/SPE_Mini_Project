pipeline {
    environment{
        imageName = ""
    }
    agent any

    stages {
        stage('Git Pull') {
            steps {
                git branch: 'main', url: 'https://github.com/mittal-nikz/SPE_Mini_Project.git'
            }
        }
      stage('Maven Build') {
            steps {
                script{
                    sh 'mvn clean install'
                }
            }
        }
       stage('Docker Build') {
            steps {
                script{
                    imageName = docker.build "mittalnikz/mini_project:latest"
                }
            }
        }
      stage('Docker Push Image') {
            steps {
                script{
                    docker.withRegistry('','docker-jenkins'){
                        imageName.push()
                    }
                }
            }
        }
       stage('Ansible Pull Docker Image') {
            steps {
                ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'deploy-docker/inventory', playbook: 'deploy-docker/calc-deploy.yml', sudoUser: null
                }
         }       
    }
}
