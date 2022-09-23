package cpts132.data_structures;

import cpts132.data_structures.StackUnderEmpty;
public interface UnboundedArrayStack {
    public boolean hasItems();
    public int getSize();
    public void push(Object o);
    public Object pop() throws StackUnderEmpty;
    public Object peek() throws StackUnderEmpty;
}

