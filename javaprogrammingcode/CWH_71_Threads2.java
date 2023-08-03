class ThreadRunner1 implements Runnable{
    public void run(){
        int i=0;
        while(i<50000){
            System.out.println("this  is ThreadRunner1----------------------");
            i++;
        }
    }
}

class ThreadRunner2 implements Runnable{
    public void run(){
        int i=0;
        while(i<50000){
            System.out.println("this  is ThreadRunner2");
            i++;
        }
    }
}


public class CWH_71_Threads2 {
    public static void main(String[] args) {
        ThreadRunner1 bullet1 =new ThreadRunner1();
        Thread gun1 = new Thread(bullet1);

        ThreadRunner2 bullet2 =new ThreadRunner2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
