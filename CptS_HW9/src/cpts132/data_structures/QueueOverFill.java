package cpts132.data_structures;

/**
 * Queue-state exception
 */
public class QueueOverFill extends Exception {
    
    /**
     * Create an exception object
     * @param msg The message to include in the exception
     */
    public QueueOverFill(String msg) {
        super(msg);
    }
    
}


