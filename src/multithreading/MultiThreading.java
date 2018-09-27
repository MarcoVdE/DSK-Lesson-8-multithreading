/*
 * 
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marco
 */
public class MultiThreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread runnable1 = new Thread(new ImplementsRunnable("Thread 1"));
        Thread runnable2 = new Thread(new ImplementsRunnable("Thread 2"));
        
        
        runnable1.setName("Actual Thread 1");
        runnable1.start();
        runnable2.start();
        
    }
    
}
