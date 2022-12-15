*1. Your design probably has a type called something like Car or Vehicle that is a supertype to both Volvo* *and Scania. What is the contract for gas() and brake() in this type? Do the implementations of gas() and* *brake() in both Volvo and Scania follow this contract? Does your design follow the Liskov Substitution Principle?*

    Both gas and brake takes an amount (double) as an argument and then forwards the argument to incrementSpeed() (case: gas) or decrementSpeed (case: brake), which alter the currentSpeed in relation to the the given amount if the vehicle is in a movable state. A corresponding contract can therefore be depicted as:

        *Gas increments the speed of a vehicle if the vehicle is in a movable state, which doesn't break Liskov's Substitution Principle because the contract adheres to all subclasses*

    Liskovs substitution principle states that objects of a superclass should be replacable with objects of its subclasses without breaking the program, or more formally:
        
        If, for each object o1 of type S, 
        there is an object o2 of type T such that, 
        for all programs P defined in terms of T, 
        the behavior of P is unchanged when o1 is substituted for o2,
        then S is a subtype of T. - (Barbara Liskov)
        
    In our program we have used the Open Closed Principle to favour LSP, which our code follows. 

2. *How did you handle duplicated code between Scania, the car transporters and the repair shops?*
*Explain how you decided when to use subclassing and when to use composition and delegation.*

    We chose to use subclassing to divide the classes into which category they fit into. For example, both Scania and Car transporter are trucks with a flatbed that can be lowered/lifted, therefore they should share the same methods that exists around the flatbed. The superclass truck is also a subclass of Vehicle, because a truck is a vehicle which should be able to move, turn, etc. 
    Car repair shop and Car transporter both share the ability to load/unload cars, in this case we chose to use delegation. By creating the class LoadAndUnloadCars with a method to load and unload cars, we could delegate the "responsibility" to this class when trying to load and unload in Car repair shop and Car transporter. This way, we can easily delegate back to this method and avoid duplicated code. 


3. *Did you need to modify the design from lab 1 in order to make these extensions? If so, how could you have noticed that your design from Lab 1 did not follow the Open-Closed Principle before you started working on Lab 2?*

    We had to implement the super class Vehicle since trucks were added. This meant that everything in the Car class had to be moved into the Vehicle class. This could have been avoided in lab 1 if we used the open-closed principle in such a way that we had the opportunity to add other sorts of vehicles, not just different kinds of cars. 