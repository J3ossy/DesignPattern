# DesignPattern Cheatsheet

incomplete, will be extended continuously

## Principles of good software design

***S**ingle Responsibility Principle:* Each class should have only one responsibility.

***O**pen-Closed Principle:* Software should be open for extension but closed for modification.

***L**iskov Substitution Principle:* Objects that implement the same interface should be interchangeable without breaking the program.

***I**nterface Segregation Principle:* Your code should only depend on interfaces that it actually uses.

***D**ependency Inversion Principle:* All parts of your code should depend on interfaces, or abstractions. Implementation details should depend on interfaces, not the other way around.


## Design Pattern general

A design pattern is a general solution to certain kinds of common design issues that occur in software development.
- Creational patterns
- Behavioral patterns
- Structural patterns

## Creational Pattern

A creational design pattern is any design pattern that concerns how objects in your program are created. These patterns can help you manage the creation of objects as your code becomes increasingly complex.

### Singleton Pattern

*When Are Singletons Useful?*

- A class that has only one instance, but no clear owner.
- You want that instance to be available everywhere in your code.
- The instance is initialized only when it's first used (also known as lazy initialization).


*Disadvantages of Singleton*

- Singletons can cause brittle assumptions in your code. If later on, you decide you need multiple instances of the class, you might have to refactor a bunch of code.
- Code that depends on singletons can become hard to test.

```Code example:``` [Singleton](/src/CreationalPatterns/Singleton/SingletonExample)



### Abstract Factory

*When to Use Abstract Factories*

- You want to hide construction details from callers.
- You want to encapsulate construction of several related objects into a single Java interface.

```Code example:``` [Abstract Factory](/src/CreationalPatterns/AbstractFactory/SchuhfabrikExample)

### Builder

*What is a Builder?*
-	A mutable factory that constructs the state of a to-be-created object, property by property, and then builds the object.
- Usually supports method chaining.
- Often used to create immutable data objects.

```Code example:``` [Builder](/src/CreationalPatterns/Builder/AccountExample/)

```Code example:``` [Builder](/src/CreationalPatterns/Builder/UdacisearchClientExample/)



