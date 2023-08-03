class Base11{
    int x;
    Base11(){
        System.out.println("this is base class constructor");
    }
    public void method1(){
        System.out.println("this is method1 of Base11 class");
    }
}
class Derived11 extends Base11{
    @Override
    public void method1(){
        System.out.println("this is method1 of Derived11 class");
    }
}

public class CWH_48_MethodOverriding {
    public static void main(String[] args) {
        Derived11 d = new Derived11();
        d.method1();
    }
}
