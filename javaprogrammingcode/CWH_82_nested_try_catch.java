import java.util.Scanner;

public class CWH_82_nested_try_catch {
    public static void main(String[] args) {
//        int [] arr = new int[3];
//        arr[0]= 5;
//        arr[1]= 10;
//        arr[2]= 20;
//        Scanner s = new Scanner(System.in);
//        System.out.print("enter the index of an array :");
//        int ind = s.nextInt();
//        try {
//            System.out.println("welcome to my nested try-catch program");
//            try {
//                System.out.println("the value at a given index is "+ arr[ind]);
//
//            }catch (ArrayIndexOutOfBoundsException e1){
//
//                System.out.println("exception occurs - level 2 (ArrayIndexOutOfBoundsException)");
//                System.out.println(e1);
//
//            }
//
//        }catch (Exception e){
//            System.out.println("exception occurs - level 1");
//        }
//        System.out.println("end of program");



        int [] arr = new int[3];
        arr[0]= 5;
        arr[1]= 10;
        arr[2]= 20;
        Scanner s = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.print("enter the index of an array :");
            int ind = s.nextInt();
            try {
                System.out.println("welcome to my nested try-catch program");
                try {
                    System.out.println("the value at a given index is "+ arr[ind]);
                    flag = false;

                }catch (ArrayIndexOutOfBoundsException e1){

                    System.out.println("exception occurs - level 2 (ArrayIndexOutOfBoundsException)");
                    System.out.println(e1);

                }

            }catch (Exception e){
                System.out.println("exception occurs - level 1");
            }
        }
        System.out.println("end of program");

    }
}
