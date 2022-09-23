package cpts132.data_structures;

/**
 * A simple unbounded stack interface
 */
public interface UnboundedStack<T> {
    
    /**
     * Put a value on the top of the stack
     * @param val The value to be pushed
     */
    public void push(Object val);
    
    /**
     * Remove the top value from the stack
     * @return The value popped off the stack
     * @throws StackUnderEmpty when the stack is empty
     */
    public Object pop() throws StackUnderEmpty;
    
    /**
     * Retrieve the top value from the stack
     * @return The value from off the stack
     * @throws StackUnderEmpty when the stack is empty
     */
    public Object peek() throws StackUnderEmpty;
    
    /**
     * Check the state of the stack
     * @return True, when the stack has values
     */
    public boolean hasValues();
    
    /**
     * Get the current size of the stack.
     * (Debugging method)
     * @return The number of elements currently in the stack
     */
    public int getSize();
    
    /**
     * Get a String representation of the stack
     * (Debug method)
     * @return The string representation
     */
    public String toString();
    
}
