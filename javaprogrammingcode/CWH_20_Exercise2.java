import java.util.Scanner;
import java.util.Random;

public class CWH_20_Exercise2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\tThis is a game called stone-paper-scissor developed using java program");
        int opNum = rand.nextInt(1,4);
        System.out.println("chose between the following :\n1)Stone\n2)paper\n3)Scissor");
        System.out.println("Enter your choice :");
        int urNum = sc.nextInt();

                if (urNum==opNum){
                    System.out.println("match draw");
                }
                else if (urNum==1 && opNum==2) {
                    System.out.println("you lost (opponent chose paper)");
                }
                else if (urNum==1 && opNum==3) {
                    System.out.println("you won (opponent chose scissor)");
                }
                else if (urNum==2 && opNum==1) {
                    System.out.println("you won (opponent chose stone)");
                }
                else if (urNum==2 && opNum==3) {
                    System.out.println("you lost (opponent chose scissor)");
                }
                else if (urNum==3 && opNum==1) {
                    System.out.println("you lost (opponent chose Stone)");
                }
                else if (urNum==3 && opNum==2) {
                    System.out.println("you won (opponent chose paper)");
                }
                else {
                    System.out.println("you entered invalid choice");
                }
    }
}
