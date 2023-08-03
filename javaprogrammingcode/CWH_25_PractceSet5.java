import java.util.Scanner;

public class CWH_25_PractceSet5 {
    public static void main(String[] args) {
        //que 1
//        for (int i=4; i!=0 ; i--){
//            System.out.print("\n");
//            for (int j = i ; j!=0 ; j--){
//                System.out.print("*");
//            }
//        }


        //que 2
//        System.out.print("enter the number :");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int i =0;
//        int sum =0;
//        while (i <= 2*num - 2){
//            sum = sum +i;
//            i+=2;
//        }
//        System.out.println("The sum of the "+ num + " even numbers is "+ sum);


        //que 3
//        System.out.print("enter the number:");
//        Scanner sc1 = new Scanner(System.in);
//        int num1 = sc1.nextInt();
//        for (int i = num1 ; i <=num1* 10 ; i = i + num1){
//            System.out.println(i);
//        }


        //que 4
//        for (int i = 100 ; i != 0 ; i -=10 ){
//            System.out.println(i);
//        }


        //que 5
//        System.out.print("enter the number:");
//        Scanner sc2 = new Scanner(System.in);
//        int num2 = sc2.nextInt();
//        int fact = 1;
//        for (int i = num2 ; i != 0 ; i--){
//            fact = fact * i;
//        }
//        System.out.println(fact);


        //que 6
//        System.out.print("enter the number:");
//        Scanner sc2 = new Scanner(System.in);
//        int num2 = sc2.nextInt();
//        int fact = 1;
//        int i = num2;
//        while (i != 0){
//            fact = fact * i;
//            i--;
//        }
//        System.out.println(fact);


        //que 7
//        int i=4;
//        while (i!=0){
//            System.out.print("\n");
//            int j = i;
//            i--;
//            while (j!=0){
//                System.out.print("*");
//                j--;
//            }
//        }


        //que 8
//        System.out.println( " solution of que 8 is true");


        //que 9
//        int sum =0;
//        for (int i = 80 ; i != 0 ; i -=8 ){
//            sum = sum +i;
//        }
//        System.out.println(sum);


        //que 10
//        System.out.println("a do while loop is executed at least once ");


        //que 11
        System.out.print("enter the number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        for ( int i =0;i <= 2*num - 2;i+=2){
            sum = sum +i;
        }
        System.out.println("The sum of the "+ num + " even numbers is "+ sum);
    }
}
