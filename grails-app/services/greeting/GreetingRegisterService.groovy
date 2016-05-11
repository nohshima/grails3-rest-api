package greeting

import grails.transaction.Transactional
import greeting.service.RegisterGreeting

@Transactional
class GreetingRegisterService {

    RegisterGreeting registerGreeting

    def register(def greeting) {
        registerGreeting.register(greeting)
    }
}
