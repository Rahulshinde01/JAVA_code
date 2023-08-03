import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CWH_100_Date_time {
    public static void main(String[] args) {

        LocalTime t  =LocalTime.now();
        System.out.println(t);

        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}
