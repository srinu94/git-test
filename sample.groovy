pipeline {
    agent { label 'nokia' } 

    stages {
        stage('One') {
                steps {
                        echo 'Srinidhi here'
                        echo 'nokia nokia'
			
                }
                steps {
                        echo 'mine'
                }
        }
	    stage('Two'){
		    
		steps {
			input('Do you want to proceed?')
        }
	    }
        stage('Three') {
                when {
                        not {
                                branch "master"
                        }
                }
                steps {
						echo "Hello"
                      }
        }
                               
	}
}


