import utility.access;

class derivedAccess extends access {
    public int aa = 10;
    protected int bb = 20;
    int cc = 30; // default
    private int dd = 40;
    int ee = dd; // dummy

    public void show() {
        access ac = new access();
        System.out.println("\nAccessing members Outside a Package...\n");
        System.out.println("Public : " + ac.a);
        // public members can be accessed from anywhere

        System.out.println("Protected : " + b);
        // protected members can be accessed outside package only if it is derived
        // from that class.

        // System.out.println("Default : " + c);
        // default members cannot be accessed outside package

        // System.out.println("Private : " + d);
        // private members cannot be accessed outside its own class
    }
}

class childDerived{
    protected int p=60;
    public void show() {
        System.out.println("\nNow Within a Package...\n");
        derivedAccess da = new derivedAccess();
        System.out.println("Public : " + da.aa);
        // public members can be accessed from anywhere

        System.out.println("Protected : " + da.bb);
        // protected members can be accessed anywhere inside its package

        System.out.println("Default : " + da.cc);
        // default members can be accessed inside package from anywhere

        // System.out.println("Private : " + d);
        // private members cannot be accessed outside its own class
    }
}

public class ch_66_access_level {
    public static void main(String[] args) {
        derivedAccess da = new derivedAccess();
        childDerived cd = new childDerived();
        da.show();
        cd.show();
    }
}
