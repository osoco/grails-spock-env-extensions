grails.project.docs.output.dir = "docs"
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
    }
}
