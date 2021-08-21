class Employee {
    private int id;

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}

public class ch_40 {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setId(10);
        System.out.println("Id : "+emp1.getId());

    }
}

// accessing private data members using public member functions
// This is an example of data hiding