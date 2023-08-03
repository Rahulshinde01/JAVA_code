interface Parent111{
    void meth1();

    void meth2();
}
interface child111 extends Parent111{
    void meth3();
    void meth4();
}
class Me implements child111{
    public void meth1(){
        System.out.println("method 1");
    }
    public void meth2(){
        System.out.println("method 2");
    }
    public void meth3(){
        System.out.println("method 3");
    }
    public void meth4(){
        System.out.println("method 4");
    }
}

public class CWH_58_inheritance_in_interfaces {
    public static void main(String[] args) {
        Me m =new Me();
        m.meth1();
        m.meth2();
        m.meth3();
        m.meth4();
    }
}
