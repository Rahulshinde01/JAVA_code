interface mycamera1 {
    void recordVideo();
    void hdImage();

}
interface mygps1{
    void tracking();
    private void methodM(){
        System.out.println("this is private method");
    }
    default void pickUpPoint(){
        methodM();
        System.out.println("this is my pickup point");
    }

}
class MyCellPhone1{
    public void calling(int num ){
        System.out.println("calling...."+num);
    }
    public void receivingCall(){
        System.out.println("call is being received");
    }
}
class MySmartPhone1 extends MyCellPhone1 implements mycamera1 , mygps1{
    public void takeSnap(){
        System.out.println("taking a snap");
    }
    public void recordVideo(){
        System.out.println("video is recorded");
    }
    public void hdImage(){
        System.out.println("hd photo is clicked");
    }
    public void tracking(){
        System.out.println("tracking ur location");
    }
//    public void pickUpPoint(){
//        System.out.println("this is my pickup point in the smartphone");
//    }
}

public class CWH_59_polymorphism {
    public static void main(String[] args) {
        mycamera1 m = new MySmartPhone1();
        m.recordVideo();
        MyCellPhone1 p = new MySmartPhone1();
        p.calling(231);
        MySmartPhone1 s = new MySmartPhone1();
        s.tracking();
    }
}

