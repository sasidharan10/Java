import java.util.*;

public class Student {
    String name;
    int rollNo;

    Student() {
        this.name = "";
        this.rollNo = 0;
    }

    
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString()
    {
        return "name: "+ this.name+"\nrollNo: "+this.rollNo;
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o)
            return true;
        if(o == null || getClass() != o.getClass())
            return false;
        Student s = (Student)o;
        return this.rollNo == s.rollNo;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(rollNo);
    }
}