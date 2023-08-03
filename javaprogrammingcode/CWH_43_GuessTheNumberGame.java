import java.util.Scanner;
import java.util.Random;

class Game {
    public int numU;
    public int numC;
    public int noOfGuess=0;
    Game(){
        Random r =new Random();
        numC = r.nextInt(100);
    }
    public void takeInput(){
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number :");
        numU = s.nextInt();
    }
    public boolean isCorrect(){
        noOfGuess++;
        if (numU == numC){
            System.out.format("you guess it right, the number is %d \nyou guessed it in %d attempts",numC, noOfGuess);
            return true;
        }
        else if (numC > numU){
            System.out.println("enter higher no please ...");
        }
        else if (numC < numU){
            System.out.println("enter lower no please ...");
        }
        return false;
    }
}
public class CWH_43_GuessTheNumberGame {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b =false;
        while (!b){
            g.takeInput();
            b = g.isCorrect();
        }
    }
}
