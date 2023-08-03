import java.util.*;

public class CWH_91_array_list {
    public static void main(String[] args) {
        ArrayList<Integer> b = new ArrayList<>(3);
        b.add(15);
        b.add(18);
        b.add(20);

        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(5);
        a.add(6);
        a.add(5);

        a.add(0,9);
        a.add(0,8);

        a.remove(1);

        System.out.println(a);

        System.out.println(a.contains(6));

        System.out.println(a.indexOf(5));
        System.out.println(a.lastIndexOf(5));

        a.addAll(0,b);
        System.out.println(a);

        a.set(1,7);
        System.out.println(a);

        b.ensureCapacity(7);   //my 1 method

        a.clear();

        System.out.println(a.isEmpty()); //my 2 method


//        for (int i = 0; i<a.size() ;i++){
//            System.out.println(a.get(i));
//        }
    }
}
