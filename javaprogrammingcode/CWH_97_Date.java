import java.util.Date;
import java.util.Locale;

public class CWH_97_Date {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getSeconds());  // deprecated
        System.out.println(d.getDate());    // deprecated
        System.out.println(d.getYear());    // deprecated
        System.out.println(d.getHours());    // deprecated


    }
}
