grails.project.class.dir = 'target'
grails.project.source.level = 1.6

grails.project.dependency.resolver = 'maven'
grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits 'global'
    log 'error' // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve
    repositories {
        inherits true // Whether to inherit repository definitions from plugins
        mavenLocal()
        grailsCentral()
        mavenCentral()
    }
    dependencies {
    }
    plugins {
        build ':tomcat:8.0.18.2'

        compile ':asset-pipeline:2.1.1'
        runtime(':fbootstrapp:0.1.1'){
            excludes 'resources'
        }
        runtime ':facebook-sdk:2.6.0'
    }
}
//grails.plugin.location.facebookSdk = "../grails-facebook-sdk"
