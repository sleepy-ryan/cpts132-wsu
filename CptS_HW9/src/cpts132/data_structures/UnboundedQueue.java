package cpts132.data_structures;

/**
 * A simple unbounded queue interface
 */
public interface UnboundedQueue {
    
    /**
     * Put a value on the end of the queue 
     * @param val The value to be added
     */
    public void add(Object val);
    
    /**
     * Remove the first value from the queue 
     * @return The value remvoed from the queue 
     * @throws QueueUnderEmpty when the queue is empty
     */
    public Object remove() throws QueueUnderEmpty;
    
    /**
     * Retrieve the top value from the queue 
     * @return The value from off the queue 
     * @throws QueueUnderEmpty when the queue is empty
     */
    public Object peek() throws QueueUnderEmpty;
    
    /**
     * Check the state of the queue 
     * @return True, when the queue has values
     */
    public boolean hasValues();
    
    /**
     * Get the current size of the queue 
     * (Debugging method)
     * @return The number of elements currently in the stack
     */
    public int getSize();
    
    /**
     * Get a String representation of the queue 
     * (Debug method)
     * @return The string representation
     */
    public String toString();
    
}
