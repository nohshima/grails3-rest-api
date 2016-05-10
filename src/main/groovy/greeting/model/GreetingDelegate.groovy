package greeting.model

class GreetingDelegate {

    def greeting
    
    GreetingDelegate(def greeting) {
        this.greeting = greeting
    }
    
    def hello() {
      "Hello ${greeting.message.value}"
    }
}
