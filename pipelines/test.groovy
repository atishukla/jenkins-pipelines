node {
    stage('check out scm') {
        checkout scm
    }

    stage('First Stage') {
        println "Hello World!"
    }

    stage('Second Stage') {
        println "Hello again"    
    }   

    stage('Third Stage') {
        println "With post-commit hook"    
    }

    stage('Fourth Stage') {
        println "Time change in java args fix the issue"    
    }

    stage('Fourth Stage') {
        println "Works with commit not push"    
    }

    stage('Final Stage') {
        println "Working well with chmod a+x of post-commit"    
    }
}
