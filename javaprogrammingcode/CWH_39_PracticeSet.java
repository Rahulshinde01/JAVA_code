import java.util.Scanner;

class MyEmployee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public String setName(){
        System.out.println("Enter the name :");
        Scanner sc = new Scanner(System.in);
        String modName = sc.next();
        return modName;
    }
}

class Circle {
    int radius;
    double area;
    double perimeter;
    public void getRadius(){
        System.out.print("Enter the radius of the circle :");
        Scanner sc1 = new Scanner(System.in);
        radius = sc1.nextInt();

    }
    public void getArea(){
        area =(3.14 *radius*radius) ;
        System.out.println("The area of the circle :" + area);

    }
    public void getPerimeter(){
        perimeter =(2 * 3.14 *radius) ;
        System.out.println("The perimeter of the circle :"+ perimeter);
    }

}
public class CWH_39_PracticeSet {
    public static void main(String[] args) {
        //que 1
//        MyEmployee harry = new MyEmployee();
//        harry.salary=23000;
//        harry.name="CodeWithHarry";
//        System.out.println("The name of the employee is " + harry.getName() + "\nThe id of the employee is "+ harry.getSalary());
//        System.out.println("modified name is "+ harry.setName());


        //que 6
//        Circle cr = new Circle();
//        cr.getRadius();
//        cr.getArea();
//        cr.getPerimeter();
    }
}

