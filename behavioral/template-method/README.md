# Template Method

Creates a template that with its usage of inheritance performs step-by-step operations from the superclass.<br>
Using the 'Hollywood principle'. 

The template method has 2 members
* AbstractClass/AbstractTemplate - Holds the invocations of the 
primitive methods and are invoked inside the templateMethod(), can return an Object if needed.
* ConcreteClass/ConcreteTemplate - Implementations of the abstract Templates methods.

Good choice for framework development.

##### JDK Usage
Non abstract methods of
* java.io.OutputStream
* java.io.InputStream
* java.io.Reader
* java.io.Writer
* java.util.AbstractList
* java.util.AbstractSet
* java.util.AbstractMap

![alt text](template-method.png)