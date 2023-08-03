class C1{
    public int x = 5;
    protected int y = 10;
    int z= 15;
    private int a =20;
    void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class CWH_66_acess_modifiers {
    public static void main(String[] args) {
        C1 c = new C1();
        //acessing inside the same class
//        c.meth1();

        //accessing inside the same package
//        System.out.println(c.x);
//        System.out.println(c.y);
//        System.out.println(c.z);
//        System.out.println(c.a);
    }
}
