pipeline {
    agent { label 'master' } 

     stages {
        stage('One') {
                steps {
                        echo 'Srinidhi here'
                        echo 'nokia nokia'
			
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


