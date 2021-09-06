CURR_DIR=$(dirname $0)
docker build -t creditrisk-devops-jenkins-server -f ${CURR_DIR}/Dockerfile ${CURR_DIR}
