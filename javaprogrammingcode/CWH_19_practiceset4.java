import java.util.Scanner;

public class CWH_19_practiceset4 {
    public static void main(String[] args) {

        //que 2
//        System.out.println("this is the program to find whether the student is pass or fail ");
//        Scanner result = new Scanner(System.in);
//        System.out.println("Enter the marks of 1st subject :");
//        int sub1 = result.nextInt();
//        System.out.println("Enter the marks of 2nd subject :");
//        int sub2 = result.nextInt();
//        System.out.println("Enter the marks of 3rd subject :");
//        int sub3 = result.nextInt();
//        float total = (sub1 + sub2 + sub3)/3.0f;
//        if (sub1 >= 33  &&  sub2 >= 33  &&  sub3 >= 33  &&  total >= 40  )
//        {
//            System.out.println("pass");
//        }
//        else {
//            System.out.println("fail");
//        }

        //que 3
//        System.out.println("income tax calculator");
//        Scanner inc = new Scanner(System.in);
//        System.out.println("enter your income:");
//        int income = inc.nextInt();
//        if ( income >= 250000 && income<500000 ){
//            float tax1= 0.05f * income;
//            System.out.println("you have to pay "+tax1+" tax");
//        }
//        else if (income >= 500000 && income<1000000) {
//            float tax2= 0.2f * income;
//            System.out.println("you have to pay "+tax2+" tax");
//
//        }
//        else if (income >= 1000000 ) {
//            float tax3= 0.3f * income;
//            System.out.println("you have to pay "+tax3+" tax");
//
//        }
//
//        else {
//            System.out.println("you don't have to pay any tax");
//        }


        //que 4
        System.out.println("day form the number");
        System.out.println("Enter the no ");
        Scanner day = new Scanner(System.in);
        int dayNo = day.nextInt();
        switch (dayNo){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number");
        }


        //que 5
//        System.out.println("checking the error is a leap year or not");
//        System.out.println("Enter the year");
//        Scanner ly = new Scanner(System.in);
//        int year = ly.nextInt();
//        if ( (year % 4 == 0) && (year %100 !=0) || (year % 400 == 0)){
//            System.out.println("year is leap year ");
//        }
//        else {
//            System.out.println("year is not a leap year ");
//        }


        //que 6
//        System.out.println("URL finder");
//        System.out.println("Enter the url you want to find ");
//        Scanner urlobj = new Scanner(System.in);
//        String url = urlobj.nextLine();
//        if (url.endsWith(".com")){
//            System.out.println("Commercial site");
//        }
//        else if (url.endsWith(".org")) {
//            System.out.println("organization site");
//        }
//        else if (url.endsWith("in")){
//            System.out.println("indian site");
//        }
//        else {
//            System.out.println("invalid url");
//        }
    }
}
