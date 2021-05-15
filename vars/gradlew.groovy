#!/usr/bin/env groovy

def call(String... args) {
    if (isUnix()) {
        sh "./gradlew ${args.join(' ')} --console=verbose --info --stacktrace --daemon"
    } else {
        bat "gradlew.bat ${args.join(' ')} --console=verbose --info --stacktrace --daemon"
    }
}
