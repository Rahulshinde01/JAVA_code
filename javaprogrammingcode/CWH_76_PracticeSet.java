class Thr11 extends Thread{
    public void run(){
//        while(true){
//            System.out.println("good morning");
//        }
    }
}

class Thr22 extends Thread{
    public void run(){
//        while(true){
//            System.out.println("welcome");
//
//            //que2
////            try {
////                Thread.sleep(200);
////            }catch (Exception e){
////                System.out.println(e);
////            }
//
//        }
    }
}

public class CWH_76_PracticeSet {
    public static void main(String[] args) {

        //que 1
        Thr11 th1 = new Thr11();
        Thr22 th2 = new Thr22();

        //que 3
//        System.out.println(th1.getPriority());
//        System.out.println(th2.getPriority());
//        th1.setPriority(9);
//        th2.setPriority(5);
//        System.out.println(th1.getPriority());
//        System.out.println(th2.getPriority());

        //que 4
        System.out.println( th1.getState());
        th1.start();
        System.out.println( th1.getState());

        //que 5
        System.out.println( th2.getState());
        th2.start();
        System.out.println(Thread.currentThread().getState());

    }
}
