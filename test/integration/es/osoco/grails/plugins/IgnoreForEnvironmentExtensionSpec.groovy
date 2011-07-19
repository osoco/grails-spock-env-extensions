package es.osoco.grails.plugins

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Stepwise

@Stepwise
class IgnoreForEnvironmentExtensionSpec extends Specification {

    @Shared private executedFeatureMethods = 0

    @IgnoreForEnvironment('test')
    def "ignores a feature method only in the specified environment"() {
        expect:
        ++executedFeatureMethods
    }

    @IgnoreForEnvironment('development')
    def "if the environment doesn't match the current, feature method is executed"() {
        expect:
        ++executedFeatureMethods
    }

    def "counts executed feature methods"() {
        expect:
        executedFeatureMethods == 1
    }
}
