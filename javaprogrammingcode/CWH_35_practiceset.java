import javax.swing.plaf.IconUIResource;

public class CWH_35_practiceset {
    //que 1
//    static void multiTable(int n){
//        for (int i=n; i<=(n*10) ; i+=n){
//            System.out.println(i);
//        }
//    }
//    public static void main(String[] args) {
//        int num = 6;
//        System.out.println("multiplication table of "+num+" is");
//        multiTable(num);
//    }

    //que2
//    static void pattern(){
//        for (int j=1; j<=4 ;j++ ){
//            for(int i = 1; i<=j ; i++){
//                System.out.print("*" + " ");
//            }
//            System.out.println("");
//        }
//    }
//
//    public static void main(String[] args) {
//        pattern();
//    }


    //que 3
//    static int multiOfNaturalNum(int n){
//        if (n==1){
//            return 1;
//        }
//        else {
//            return n + multiOfNaturalNum(n-1);
//        }
//    }
//
//    public static void main(String[] args) {
//        int n = 7;
//        System.out.println("sum of n natural numbers is "+ multiOfNaturalNum(n));
//    }


    //que4
//    static void pattern1(){
//        for (int j=4; j!=0 ;j-- ){
//            for(int i = j; i!=0  ; i--){
//                System.out.print("*" + " ");
//            }
//            System.out.println("");
//        }
//    }
//
//    public static void main(String[] args) {
//        pattern1();
//    }


    //que 5
    // Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
//    static int fibo(int n){
//        if (n==1 || n==2){
//            return (n-1);
//        }
//        else {
//            return fibo(n-1) + fibo(n - 2);
//        }
//    }
//
//    public static void main(String[] args) {
//        int result = fibo(5);
//        System.out.println(result);
//    }


    //que 6
//    static float avgNum(float ...arr){
//        float total =0;
//        float count = 0;
//        for (float element : arr){
//            total+=element;
//            count++;
//        }
//
//        return (total/count);
//    }
//
//    public static void main(String[] args) {
//        float avg = avgNum(2,3,5,5) ;
//        System.out.println("avg of the numbers is "+avg);
//    }


    //que 7
//    static void pattern_rec(int n){
//        if (n>0){
//            for (int i =0; i<n;i++){
//                System.out.print("*");
//            }
//            System.out.println();
//            pattern_rec(n-1);
//        }
//    }
//
//    public static void main(String[] args) {
//        pattern_rec(4);
//    }



    //que 8
//        static void pattern_rec(int n){
//            if (n>0){
//                pattern_rec(n-1);
//                for (int i =0; i<n;i++){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//
//        }
//
//    public static void main(String[] args) {
//        pattern_rec(4);
//    }



    // que 9
//    static int cToF_convertor(int c){
//        int feren =(c * 9/5) + 32 ;
//        return feren;
//    }
//    public static void main(String[] args) {
//        int result = cToF_convertor(25);
//        System.out.println(result);
//    }



    //que 10
//        static int sumOfNaturalNum(int n){
//            int sum = 0;
//            for (int i =n ; i!=0; i--){
//                sum = sum + i;
//            }
//            return sum ;
//
//    }
//
//    public static void main(String[] args) {
//        int n = 7;
//        System.out.println("sum of n natural numbers is "+ sumOfNaturalNum(n));
//    }



    //my extra --- workfibonachi series calculation
//    static int fiboSeries(int n){
//        if (n ==1){
//            return 0;
//        }
//        else if (n == 2) {
//            return 1;
//        }
//        else {
//            int a= 0;
//            int b = 1;
//            int count =2;
//            int sum =b;
//            while (count!=n){
//                sum = sum +a;
//                a=sum - a;
//                count++;
//            }
//            return sum;
//        }
//    }
//
//    public static void main(String[] args) {
//        int ans = fiboSeries(9);
//        System.out.println("the nth term is "+ans);
//
//    }


}
