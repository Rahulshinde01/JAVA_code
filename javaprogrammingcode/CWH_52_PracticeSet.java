class Circle1{
    public int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}
class Cylinder1 extends Circle1{
    public int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
    }
    public double volume (){
        return Math.PI*radius*radius*height;
    }
}

class Rectangle1{
    public int length;
    public int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public double area (){
        return length*breadth;
    }

}
class Cuboid1 extends Rectangle1{
    public int height ;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea (){
        return 2*length*breadth + 2*length*height + 2*breadth*height;
    }

    public double volume (){
        return length * breadth * height;
    }


}
public class CWH_52_PracticeSet {
    public static void main(String[] args) {

        //que 1 and 3
//        Cylinder1 c =new Cylinder1();
//        c.setHeight(12);
//        c.setRadius(3);
//        System.out.format("radius is %d and height is %d", c.getRadius(), c.getHeight());
//        System.out.println("\narea of circle is "+c.area());
//        System.out.println("surface area of cylinder "+ c.surfaceArea());
//        System.out.println("volume of the cylinder "+ c.volume());

        //que 2 and 4
        Cuboid1 c = new Cuboid1();
        c.setHeight(10);
        c.setBreadth(7);
        c.setLength(12);
        System.out.format("length is %d breadth is %d and height is %d ", c.length, c.breadth, c.height);
        System.out.println("\narea of rectangle is "+ c.area());
        System.out.println("surface area of cuboid is "+ c.surfaceArea());
        System.out.println("volume of cuboid is "+ c.volume());
    }
}
