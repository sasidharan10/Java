import java.util.Date;

public class ch_97_date_class {
    public static void main(String[] args) {
        Date d= new Date();
        System.out.println("Day : "+d.getDay());
        System.out.println("Date : "+d.getDate());
        System.out.println("Month : "+d.getMonth());
        System.out.println("Year : "+(d.getYear()+1900));
    }
}
