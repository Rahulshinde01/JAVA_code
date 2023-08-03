public class CWH_34_Recursion_method {
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }

    static int factorial_iteration(int n){
        if(n==0 || n==1 ){
            return 1;
        }
        else {
            int fact = 1;
            for (int i =1; i<=n ; i++){
                fact*=i;
            }
            return fact;
        }
    }

    public static void main(String[] args) {
        int n= 5;
        System.out.println("factorial of a number is "+ factorial(n));
        System.out.println("factorial of a number is "+ factorial_iteration(n));
    }
}
