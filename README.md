# Design Patterns 

## Introduction
The code examples in this project directory are just to serve 
as a practice exercise for learning design patterns. While the
core problems are from HeadFirst Design Patterns book, I have 
spring-ified and lombok-ified wherever appropriate.

## Patterns
### Strategy Pattern
Strategy Pattern allows us to encapsulate a family of algorithms
and use them interchangeably in our client code. 

The benefit of this pattern is that the client code can remain
unaltered and we can easily add/remove algorithms to the existing family. 
  
Code example: SimUDuck App - Encapsulating Duck behaviors. 

### Observer Pattern 
Observer Pattern allows us to create a one-to-many relationship
between a single observable and multiple observers such that all
the observers are notified whenever the state of the observable 
changes.

This pattern allows us to add/remove new observers to the existing 
list of observers without altering any code. Moreover, the observable 
and the observers are very loosely coupled. 

I implement a pull based observer and use my own implementation of observer 
pattern (instead of relying on java provided classes). 

Code example: Weather Data App - Updating observers of Weather Data App whenever
the weather measurements change.  

### Decorator Pattern
Decorator pattern allows us to add new responsibilities to existing objects. 
This pattern allows us to follow the Open-Closed Principle (Classes should be open 
for extension but closed for modification). 

Code example: StarBuzz App - Allowing decoration of bevarages with condiments. 

### Factory Method Pattern 
TODO

### Abstract Factory Pattern
TODO

### Singleton Pattern
TODO

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
  

