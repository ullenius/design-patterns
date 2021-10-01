# Singelton
Ensures that the class only has one instance.
Writing test using this pattern might be troublesome.

### Lazy Initialization
* Not Thread-Safe

### Enum Initialization
* Thread safe

### Synchronized Initialization
* Thread Safe
* Can be used in a multi-threaded environment.

### Double-Checked Locking Initialization
* Thread Safe
* Improved approach from the Synchronized Initialization

### Eager Initialization
* Thread Safe
* The instance is always created even if the client wont need it

### Bill Pugh Initialization
* Thread Safe 
* Instance is only created if the Client needs it.
