abstract class Pen{
    abstract public void write();
    abstract public void refill();

}
class FountainPen extends Pen{
        public void write(){
        System.out.println("writing using pen ");
    }
    public void refill(){
        System.out.println("refilling pen ");
    }
    public void changeNib(){
        System.out.println("changing the nib");
    }
}

abstract class Monkey{
    abstract void jump();
    public void bite(){
        System.out.println("can bite");
    }
}
interface basicAnimal {
    void eat();
    void sleep();
}

class Human extends Monkey implements basicAnimal{
    public void jump(){
        System.out.println("can jump");
    }
    public void eat(){
        System.out.println("can eat");
    }
    public void sleep(){
        System.out.println("can sleep");
    }
}

abstract class Telephone{
    abstract public void ring ();
    abstract public void lift ();
    abstract public void disconnect ();
}
class SmartTelephone extends Telephone{
   public void ring (){
        System.out.println("ringing");
    }
    public void lift (){
        System.out.println("lift the phone");
    }
    public void disconnect (){
        System.out.println("cut the call");
    }
}

interface TvRemote{
    void changeChannel();
}
interface SmartTvRemote extends TvRemote{
}
class Tv implements SmartTvRemote {
    public void changeChannel(){
        System.out.println("change the channel");
    }
}

public class CWH_60PracticeSet {
    public static void main(String[] args) {

        //que 1 and 2
//        FountainPen f = new FountainPen();
//        f.changeNib();
//        f.write();

        //que 3
//        Human h = new Human();
//        h.jump();
//        h.bite();
//        h.eat();
//        h.sleep();

        //que 4
//        Telephone s = new SmartTelephone();
//        s.ring();
//        s.lift();
//        s.disconnect();

        //que 5
//        Monkey m = new Human();
//        m.jump();
//        m.bite();
//        basicAnimal b = new Human();
//        b.eat();

        //que 6 and 7
        SmartTvRemote s = new Tv();
        s.changeChannel();
        TvRemote t = new Tv();
        t.changeChannel();
    }
}
