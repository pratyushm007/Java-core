package Day01.Multithreading.coreJava;

public class MyThread  extends Thread{
    @Override
    public void run() {
        System.out.println("Running bro");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println((e));
        }

    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1= new MyThread();// new
        System.out.println(t1.getState());
        t1.start();//runnable
        System.out.println(t1.getState());

        Thread.sleep(100);//all this are running inside main method
        //main thread wrorking // so we stop the main thread for 100 ms
        //so that os/jvm can start the run()
        System.out.println(t1.getState());
        t1.join();

    }
}
