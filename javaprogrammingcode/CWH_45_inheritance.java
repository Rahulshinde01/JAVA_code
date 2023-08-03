class Animals{
    int x=5;
    public void eats(){
        System.out.println("they can eat");
    }
    public void fun(){
        System.out.println("x =" + x);
    }

}
class Dog extends Animals {
    public void sound(){
        System.out.println("they can bark");
    }
}

public class CWH_45_inheritance {
    public static void main(String[] args) {
        Animals a= new Animals();
        a.eats();
        Dog d = new Dog();
        d.eats();
        d.sound();
    }
}
