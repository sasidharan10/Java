class Phone {
    int i = 10;

    public void showTime() {
        System.out.println("Time is 8 am");
    }

    public void on() {
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone {
    int i = 20;

    public void music() {
        System.out.println("Playing music...");
    }

    public void on() {
        System.out.println("Turning on SmartPhone...");
    }
}

public class ch_49_dynamic_method {
    public static void main(String[] args) {
        // Phone obj = new Phone(); // Allowed
        // SmartPhone smobj = new SmartPhone(); // Allowed
        // obj.name();

        Phone obj = new SmartPhone(); // Yes it is allowed
        // SmartPhone obj2 = new Phone(); // Not allowed

        obj.showTime(); // only methods from base can be called
        obj.on(); // overridden method is called
        // obj.music(); Not Allowed

        System.out.println(obj.i);
    }
}

/*
 * 
 * here 'Phone obj' means only reference is created. now 'Phone obj = new
 * SmartPhone();' means object is created for base class Smartphone, only
 * reference is made for 'Phone'.
 * 
 * we cannot access methods of class Smartphone because
 * 
 * data members camot be overridden.
 * 
 */
