package greeting.service

import greeting.GreetingSource
import greeting.model.Greeting

import org.springframework.stereotype.Service;

@Service
class RegisterGreeting {

  def register(def greeting) {
    def greetingSource = new GreetingSource(message:greeting.message.value)
    greetingSource.save(flush: true)
  }
}