interface monkey {
    void eat();

    void sleep();
}

class halfHuman {
    public void fire() {
        System.out.println("Invents Fire...");
    }
}

class human extends halfHuman implements monkey {
    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

    public void speak() {
        System.out.println("Speaking...");
    }
}

public class ch_60_exercise {
    public static void main(String[] args) {
        monkey m = new human();
        // using human as monkey
        m.eat();
        m.sleep();
        // m.speak(); // gives error as the reference is of monkey
    }
}

/*
 * here we use polymorphism by making the reference of monkey so that we can use
 * only the methods of monkey by the object of human
 * 
 */