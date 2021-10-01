# Dependency Injection/Inversion

## Inversion
Relies heavily on abstraction. All Object dependencies shall be relied on abstraction.<br>
Programming to an Interface is a soul-purpose in this principle.<br>
The goal is to reduce dependencies on concrete classes.

## Injection
Supports dependency inversion,
but are about how the dependency's are injected into the Object.
* Constructor Injection - The object are injected trough the constructor signature
* Setter Injection - The object are injected trough a setter-method.
* Interface/Abstraction Injection - The object are injected trough an Override set method from an abstraction.
