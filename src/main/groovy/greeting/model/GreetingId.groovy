package greeting.model

class GreetingId implements Serializable {
  Long value
  
  GreetingId() {
    this.value = null
  }
  
  GreetingId(Long value) {
    this.value = value
  }
  
  GreetingId(String value) {
    this.value = Long.parseLong(value)
  }
  
  GreetingId(GreetingId greetingId) {
    this.value = greetingId.value
  }
  
  boolean hasValue() {
    return value != null
  }

  @Override
  int hashCode() {
    if (!hasValue()) return super.hashCode()
    value.hashCode()
  }

  @Override
  boolean equals(def other) {
    if (other == null) return false
    if (this == other) return true
    if (!(other instanceof GreetingId)) return false
    value == other.value
  }
}
