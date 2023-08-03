import java.util.Scanner;

public class CWH_23_ForLoop {
    public static void main(String[] args) {
//        System.out.println("program to print first n odd numbers");
//        Scanner sc =new Scanner(System.in);
//        System.out.print("Enter the value of n :");
//        int num = sc.nextInt();
//        for (int i=0 ; i < num ;i++){
//            System.out.println(2*i +1);
//        }


        System.out.println("program to print first n natural numbers in reverse order:");
        System.out.print("Enter the value of n :");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();
        for (int i = num1; i!=0 ; i--){
            System.out.println(i);
        }

    }
}
