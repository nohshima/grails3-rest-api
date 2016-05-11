package greeting.model

class Greeting {

    GreetingId id = new GreetingId()
    Message message = new Message()
    
    def hello() {
      "Hello ${message.value}"
    }

    @Override
    int hashCode() {
        id.hashCode()
    }

    @Override
    boolean equals(def other) {
        if (other == null) return false
        if (this == other) return true
        if (!(other instanceof Greeting)) return false
        id == other.id
    }
}
