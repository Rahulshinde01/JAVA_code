public class CWH_33_Var_Arg {
//    static int sum (int ...arr){
//        // here function parameter is defined as int [] arr
//        int total =0;
//        for (int a : arr){
//            total+=a;
//        }
//        return total;
//    }

    static int sum (int x, int ...arr){
        int total =x;
        for (int a : arr){
            total+=a;
        }
        return total;
    }

    public static void main(String[] args) {
//        System.out.println("the sum of 0 argument is "+ sum());
        System.out.println("the sum of 1 argument is "+ sum(2));
        System.out.println("the sum of 2 argument is "+ sum(5,7));
        System.out.println("the sum of 3 argument is "+ sum(5,10,3));
    }
}
