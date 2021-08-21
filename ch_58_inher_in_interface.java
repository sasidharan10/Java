
interface sample1 {
    void meth1();
}

interface childsample1 extends sample1 {  // inheriting sample1 in childsample1
    void meth2();
}

class SampleClass implements childsample1 {
    public void meth1() {
        System.out.println("meth1");
    }

    public void meth2() {
        System.out.println("meth2");
    }
}

public class ch_58_inher_in_interface {
    public static void main(String[] args) {
        SampleClass obj = new SampleClass();
        obj.meth1();
        obj.meth2();
    }
}

/*

Inhertance in Interface

*/