class Base1 {
    int x;
    public void fun(Base1 obj){
        System.out.println("the value of x through this keyword using function as fun is "+ obj.x);
    }
    Base1 (int a){
        System.out.println("this is base class constructor");
        this.x=a;
    }
    public void out(){
        System.out.println("value of x is "+ x);
        fun(this);
    }

}

class Derived1 extends Base1{
    Derived1(int m){
        super(m);
        System.out.println("this is derived class constructor ");
    }
}

public class CWH_47_this_and_super {
    public static void main(String[] args) {
//        Base1 b= new Base1(5);
//        b.out();
        Derived1 d = new Derived1(10);
        d.out();

    }
}
