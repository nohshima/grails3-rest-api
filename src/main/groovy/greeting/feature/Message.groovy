package greeting.feature

class Message {
  String value
  
  Message() {
    this.value = null
  }
  
  Message(String value) {
    this.value = value
  }
  
  boolean hasValue() {
    if (value == null) return false
    return value.length() > 0
  }
}
