import java.util.Scanner;

public class CWH_79_error_handling {
    public static void main(String[] args) {
        //syntax error
//        int a=4   //error - semicolon expected
//        b=5;    //variable declaration expected


        //logical error
        //print prime number between 2 to 10
        System.out.println(2);
        for (int i = 1 ; i<5 ; i++){
            System.out.println(2*i+1);
        }
        //error for un-necessary number (9)


        //runtime error
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        System.out.println("solution of 1000 divided by any number is "+ 1000/x);
        // error - for x=0  above program give runtime error

    }
}
