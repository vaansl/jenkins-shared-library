def call() {
	stage('Build using Shared Library') {
	    echo "running maven build from shared Library..."
	    sh 'mvn clean package'
	}
}
