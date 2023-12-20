interface vehicle {
    // all methods and data members are public by defaut
    int speed = 50;

    void brake(int decrement);

    void accelerate(int increment);
}

interface showData {
    void lowSpeed();

    void highSpeed();
}

class cycle implements vehicle, showData {
    // int speed=100;
    
    // we can overwrite fields of interface in its derived class
    // but not in main function
    int dec;
    int inc;

    public void brake(int decrement) {
        dec = decrement;
    }

    public void accelerate(int increment) {
        inc = increment;
    }

    public void lowSpeed() {
        System.out.println("Low Speed : " + (speed - dec));
    }

    public void highSpeed() {
        System.out.println("High Speed : " + (speed + inc));
    }
}

public class ch_54_interfaces {
    public static void main(String[] args) {
        cycle c = new cycle();
        c.brake(10);
        c.accelerate(15);
        c.highSpeed();
        c.lowSpeed();
    }
}
/* 
* Difference B/W abstract class and Interface :

* We can implement a class using Multiple Interface but it cannot be done using
  abstract class.

* Interfaces in Java :

* An interface in java is a collection of abstract methods.
* The interface is one more way to achieve abstraction in Java.
* We cannot modify properties of a interface as they are 'final'(constant).
* An interface may also contain constants, default methods, and static methods.
* All the methods inside an interface must have empty bodies except default
  methods and static methods.
* We use the interface keyword to declare an interface.
* There is no need to write abstract keyword before declaring methods in an
  interface because an interface is implicitly abstract.
* An interface cannot contain a constructor (as it cannot be used to create
  objects)
* In order to implement an interface, java requires a class to use the
  implement keyword.
* While implementing the interface methods, they need to declared as public.




*/