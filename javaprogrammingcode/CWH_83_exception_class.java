import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return " this is toString()";
    }

    @Override
    public String getMessage() {
        return " this is getMessage()";
    }
}

public class CWH_83_exception_class {
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number:");
        a = s.nextInt();
        if (a< 7){
            try {
                throw new MyException();

            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();

            }
        }

    }
}
