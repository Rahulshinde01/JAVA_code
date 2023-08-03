class MyThr1 extends Thread{
    public MyThr1 (String name){
        super(name);
    }
    public void run(){
        int i=0;
        System.out.println("i am cooking in the kitchen------------------");
    }
}

class MyThr2 extends Thread{
    public MyThr2 (String name){
        super(name);
    }
    public void run(){
        int i=0;
        System.out.println("i am chatting");
    }
}

class ThreadRun1 extends Thread implements Runnable{
    public ThreadRun1(String name3){
        super(name3);
    }
    public void run(){
        int i=0;
        System.out.println("this  is ThreadRunner1----------------------");
    }
}

public class CWH_73_Thread_meth {
    public static void main(String[] args) {
//MyThr1 thr1 = new MyThr1("Harry");
//MyThr2 thr2 = new MyThr2("Rahul");
//
//thr1.start();
//thr2.start();
//
//        System.out.println("the name of the thread 1 is " +thr1.getName());
//        System.out.println("the name of the thread 1 is " +thr1.getId());
//        System.out.println("the name of the thread 2 is " +thr2.getName());
//        System.out.println("the name of the thread 2 is " +thr2.getId());


        ThreadRun1 bullet1 =new ThreadRun1("Harry");
        Thread gun6 = new Thread(bullet1,"Harry");
        gun6.start();
        System.out.println("the name of the thread is " +gun6.getName()+" and id is "+ gun6.getId());
    }
}
