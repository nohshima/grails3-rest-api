package greeting.service

import greeting.GreetingSource
import greeting.model.Greeting

import org.springframework.stereotype.Service;

@Service
class AcquireGreeting {

  def hello(def id) {
    def greetingSource = GreetingSource.get(id)
    new Greeting(id:greetingSource.id(), message:greetingSource.message())
  }

}