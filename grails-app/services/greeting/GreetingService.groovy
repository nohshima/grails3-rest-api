package greeting

import grails.transaction.Transactional
import greeting.service.AcquireGreeting

@Transactional
class GreetingService {

    AcquireGreeting acquireGreeting

    def hello(def id) {
        def greeting = acquireGreeting.hello(id)
        return greeting
    }
}
