package greeting

import greeting.feature.Message

class Greeting {

    Message message = new Message()
    
    static embedded = ['message']
    
    static mapping = {
      columns {
        message column: 'message'
      }
    }
    
    static constraints = {
    }
}
