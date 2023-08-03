class MyThr11 extends Thread{
    public void run(){
        int i=0;
        while(i<5000){
            System.out.println("this  is MyThr11");
                    try {
                        Thread.sleep(455);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
            i++;
        }
    }
}

class MyThr22 extends Thread{
    public void run(){
        int i=0;
        while(i<5000){
            System.out.println("this  is MyThr22 ----------------------");

            i++;
        }
    }
}
public class CWH_75_thread_mathods {
    public static void main(String[] args) {

        MyThr11 th1 = new MyThr11();
        MyThr22 th2 = new MyThr22();

        th1.start();
//        try {
//            th1.join();
//        }catch (Exception e){
//            System.out.println(e);
//        }
        th2.start();

    }
}
