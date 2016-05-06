package greeting

import greeting.Greeting
import grails.transaction.Transactional
import greeting.service.GreetingDelegateService

@Transactional
class GreetingService {

    def greetingDelegateService
    
    def hello(def id) {
        def greeting = greetingDelegateService.hello(id)
        return greeting
    }
}
