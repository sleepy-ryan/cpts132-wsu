package cpts132.data_structures;

import cpts132.data_structures.StackOverFill;
import cpts132.data_structures.StackUnderEmpty;

public interface BoundedArrayStack {
    public boolean hasItems();
    public boolean hasRoom();
    public int getSize();
    public void push(Object o) throws StackOverFill;
    public Object pop() throws StackUnderEmpty;
    public Object peek() throws StackUnderEmpty;
}