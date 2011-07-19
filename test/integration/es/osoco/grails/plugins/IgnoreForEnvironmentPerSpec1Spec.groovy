package es.osoco.grails.plugins

import spock.lang.Specification

// Spock runner seems to execute specifications in the alphabetical order. This spec should execute before the 2Spec.
// It's a bit brittle test, but better than nothing
@IgnoreForEnvironment('test')
class IgnoreForEnvironmentPerSpec1Spec extends Specification {

    static executedFeatureMethods = 0

    def "ignores all feature methods of the specification only in the specified environment"() {
        expect:
        ++executedFeatureMethods
    }
}
