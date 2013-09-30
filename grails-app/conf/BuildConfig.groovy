grails.release.scm.enabled = false
grails.project.dependency.resolution = {
    inherits("global") {
        excludes 'ehcache'
    }
    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()
    }
    dependencies {
        test 'org.spockframework:spock-core:0.7-groovy-2.0'
    }
    plugins {
        build(':release:3.0.1', ':rest-client-builder:1.0.3') {
            export = false
        }
    }
}
