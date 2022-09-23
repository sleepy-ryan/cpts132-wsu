package cpts132.data_structures;

import cpts132.data_structures.QueueOverFill;
import cpts132.data_structures.QueueUnderEmpty;
public interface BoundedArrayQueue {
    public boolean hasRoom();
    public boolean hasItems();
    public int getSize();
    public void enqueue(Object o) throws QueueOverFill;
    public Object dequeue() throws QueueUnderEmpty;
    public Object peek() throws QueueUnderEmpty;
}