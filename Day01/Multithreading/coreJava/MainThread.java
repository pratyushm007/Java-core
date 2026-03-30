package Day01.Multithreading.coreJava;
//using extend
//public class MainThread{
//    public static void main(String[] args) {
//        World  wd=new World();
//        wd.start();
//
//        for(;;) {
//            System.out.println(Thread.currentThread().getName());
//        }
//    }
//}
public class MainThread{
    public static void main(String[] args) {
        World  wd=new World();//thread new state-
        Thread t1=new Thread(wd);
        t1.start();//Runnable means cit is ready to run waiting for the cpu time

        for(;;) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}