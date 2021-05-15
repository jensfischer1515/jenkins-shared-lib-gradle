package org.example.pipeline

import org.apache.commons.lang3.SystemUtils

@Grab('org.apache.commons:commons-lang3:3.8.1')
class Gradle implements Serializable {
    def steps

    Gradle(steps) {
        this.steps = steps
    }

    def wrapper(String... args) {
        if (!SystemUtils.IS_OS_WINDOWS) {
            steps.sh "./gradlew ${args.join(' ')} --console=verbose --info --stacktrace --daemon"
        } else {
            steps.bat "gradlew.bat ${args.join(' ')} --console=verbose --info --stacktrace --daemon"
        }
    }
}
