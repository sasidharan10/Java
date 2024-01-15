public class emp {
    String name;
    int empNo;

    emp() {
        this.name = "";
        this.empNo = 0;
    }

    emp(String name, int empNo) {
        this.name = name;
        this.empNo = empNo;
    }

    @Override
    public String toString() {
        return "name: " + this.name + "\nrollNo: " + this.empNo;
    }
}
