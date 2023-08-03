public class CWH_31_Methods {
//    static int logic (int x , int y){
//        int z = x + y;
//        return z;
//    }
    int logic (int x , int y){
        int z = x + y;
        return z;
    }
    public static void main(String[] args) {
        int a =10;
        int b = 30;
//        int c = logic(a, b);
        CWH_31_Methods obj1 = new CWH_31_Methods();
        int c = obj1.logic(a, b);
        System.out.println("sum of numbers is "+ c);
    }
}
