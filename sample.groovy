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
	      
	  stage ('Deploy') {
		  
		  sshagent(['sonar-server']) {
                    ssh -o StrictHostKeyChecking=no cloud_user@13.56.253.93 hostname -f
		  }
	  }	                        
	}
}


