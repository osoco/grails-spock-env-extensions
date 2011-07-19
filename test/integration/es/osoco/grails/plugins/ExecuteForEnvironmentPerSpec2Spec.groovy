package es.osoco.grails.plugins

import spock.lang.Specification

class ExecuteForEnvironmentPerSpec2Spec extends Specification {

    def "executes all feature methods of the specification only in the specified environment"() {
        expect:
        ExecuteForEnvironmentPerSpec1Spec.executedFeatureMethods == 1
    }
}
