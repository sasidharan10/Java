abstract class base {
    abstract void print(); // abstract method only contains definition in abstract class
}

class derived extends base { // normal class inheriting abstract class
    void print() { // abstract methods should have their definition in their derived class
        System.out.println("This is definition of method in abstract class");
    }
}

abstract class child extends base {
    void give() { // here we dont have definition of abstract method but the class itself is
                  // abstract
        System.out.println("Hello");
    }
}

public class ch_53_abstract {
    public static void main(String[] args) {
        derived d = new derived();
        d.print();
    }
}

/*

 * Abstract class : 

 * An abstract class cannot be instantiated (no object).
 * Java requires us to extend it if we want to access it.
 * It can include abstract and non-abstract methods. 
 * If a class includes abstract methods, then the class itself must be declared abstract.


 * Abstract method : 

 * A method that is declared without implementation is known
   as the abstract method.
 * An abstract method can only be used inside an abstract class.
 * The body of the abstract method is provided by the class that
   inherits the abstract class in which the abstract method is present.

 */