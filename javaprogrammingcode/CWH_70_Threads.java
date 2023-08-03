class Thread1 extends Thread{

    @Override
    public void run(){
        int i=0;
        while(i<50000){
            System.out.println("i am cooking in the kitchen");
            i++;
        }
    }
}

class Thread2 extends Thread{

    @Override
    public void run(){
        int i=0;
        while(i<50000){
            System.out.println("i am chatting");
            i++;
        }
    }
}

public class CWH_70_Threads {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();
        th1.start();
        th2.start();
    }
}
