package cpts132.data_structures;

import cpts132.data_structures.QueueUnderEmpty;
public interface UnboundedArrayQueue {
    public boolean hasItems();
    public int getSize();
    public void enqueue(Object o);
    public Object dequeue() throws QueueUnderEmpty;
    public Object peek() throws QueueUnderEmpty;
}