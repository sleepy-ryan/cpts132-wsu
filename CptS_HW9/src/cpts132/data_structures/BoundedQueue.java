package cpts132.data_structures;

/**
 * A simple bounded queue interface
 */
public interface BoundedQueue {
    
    /**
     * Put a value on the end of the queue
     * @param val The value to be added
     * @throws QueueOverFill when the stack is full
     */
    public void add(Object val) throws QueueOverFill;
    
    /**
     * Remove the first value from the queue
     * @return The value removed from the queue
     * @throws QueueUnderEmpty when the stack is empty
     */
    public Object remove() throws QueueUnderEmpty;
    
    /**
     * Retrieve the first value in the stack
     * @return The first value in the queue
     * @throws QueueUnderEmpty when the stack is empty
     */
    public Object peek() throws QueueUnderEmpty;
    
    /**
     * Check the state of the queue 
     * @return True, when the queue has values
     */
    public boolean hasValues();
    
    /**
     * Check the state of the queue 
     * @return True, when the queue has room for new values
     */
    public boolean hasSpace();
    
    /**
     * Get the current size of the queue
     * (Debugging method)
     * @return The number of elements currently in the queue 
     */
    public int getSize();
    
    /**
     * Get the maximum size of the queue 
     * (Debugging method)
     * @return The maximum number of elements the queue can hold
     */
    public int getCapacity();
    
    /**
     * Get a String representation of the queue 
     * (Debug method)
     * @return The string representation
     */
    public String toString();
    
}
