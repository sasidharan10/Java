import utility.sum; // importing 'sum' class from 'utility' package 

public class ch_65_create_pack {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        sum s = new sum(); // creating object to access class sum.
        System.out.println("Sum : " + s.Sum(a, b)); // using 'Sum' method from sum class using object
    }
}
