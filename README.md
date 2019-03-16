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

Code example : Simple Singleton that assumes that we are creating a very expensive singleton 
(requiring lazy initialization) and we operating under a very high TPS multithreaded system (where accessing the 
singleton is frequent and therefore has to be efficient). 

### Command Pattern
Command Pattern allows us to create classes that encapsulate method invocation. Each method invocation can be 
encapsulated as a command object. Once we have these command objects, we can use them freely in invokers that just 
invoke the function on the command object.

Code example : Remote Control Application.

### Adapter Pattern
Adapter Pattern allows us to adapt one object into another. 

Code example : Turkey Adapted as a Duck. 

### Facade Pattern
Facade Pattern allows us to create facades of complicated set of classes to simplify using them in client code.
For example, if we have a set of classes that a client has to use. Writing code that uses all these classes might
make the client code harder to write and not easy to maintain. Having a facade that encapsulates all these classes
and exposes simple interface allows client code to depend on the facade instead.  

However, the underlying classes are still available for anyone who needs the flexibility of interacting with 
them directly.
 
Code example : Home Theatre Application

### Template Method Pattern
Template Method Pattern allows us to encapsulate a common procedure or template that is to be shared across multiple 
sub-classes and at the same time providing hooks into the parent method so that the subclasses can customize the
common template. 

Template method Pattern adheres to the hollywood principle of "don't call us, we'll call you" where the base class
calls upon on the sub class only when needed. 

Code example : Beverage Preparation. 

### Iterator Pattern
Iterator Pattern allows us to iterate over a collection of objects without exposing details about the underlying
implementation. This will allow client code to stay the same even if we decide to use another datastructure to 
hold the collection of objects.

Code example : Task Scheduling 

### Composite Pattern
Composite Pattern allows us to treat individual objects and composite objects (that contain many individual objects)
just the same. This pattern will allow client code to avoid unnecessary instanceof checks and treat collection and 
individual objects the same. 

Code example : Diner Menus.   

### State Pattern
TODO

### Proxy Pattern
TODO 

#### Remote Proxy
TODO

#### Protection Proxy 
TODO

### Compound Pattern (Simplified MVC)
TODO

### Words of Wisdom
TODO

### Appendix 
TODO
  

