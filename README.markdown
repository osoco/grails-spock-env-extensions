# Introduction

This plugin provides [Spock](http://spockframework.org/) extensions that allow specification and feature method inclusion and exclusion depending on the Grails execution environment.

# Usage
```groovy
class SingleFeatureMethodsExecutedAndIgnoredSpec extends Specification {

    @ExecuteForEnvironment(['test_integration', 'test_performance'])
    def "executes a feature method only in the given environments"() {
        // ...    
    }

    @IgnoreForEnvironment(['test_integration', 'test_performance'])
    def "ignores a feature method only in the given environments"() {
        // ...
    }
}


@ExecuteForEnvironment(['test_integration', 'test_performance'])
class TheWholeSpecExecutedSpec extends Specification {

    // all feature methods will be executed only in the given environments

}


@IgnoreForEnvironment(['test_integration', 'test_performance'])
class TheWholeSpecIgnoredSpec extends Specification {

    // all feature methods will be ignored only in the given environments

}
```

Note that you have to specify environment names as ```String``` and not as ```grails.utils.Environment``` constants. The reason is that we crafted these extensions for our custom environments that are simply described as strings.

# Contributors
*  [Marcin Gryszko](http://github.com/mgryszko/)

