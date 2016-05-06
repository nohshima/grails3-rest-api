package greeting.service

import greeting.Greeting
import greeting.model.GreetingDelegate

class GreetingDelegateService {

  def hello(def id) {
    def greeting = Greeting.get(id)
    new GreetingDelegate(greeting)
  }

}