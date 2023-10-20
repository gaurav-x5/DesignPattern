# State Pattern

It is a Behavioral design pattern, it is used to allow an object 
modify its behaviour based on change in internal state.
It makes object behave like Finite State machine.
It makes the object flexible to alter its state without handling a lot of if / else conditions. 
State pattern ensures loose coupling between the performance of existing states versus the addition of new states.

## When Will We Need State Design Patterns?
Consider a scenario where a user wants to order food online and get it delivered and the service running at the backend needs to handle the various stages that can be there during the entire process from order initiation and order placing to the final delivery of the order.

One possible way to achieve this can be as follows:

`main():

    while(true):
        if(received order request):
            print(order initiated)
            
            if(order placed):
                print(order placed)
                
                while(not cook available):
                    print(waiting for the initiation of the cooking process)
                
                
                if(food preparation started):
                    print(food preparation started)

                    while(not food prepared):
                        print(food being prepared)

                    print(food is prepared)

                    while(not delivery guy available):
                        print(waiting for the order to be picked up by the delivery guy)

                    print(order picked for delivery)

                    while(not delivered):
                        print(out for delivery. Currently at xyz location)

                    print(order delivered successfully)
                else:
                    print(Sorry for the inconvenience. please try again later.)
            else:
                print(order cancelled)
`

The above pseudo-code is just a glimpse of how complex the scenario can be. This is when we have not handled the scenarios in which cancellations occur in between a particular state, maybe a delay in some process occurs or some other unexpected event occurs.

You can think of if the complexity of the problem increases, managing different stages of the process will become highly complex. Thus, dividing the different stages into different states and managing them individually will simplify the complexity to a very high extent.

The State Design patterns are used mainly in the following 2 scenarios:

* When we need to change the behavior of an object based on modifications in the object's internal state and handling it requires applying a lot of conditional statements.
* When the addition of new states need not affect the behavior of existing states. In other words, the state's pattern is useful when state-specific behavior can be determined independently.

## How does it work ?

In the State Design Pattern, we create a generic structure of a state in the form of an interface, which declares some behaviors/actions of any particular state. 
This interface can be used to create specific individual state classes so that those concrete state can define their own specific behavior implementations.

A context class is created which has a state object associated with it. This state object is used to update the behavior of the context object, as the state is altered.


### cons

* State Design pattern requires you to write a lot of code. The addition of new states requires more code, which makes code management a little difficult.
* When there are only a few states, then applying the state pattern just increases the unnecessary maintenance of a lot of code.

## Difference Between State Design Pattern and Strategy Design Pattern
In **State Design Pattern**, each state is connected to another state so that a flow can be created from an initial state to some final state as in finite state machines. State patterns allow us to switch from one state to another dynamically at runtime so that the behavior of the context object can change. State pattern allows different states to be dependent on each other in a flow so that the behavior of the context class can be changed from one state to another. 

Whereas, **Strategy Design Pattern** is used to provide a better alternative to subclassing, i.e, if a user wants to decide on a particular strategy for doing some work like deciding on a sorting algorithm to be executed from a list of available sorting algorithms on some array, or choosing an operation to perform on 2 numbers like addition or subtraction or multiplication, etc. Strategy pattern allows us to select a particular strategy dynamically at runtime to do some task on the provided input. Different strategies are independent and unaware of each other.