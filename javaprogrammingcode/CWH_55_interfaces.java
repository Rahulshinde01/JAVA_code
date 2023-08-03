interface Cycle{
    int x =45;
    void breaks(int dec);
    void speedUp(int inc);

}
interface horn{
    void mhn();
    void kkkg();
}
class AvonCycle implements Cycle,horn{
    int x=100;
    int y = 22;
    public void breaks (int a){
        System.out.println("speed is decreased to " +a);
    }
    public void speedUp (int b){
        System.out.println("speed is increased to " +b);
    }
   public void mhn(){
        System.out.println("main ho na peeeee");
    }
    public void kkkg(){
        System.out.println("kabhi khushi kabhi gum poPopO");
    }
}

public class CWH_55_interfaces {
    public static void main(String[] args) {

        AvonCycle a = new AvonCycle();
        a.breaks(5);
        a.speedUp(10);
        a.kkkg();
        a.mhn();
//        a.x=90; ---not possible
        a.y=78;
        System.out.println(a.y);
//        System.out.println(a.x);
    }
}
