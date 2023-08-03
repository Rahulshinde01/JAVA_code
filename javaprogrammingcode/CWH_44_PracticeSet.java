import java.util.Scanner;

class Cylinder {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea(){
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }

    //que 3

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
}
class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 12;
        this.breadth = 7;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
class Sphere {
    private int  radius ;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

public class CWH_44_PracticeSet {
    public static void main(String[] args) {
//        Cylinder c = new Cylinder();
//        //que 1
//        c.setHeight(12);
//        c.setRadius(3);
//        System.out.println(c.getHeight());
//        System.out.println(c.getRadius());
//
//        //que 2
//        System.out.println("surface area is "+c.surfaceArea());
//        System.out.println("volume is "+c.volume());

        //que 3
//        Cylinder c = new Cylinder(4, 14);
//        System.out.println(c.getHeight());
//        System.out.println(c.getRadius());

        //que 4
//        Rectangle r = new Rectangle(50,24);
//        System.out.println(r.getBreadth());
//        System.out.println(r.getLength());

        //que 5
        Sphere s= new Sphere();
        s.setRadius(9);
        System.out.println(s.getRadius());

    }
}
