import java.util.Scanner;

public class CWH_81_specific_exception {
    public static void main(String[] args) {
        int [] arr = new int[3];
        arr[0]= 5;
        arr[1]= 10;
        arr[2]= 20;
        Scanner s = new Scanner(System.in);
        System.out.print("enter the index of an array :");
        int ind = s.nextInt();
        System.out.print("enter the number you want to divide with :");
        int num = s.nextInt();

        try {
            System.out.println("the value of given index is "+ arr[ind]);
            System.out.println("the result of the division is " + arr[ind]/num);
        }catch (ArithmeticException e){
            System.out.println(" ArithmeticException occurs ");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" ArrayIndexOutOfBoundsException occurs ");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("un-identified exception occurs ");
            System.out.println(e);
        }
    }
}
