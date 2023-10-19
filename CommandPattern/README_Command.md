# CommandPattern

## Overview
Command design pattern is a behavioral design pattern (communication pattern among objects) that converts a request or 
an operation into an object with all the required information such as what method to call, arguments, etc.

### when to use it?
when we need to decouple the object making the request and object 
that know how to perform the request, use ***COMMAND PATTERN***

### how does it work?
How Does Command Design Pattern Work?
Consider we have a universal remote with four buttons On, Off, Up, and Down. This remote can be configured for any device such as a light, speaker, air conditioner, and the buttons can be configured for the respective device's use-cases.

Example

* The Up/Down button can be configured to increase/decrease the brightness if the device is a light.
* The Up/Down button can be configured to increase/decrease the volume if the device is a speaker.

### structure
It has few core participants such as
* Invoker
* Receiver
* Command
* client
* ConcreteCommand

That are responsible for executing operations based on client request

***Receiver*** Receives command from the ConcreteCommand and knows how to perform operations associated with the command. E.g., Light, Speaker.

***Command*** An interface declared with an execute() method that individual commands would implement. It can also have an unexecute() method for unexecuting the last executed operation. For the sake of simplicity, we leave unexecute() out of the picture and focus just on the execute() method.

***ConcreteCommand*** Implements the Command interface and provides implementation for the execute() method. It communicates with the receiver to trigger appropriate action. Eg. OnCommand, OffCommand.

***Invoker*** Responsible for executing the command assigned by the Client based on the incoming request.

***Client*** Responsible for creating the ConcreteCommand, setting its receiver, and assigning it to the Invoker. E.g. RemoteApplication.
