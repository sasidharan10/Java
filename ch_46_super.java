class Base1 {
    int number;

    Base1() {
        System.out.println("I am a base constructor");
    }

    Base1(int x) {
        number = 10;
        System.out.println("I am an overloaded constructor of base with value of x as: " + x);
    }

    public void print() {
        System.out.println("Base number : " + number);
    }
}

class Derived1 extends Base1 {
    int number;

    Derived1() {
        // super(0);
        System.out.println("I am a derived class constructor");
    }

    Derived1(int x, int y) {
        super(x);
        number = 100;
        System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
    }

    public void print() {
        System.out.println("Base number (super): " + super.number);
        System.out.println("Derived number : " + number);
    }
}

public class ch_46_super {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Derived1 d = new Derived1();
        Derived1 d = new Derived1(14, 9);
        d.print();
    }
}
/*
 * "super" keyword is used to overcome method overriding
 * we can use 'super' keyword to invoke base class methods or data members when
 * they have same name as in derived. We can also use 'super()' which will
 * invoke the constructor of base class, but not required as that is done
 * implicitly.
 * 
 */