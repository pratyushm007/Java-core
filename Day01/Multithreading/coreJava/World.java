package Day01.Multithreading.coreJava;
//usng extends
/*public class World extends  Thread {

    @Override
    public void run() {
       // super.run();
        for(;;){
            System.out.println(Thread.currentThread().getName());
        }

    }
}
*/
//using implemets
public class World implements Runnable{

    @Override
    public void run() {
        // super.run();
        for(;;){
            System.out.println(Thread.currentThread().getName());
        }

    }
}
