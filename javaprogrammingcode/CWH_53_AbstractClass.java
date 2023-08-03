abstract class MobilePhone{
    abstract  public void ringTone();
    abstract  public void powerOn();
}
class Samsung extends MobilePhone{
    @Override
    public void ringTone() {
        System.out.println("this is samsung ringtone");
    }
    @Override
    public  void powerOn(){
        System.out.println("powering on samsung mobile phone");
    }
}
abstract class Android extends MobilePhone{
    public void china (){
        System.out.println("this is the chines version");
    }

}

public class CWH_53_AbstractClass {
    public static void main(String[] args) {

//        MobilePhone m = new MobilePhone();---not possible
        Samsung s = new Samsung();
        s.ringTone();
        s.powerOn();
    }
}
