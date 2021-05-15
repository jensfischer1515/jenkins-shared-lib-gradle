#!/usr/bin/env groovy

def call(Map args) {
    stage("${args.stage}") {
        when {
            branch "${args.branch?:'main'}"
        }
        steps {
            echo "Stage ${args.stage}..."
            gradlew("deploy${args.stage}", "${args.tasks?:'properties'}")
        }
    }
}
