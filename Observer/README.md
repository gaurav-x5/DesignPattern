# Observer Design Pattern

## Overview
Observer design pattern falls under the category of behavioral design patterns.
The Observer Pattern maintains a one-to-many relationship among objects, ensuring that when the state of one object 
is changed, all of its dependent objects are simultaneously informed and updated.
The design pattern si also referred to as Dependents.

A subject and observer(many) exist in a one-to-many relationship. Here the observers do not have any access
to data, so they are dependent on the subject to feed them with information.

## when will we need Observer Design Pattern ??

One could implement the observer design patterns when designing a system where several objects are 
interested in any possible modification to a specific object.
In other words, the observer design pattern is employed when there is one-to-many relationship b/w objects, such as when
one object is updated, its dependent objects must be automatically notified.

![Screenshot 2023-10-24 at 8.29.38 PM.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fmd%2F3shsjcp11gv3p76_fmt0r2km0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_iGMCSU%2FScreenshot%202023-10-24%20at%208.29.38%20PM.png)

**Real-World Example**: If a bus gets delayed, then all the passengers who were supposed to travel in it get notified about the delay
to minimize the inconvenience. Here, the bus agency is the subject and all the passengers are the observers.
All the passengers are dependent on the agency to provide them with information about any changes regarding their travel journey.
Hence, there is one-to-many relationship b.w the travel agency and the passengers.

## How does Observer Design Patterns work?

![Screenshot 2023-10-24 at 8.37.40 PM.png](..%2F..%2F..%2F..%2FDesktop%2FScreenshot%202023-10-24%20at%208.37.40%20PM.png)

* The subject delivers events that are intriguing to the observers. These event occur due to changes in the state
  of the subject or the execution of certain behaviors. Subjects have a registration architecture that
  enables new observers to join and existing observers to withdraw from the list.
* whenever a new event occurs, the subject iterates through the list of observers, calling the notify method provided in the observer
  interface.
* The notification interface is declared by the Observer interface. It usually includes an updating method. The method may
  include numerous options that allow the subject to provide event information together with the update.
* Concrete Observers do certain activities in response to alerts sent by the Subject. All the concrete observer classes 
  should implement the base observer interface, and the subject interface is coupled only with the base observer interface.
* Sometimes, observers want some additional context in order to properly process any update notified by the Subject.
  As a result, the Subject frequently supplies some contextual information as parameters to the notification function. 
  The subject can pass itself as an argument, allowing the observer to immediately retrieve any needed data.

## Pros & Cons

### Pros
* This design pattern allows information or data transfer to multiple objects without any change in the observer or subject classes.
* It adheres to the loose coupling concept among objects that communicate with each other.
* This design pattern follows the Open/Closed Principle, which says that entities should be open for extension but closed for modification. Here the observers can easily be added or removed anytime without any change in the code.

### Cons
* The Observer pattern can increase complexity and potentially cause efficiency issues if it's not executed properly.
* The fundamental shortcoming of this design pattern is that the subscribers/observers are updated in a random sequence.