javaImage = docker.image('openjdk')

node {
  stage('Checkout') {
    checkout scm
  } 
   
  stage('Docker hello world') {
    javaImage.inside() {
      sh 'java --version'
    }            
  }
}
