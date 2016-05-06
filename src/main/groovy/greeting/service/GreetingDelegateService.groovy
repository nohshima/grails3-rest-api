package greeting.service

import greeting.Greeting
import greeting.model.GreetingDelegate

import org.springframework.stereotype.Service;

@Service
class GreetingDelegateService {

  def hello(def id) {
    def greeting = Greeting.get(id)
    new GreetingDelegate(greeting)
  }

}