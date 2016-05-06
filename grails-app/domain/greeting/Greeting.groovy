package greeting

import grails.rest.Resource

@Resource(uri = '/greetings')
class Greeting {

    String message
    
    static constraints = {
    }
}
