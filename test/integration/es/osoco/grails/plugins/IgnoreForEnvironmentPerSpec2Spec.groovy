package es.osoco.grails.plugins

import spock.lang.Specification

@ExecuteForEnvironment('test')
class IgnoreForEnvironmentPerSpec2Spec extends Specification {

    def "executes all feature methods of the specification only in the specified environment"() {
        expect:
        IgnoreForEnvironmentPerSpec1Spec.executedFeatureMethods == 0
    }
}
