class Base {
    int x;
    Base(){
        System.out.println("this is default constructor of base class");
    }
    Base (int x){
        System.out.println("this is parameterised constructor of base class with value of x ="+x);
    }
}
class Derived extends Base {
    int y;
    Derived(){
        super(5);
        System.out.println("this is default constructor of derived class");
    }
        }

public class CWH_46_constructor_in_inheritance {
    public static void main(String[] args) {
        Derived d = new Derived();

    }
}
