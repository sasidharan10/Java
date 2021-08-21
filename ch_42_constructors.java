class student{
    private int rno;
    private String name;
    public student(){
        rno=10;
        name="Messi";
    }
    public student(int rno){
        this.rno=rno;
        name="Ronaldo";
    }
    public student(int rno,String name){
        this.rno=rno;
        this.name=name;
    }
    public void print(){
        System.out.println("Name : "+name);
        System.out.println("Rno  : "+rno);
    }
}
public class ch_42_constructors {
    public static void main(String[] args) {
        // constructor overloading
        student s1=new student();
        student s2=new student(7);
        student s3=new student(9,"Lewandowski");
        s1.print();
        s2.print();
        s3.print();
    }
}
