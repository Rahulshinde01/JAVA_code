import java.util.Scanner;

public class CWH_22DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n :");
        int num = sc.nextInt();
        int i=1;
        do {
            System.out.println(i);
            i++;
        }while (i<=num);
    }
}
