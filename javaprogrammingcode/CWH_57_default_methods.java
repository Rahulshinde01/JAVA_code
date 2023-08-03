interface mycamera {
    void recordVideo();
    void hdImage();

}
interface mygps{
    void tracking();
    private void methodM(){
        System.out.println("this is private method");
    }
    default void pickUpPoint(){
        methodM();
        System.out.println("this is my pickup point");
    }

}
class MyCellPhone{
    public void calling(int num ){
        System.out.println("calling...."+num);
    }
    public void receivingCall(){
        System.out.println("call is being received");
    }
}
class MySmartPhone extends MyCellPhone implements mycamera , mygps{
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

public class CWH_57_default_methods {
    public static void main(String[] args) {
        MySmartPhone sp = new MySmartPhone();
        sp.pickUpPoint();
        sp.recordVideo();
        sp.hdImage();
        sp.tracking();
        sp.calling(991);
        sp.takeSnap();
    }
}
