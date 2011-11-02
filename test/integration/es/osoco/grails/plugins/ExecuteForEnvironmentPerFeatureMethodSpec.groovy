package es.osoco.grails.plugins

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Stepwise

@Stepwise
class ExecuteForEnvironmentPerFeatureMethodSpec extends Specification {

    @Shared private executedFeatureMethods = 0

    @ExecuteForEnvironment('test')
    def "executes a feature method only in the specified environment"() {
        expect:
        ++executedFeatureMethods
    }

    @ExecuteForEnvironment('development')
    def "if the environment doesn't match the current, feature method is ignored"() {
        expect:
        ++executedFeatureMethods
    }

    def "counts executed feature methods"() {
        expect:
        executedFeatureMethods == 1
    }
}
