import groovyx.net.http.ContentType
import groovyx.net.http.RESTClient

@Grab('org.codehaus.groovy.modules.http-builder:http-builder:0.7.1')

//simple get 
//println 'http://groovy-lang.org'.toURL().text

String base = 'https://api.icndb.com'

def chuck = new RESTClient(base)
chuck.contentType = ContentType.JSON

chuck.get(path: '/jokes/random') { response, json ->
    println response.status
    println json
}
