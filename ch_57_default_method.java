interface MyCamera {
    private void greet() {
        System.out.println("\nPrivate method accessed by calling it with other methods from that interface");
    }

    default void record4KVideo() {
        greet();
        System.out.println("\nDefault method in Interface can have definition in it");
    }
}

class MySmartPhone implements MyCamera {

    public void show() {
        System.out.println("This is MySmartPhone");
    }
}

public class ch_57_default_method {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        // ms.greet(); // Throws an error!
    }
}

/*


 * default methods help to add methods with definitions inside interface.
 * private methods inside interface can only be used by other methods of that
   interface. The use of private methods, is to act as helper methods for
   default methods.
   
 * If default method has 1 more definition in its derived class, then it will be
   overridden.

 */