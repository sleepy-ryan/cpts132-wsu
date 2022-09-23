package cpts132.data_structures;

/**
 * A simple bounded stack interface
 */
public interface BoundedStack {
    
    /**
     * Put a value on the top of the stack
     * @param val The value to be pushed
     * @throws StackOverFill when the stack is full
     */
    public void push(Object val) throws StackOverFill;
    
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
     * Check the state of the stack
     * @return True, when the stack has room for new values
     */
    public boolean hasSpace();
    
    /**
     * Get the current size of the stack.
     * (Debugging method)
     * @return The number of elements currently in the stack
     */
    public int getSize();
    
    /**
     * Get the maximum size of the stack.
     * (Debugging method)
     * @return The maximum number of elements the stack can hold
     */
    public int getCapacity();
    
    /**
     * Get a String representation of the stack
     * (Debug method)
     * @return The string representation
     */
    public String toString();
    
}
