
class Phone {
    public void dAndTime(){
        System.out.println("time is 10pm");
    }
    public void on(){
        System.out.println("turning on phone ...");
    }
}
class SmartPhone extends Phone{
    public void streaming (){
        System.out.println("streaming is on ");
    }
    public void on(){
        System.out.println("turning on smartphone ...");
    }
}
public class CWH_49_dynamic_method_dispatch{
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
       obj.on();
       obj.dAndTime();
//       obj.streaming();
    }
}
