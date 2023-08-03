import java.util.Scanner;

public class CWH_06_exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total marks of each subject");
        float max_mark = sc.nextInt();
        System.out.println("enter the marks of subject 1 :");
        float sub1 = sc.nextInt();
        System.out.println("enter the marks of subject 2 :");
        float sub2 = sc.nextInt();
        System.out.println("enter the marks of subject 3 :");
        float sub3 = sc.nextInt();
        System.out.println("enter the marks of subject 4 :");
        float sub4 = sc.nextInt();
        System.out.println("enter the marks of subject 5 :");
        float sub5 = sc.nextInt();

        float total = sub1 + sub2 + sub3 + sub4 + sub5 ;
        float total1 = max_mark * 5;
        float avg = (total / total1) * 100;
        System.out.println(" Percentage of the student is ");
        System.out.println(avg);
        
    }
}
