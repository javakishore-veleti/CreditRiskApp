# ./gradlew build docker dockerRun 
docker run --privileged --name creditrisk-devops-jenkins-server  -v /var/run/docker.sock:/var/run/docker.sock -v $(which docker):/usr/bin/docker -p 8080:8080 creditrisk-devops-jenkins-server &