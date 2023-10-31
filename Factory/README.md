# Factory Design Pattern

## Overview
Factory design pattern is a creational design pattern **_that separates the logic of creating objects from the client code_**.
The factory class in the factory design pattern is responsible for creating objects based on the request from the client.

![Screenshot 2023-10-31 at 10.25.06 AM.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fmd%2F3shsjcp11gv3p76_fmt0r2km0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_gXwbYt%2FScreenshot%202023-10-31%20at%2010.25.06%20AM.png)
## How does Factory Design Pattern Work?
We will understand the working of factory design patterns with the Milkshake Factory example mentioned above. We will create the Milkshake interface and concrete milkshake classes such as OreoMilkshake, ButterscotchMilkshake, and VannilaMilkshake. We will then create the MilkshakeFactory class with a factory method that accepts the type of Milkshake we want and returns the respective milkshake object.

### Structure
Factory, Product, Concrete Products, Client are the core components of the factory design pattern.

![Screenshot 2023-10-24 at 7.07.02 PM.png](..%2F..%2F..%2F..%2FDesktop%2FScreenshot%202023-10-24%20at%207.07.02%20PM.png)

### Pros and Cons of Factory Design Pattern
**Pros**

## Dependency Inversion principle
![Screenshot 2023-10-31 at 10.28.08 AM.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fmd%2F3shsjcp11gv3p76_fmt0r2km0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_matyjU%2FScreenshot%202023-10-31%20at%2010.28.08%20AM.png)

![Screenshot 2023-10-31 at 10.28.44 AM.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fmd%2F3shsjcp11gv3p76_fmt0r2km0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_mgZgAF%2FScreenshot%202023-10-31%20at%2010.28.44%20AM.png)


* Factory design pattern provides great extensibility that lets us add new classes without changing the application.
* Factory design pattern leverages loose coupling and eliminates hard binding the application-specific logic in the code.
* The factory method returns the Product interface. So, it can work for any concrete product implementation.

**Cons**

* creation of all the concrete product instances are tightly coupled with the factory class that involves code modification 
  when a new concrete product is introduced.

## Difference between Factory Pattern and Factory Method Pattern

| Factoy Design Pattern                                                                                                  | Factory Method Desing Pattern                                                                                                                           |
|------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------|
| Factory design pattern contains a single factory class that is responsible for creating the concrete product instances | Factory method design pattern contains an abstract factory and several factory sub-classes responsible for creating the respective concrete products    |
| Example: PhoneFactory creates all phone types such as AndroidPhone, IPhone, etc.                                       | Example: PhoneFactory is abstract, and there will be concrete factories such as AndroidPhoneFactory and IPhoneFactory to create AndoridPhone and IPhone |
