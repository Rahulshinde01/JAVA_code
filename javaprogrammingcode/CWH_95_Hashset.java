import java.util.HashSet;

public class CWH_95_Hashset {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>(7,0.5f);
        h.add(55);
        h.add(22);
        h.add(88);
        h.add(11);
        h.add(22);

        System.out.println(h);

        h.remove(88);
        System.out.println(h);

        System.out.println(h.size());

        h.clear();
        System.out.println(h);


    }
}
