# Design Patterns 

## Introduction
The code examples in this project directory are just to serve as a practice exercise for learning design patterns. 
While the core problems are from HeadFirst Design Patterns book, I have spring-ified and lombok-ified 
wherever appropriate.

## Patterns
### Strategy Pattern
Strategy Pattern allows us to encapsulate a family of algorithms and use them interchangeably in our client code. 

The benefit of this pattern is that the client code can remain unaltered and we can easily add/remove 
algorithms to the existing family. 
  
Code example: SimUDuck App - Encapsulating Duck behaviors. 

### Observer Pattern 
Observer Pattern allows us to create a one-to-many relationship between a single observable and multiple observers 
such that all the observers are notified whenever the state of the observable changes.

This pattern allows us to add/remove new observers to the existing list of observers without altering any code.
Moreover, the observable and the observers are very loosely coupled. 

I implement a pull based observer and use my own implementation of observer pattern 
(instead of relying on java provided classes). 

Code example: Weather Data App - Updating observers of Weather Data App wheneverthe weather measurements change.  

### Decorator Pattern
Decorator pattern allows us to add new responsibilities to existing objects. This pattern allows us to follow 
the Open-Closed Principle (Classes should be open for extension but closed for modification). 

Code example: StarBuzz App - Allowing decoration of bevarages with condiments. 

### Factory Method Pattern 
Factory Method Pattern encapsulates object creation by allowing the subclasses to create the type of objects they need. 
 
Code example : Pizza Store Application. (See Abstract Factory Pattern below)

### Abstract Factory Pattern
Abstract Factory Pattern encapsulates object creation and allows classes to create a familyof related objects. 

Code example : Pizza Store Application. (See Factory Method Pattern above)

The Pizza Store application leverages both patterns, the subclasses decide on the type of pizza ingredient 
factory to provide (factory method). The subclasses are also composed of Ingredient Factories to 
create the family of ingredients based on the location (Abstract Factory)

### Singleton Pattern
Singleton Pattern allows us to create classes for which only one object exists. This sort of singletons can
be useful when create caches, connection, configuration classes for which having more than one instance floating 
around in the JVM doesn't make sense. 

Code Example : Simple Singleton that assumes that we are creating a very expensive singleton 
(requiring lazy initialization) and we operating under a very high TPS multithreaded system (where accessing the singleton is 
frequent and therefore has to be efficient). 

### Command Pattern
TODO

### Adapter Pattern
TODO

### Facade Pattern
TODO

### Template Method Pattern
TODO

### Iterator Pattern
TODO

### Composite Pattern
TODO

### State Pattern
TODO

### Proxy Pattern
TODO 

#### Protection Proxy 
TODO

#### Remote Proxy
TODO

### Compound Pattern (Simplified MVC)
TODO

### Words of Wisdom
TODO

### Appendix
TODO
  

