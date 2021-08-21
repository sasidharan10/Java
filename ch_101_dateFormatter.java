import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ch_101_dateFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // This is the date
        System.out.println("\nDate : "+dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy - E H:m a"); // This is the format
        // DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println("Date(Formatted) : "+myDate);
    }
}
