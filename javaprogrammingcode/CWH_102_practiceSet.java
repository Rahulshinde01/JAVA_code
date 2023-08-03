
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class CWH_102_practiceSet {
    public static void main(String[] args) {
        //que 1
        ArrayList <String> a = new ArrayList<>();
        a.add("Ram");
        a.add("Rahul");
        a.add("Rutvik");
        a.add("Rohit");
        a.add("Rishi");
        a.add("Radhika");
        a.add("Radha");
        a.add("Rushi");
        a.add("Ramesh");
        a.add("Raju");
        a.add("Ramanand");
        for (String o:a) {
            System.out.println(o);
        }

        //que2
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" +d.getSeconds() );

        //que 3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        //que 4
        LocalDateTime dt = LocalDateTime.now();

        DateTimeFormatter df =DateTimeFormatter.ofPattern("H:m:s");
        String mydt = dt.format(df);
        System.out.println(mydt);

        //que 5
        HashSet h = new HashSet();
        h.add(2);
        h.add(7);
        h.add(2);
        h.add(5);
        System.out.println(h);

    }
}
