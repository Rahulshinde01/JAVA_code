import java.util.*;

public class CWH_83_De_Queue {
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.add(30);
        d.add(55);
        d.add(43);

        d.addFirst(123);
        d.offerFirst(987);

        d.addLast(2);
        d.offerLast(5);

        System.out.println(d.getFirst());
        System.out.println(d.getLast());
    }
}
