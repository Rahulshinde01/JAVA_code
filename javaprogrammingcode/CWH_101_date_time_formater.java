import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWH_101_date_time_formater {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df =DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String mydt = dt.format(df);
        System.out.println(mydt);

        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String mydt2 = dt.format(df2);
        System.out.println(mydt2);

        DateTimeFormatter df3 =DateTimeFormatter.ofPattern("dd-MM-yyyy  --  H:m:s a");
        String mydt3 = dt.format(df3);
        System.out.println(mydt3);
    }
}
