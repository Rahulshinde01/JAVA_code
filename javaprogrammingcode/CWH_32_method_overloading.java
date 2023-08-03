public class CWH_32_method_overloading {
//    static void demo(){
//        System.out.println("this is the demo function call\n"+
//                "without return type");
//    }

    static void demo1(){
        System.out.println("This is the function without any parameter");
    }

    static void demo1(int a){
        System.out.println("This is the function with " + a + " as a parameter");
    }

//    static void myChoice(int [] a){
//        a[0]=77;
//    }

    public static void main(String[] args) {
//        demo();
//        int [] marks = {98,89,65,73};
//        myChoice(marks);
//        System.out.println(" the value is "+ marks[0]);
        demo1();
        demo1(10);

    }
}
