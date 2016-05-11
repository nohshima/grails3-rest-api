package greeting

import greeting.model.GreetingId
import greeting.model.Message

class GreetingSource {
    Long id
    String message
    
    def id() {
      new GreetingId(id)
    }
    
    def message() {
      new Message(message)
    }
    
    static constraints = {
    }
}
