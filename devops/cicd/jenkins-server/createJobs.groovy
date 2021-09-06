pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('devops/cicd/jenkins-server/pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('creditrisk-app-projects') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/javakishore-veleti/CreditRiskApp.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}