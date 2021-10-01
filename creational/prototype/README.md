# Prototype
Create a copy/clone instance from a Object,
with performance in mind.
* Deep copy - The target object has a Composition or Aggregation relationship.
* Shallow copy - The target object only uses primitives or immutable(String).

Prototype has 2 members
* Prototype - Abstraction with its clone/copy behaviour,using the Cloneable interface.
* Concrete Prototype - Implementation that uses the clone/copy behaviour

The Cloneable Interface has received massive criticism because of it's big design flaws.<br>
Alternative approach is to use Copy Constructor

Joshua Bloch about Cloneable: https://www.artima.com/intv/bloch.html#part13