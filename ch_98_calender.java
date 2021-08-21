import java.util.*;

public class ch_98_calender extends Thread {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Current year is : "+ c.get(Calendar.YEAR));
        System.out.println("Current month is : "+ c.get(Calendar.MONTH));
        //The indexing for month field ranges from [0,11]
        System.out.println("Current day is : "+ c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Current Time is : "+ c.get(Calendar.HOUR_OF_DAY)+" : "+ c.get(Calendar.MINUTE)+" : "+c.get(Calendar.SECOND));

        // Calculations with time

        System.out.println("\nCurrent date is : " + c.getTime());
        c.add(Calendar.YEAR, 4);
        System.out.println("After 4 years  : "+ c.getTime());
        c.add(Calendar.YEAR, -12);
        System.out.println("Before 12 years  : "+ c.getTime());
        c.add(Calendar.MONTH,2);
        System.out.println("After 2 months  : "+ c.getTime());

        GregorianCalendar cal = new GregorianCalendar();
        System.out.println("\n2018 is Leap year ? : "+cal.isLeapYear(2018));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}
