import java.util.Scanner;
class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return " i/p cant be 8 or 9";
    }

    @Override
    public String getMessage() {
        return " this is getMessage()";
    }
}
class DivideByZeroException extends Exception{
    @Override
    public String toString() {
        return " cant divide by 0 ";
    }

    @Override
    public String getMessage() {
        return " this is getMessage()";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString() {
        return " i/p cant be greater than 100000";
    }

    @Override
    public String getMessage() {
        return " this is getMessage()";
    }
}
class InvalidMultiInputException extends Exception{
    @Override
    public String toString() {
        return " i/p cant be greater than 7000 for multiplication";
    }

    @Override
    public String getMessage() {
        return " this is getMessage()";
    }
}
class CustomCalculator{

    public double add(int a , int b) throws InvalidInputException, MaxInputException{
        if(a==8 || b==9){
            throw new InvalidInputException();
        }
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a+b;
    }
    public double sub(int a , int b) throws MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a-b;
    }
    public double mult(int a , int b) throws InvalidMultiInputException,MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }

        if (a>7000 || b>7000) {
            throw new InvalidMultiInputException();
        }
        return a*b;
    }
    public double div(int a , int b) throws DivideByZeroException, MaxInputException{
        if (b==0) {
            throw new DivideByZeroException();
        }
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a/b;
    }
}
public class CWH_87_PracticeSet {
    public static void main(String[] args) throws InvalidInputException,DivideByZeroException,MaxInputException,InvalidMultiInputException{

        CustomCalculator c = new CustomCalculator();
//        c.add(1000000,9);
//        c.sub(1000000,3);
        c.mult(90000,1000000);
//        c.div(10000000,0);
        /*
        Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9 for addition
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
         */

    }
}
