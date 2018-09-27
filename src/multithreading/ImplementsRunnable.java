/*
 * 
 */
package multithreading;

/**
 *
 * @author Marco
 */
public class ImplementsRunnable implements Runnable {

    private int countdown = 100;
    
    public ImplementsRunnable(String threadname) {
        System.out.println("Setting name to: " + threadname);
        Thread.currentThread().setName(threadname);
        System.out.println(Thread.currentThread().getName());
    }
    
    @Override
    public void run() {
        while(countdown > 0) {
            System.out.println("Countdown on thread (" + Thread.currentThread().getName() + ") value: " + countdown);
            countdown--;
        }
    }
    
}
