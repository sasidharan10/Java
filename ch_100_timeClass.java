import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ch_100_timeClass {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println("Date : " + d);

        LocalTime t = LocalTime.now();
        System.out.println("Time  : " + t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Date/Time : " + dt);
    }
}
