class SpockGrailsEnvExtensionsGrailsPlugin {
    def version = '0.1'
    def grailsVersion = '1.3 > *'
    def dependsOn = [spock: '0.5-groovy-1.7']

    def author = 'Marcin Gryszko'
    def authorEmail = 'marcin@gryszko.net'
    def title = 'Spock Grails environment extension'
    def description = '''\\
Spock extensions that allow to execute and ignore tests for given Grails environments.
'''
    def documentation = 'https://github.com/osoco/grails-spock-env-extension/wiki'
}
