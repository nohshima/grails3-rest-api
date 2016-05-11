package greeting.view

import grails.validation.Validateable
import greeting.model.Message

class GreetingRequest implements Validateable {
  String message

  def message() {
    return new Message(message)
  }
}
