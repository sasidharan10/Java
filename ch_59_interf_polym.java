interface base2 {
    void print();
}

class sample implements base2 {
    public void print() {
        System.out.println("This is Interface method");
    }

    public void show() {
        System.out.println("This is class method");
    }

}

public class ch_59_interf_polym {
    public static void main(String[] args) {
        base2 b = new sample();
        // b.show();

        // since the reference is created for 'base2', we can only access methods of
        // 'base2'
        b.print();
    }
}
/*
 * here we created a reference to interface base2 and created object for sample
 * class.
 * 
 * since the reference is for base1, we can access methods of base1 only.
 * 
 */