import java.util.Scanner;

public class CWH_18_ElseifclauseAndSwitch {
    public static void main(String[] args) {
        /*
        int age=19;
        if (age >60){
            System.out.println("you are retired");
        }
        else if (age>46){
            System.out.println("you are experienced");
        }
        else if (age>23) {
            System.out.println("you are employable");
        }
        else if (age >18) {
            System.out.println("you are adult now");
        }
        else {
            System.out.println("enjoy your life");
        }
        */

        /*
        System.out.println("Enter your string");
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        switch (str) {
            case "Rohan" -> {
                System.out.println("you are child now");
            }
            case "Rahul" -> System.out.println("you are adult now");
            case "Harry" -> System.out.println("you are men now");
            case "Mohit" -> System.out.println("you are getting old now");
            default -> System.out.println("enjoy your life");
        }
        */


        System.out.println("Enter your character");
        Scanner sc1 = new Scanner(System.in);
        char chardata=sc1.next().charAt(0);
        switch (chardata) {
            case 'R' -> {
                System.out.println("you are child now");
            }
            case 'A' -> System.out.println("you are adult now");
            case 'H' -> System.out.println("you are men now");
            case 'M' -> System.out.println("you are getting old now");
            default -> System.out.println("enjoy your life");
        }
    }
}
