class MyThr21 extends Thread{
    public MyThr21 (String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<50000){
            System.out.println("this  is MyThr2 ----------------------"+ this.getName());
            i++;
        }
    }
}

public class CWH_74_Threads_priority {
    public static void main(String[] args) {
        MyThr21 th21=new MyThr21("Rahul");
        MyThr21 th22=new MyThr21("Harry");
        MyThr21 th23=new MyThr21("Mohan");
        MyThr21 th24=new MyThr21("Ram");
        th21.setPriority(Thread.MIN_PRIORITY);
        th22.setPriority(Thread.MIN_PRIORITY);
        th24.setPriority(Thread.MIN_PRIORITY);
        th23.setPriority(Thread.MAX_PRIORITY);
        th21.start();
        th22.start();
        th23.start();
        th24.start();
    }
}
