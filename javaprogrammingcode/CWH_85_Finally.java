public class CWH_85_Finally {
//    public static int demo(){
//        try {
//            int a=10;
//            int b=0;
//            int c = a/b;
//            return c;
//        }catch (Exception e){
//            System.out.println("exception occurs");
//        }
//        finally {
//            System.out.println("cleaning up resources .....");
//        }
//        return 0;
//    }
    public static void main(String[] args) {
//        int x = demo();
//        System.out.println(x);
        int a = 20;
        int b=5;
        while (true){
            try {
                int c = a/b;
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("value of b is "+ b);
            }
            b--;
        }

        try {
            System.out.println(50/0);
        }
        finally {
            System.out.println("this is finally");
        }
    }
}
