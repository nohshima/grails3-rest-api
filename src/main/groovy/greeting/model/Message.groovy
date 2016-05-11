package greeting.model

class Message implements Serializable {
  String value
  
  Message() {
    this.value = null
  }
  
  Message(String value) {
    this.value = value
  }
  
  Message(Message message) {
    this.value = message.value
  }
  
  boolean hasValue() {
    if (value == null) return false
    return value.length() > 0
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
    if (!(other instanceof Message)) return false
    value == other.value
  }
}
