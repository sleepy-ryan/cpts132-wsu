/**
 * @Author Ryan Garbutt
 * Cpts 132
 * Spring 2021
 * HW9 Stack/Queue Implementation
 */

package cpts132.data_structures;

import cpts132.data_structures.ListNode;
import cpts132.data_structures.QueueOverFill;
import cpts132.data_structures.QueueUnderEmpty;
public class BoundedLinkedListQueue implements BoundedArrayQueue{
    protected ListNode front, rear;
    private int size;
    private int maxSize;

    public BoundedLinkedListQueue(int maxSize) {
        front = null;
        rear = null;
        size = 0;
        this.maxSize = maxSize;
    }

    @Override
    public boolean hasItems() {
        return front == null;
    }

    public int getSize() {
        return size;
    }

    public void enqueue(Object data) throws QueueOverFill {
        if (!hasRoom())
            throw new QueueOverFill("Queue is full, cannot add element.");
        ListNode node = new ListNode(data, null);
        if (rear == null) {
            front = node;
            rear = node;
        } else {
            rear.setNextNodeRef(node);
            rear = rear.getNextNodeRef();
        }
        size++;
    }

    public Object dequeue() throws QueueUnderEmpty {
        if (hasItems())
            throw new QueueUnderEmpty(
                    "Queue is empty, cannot delete element.");
        ListNode node = front;
        front = node.getNextNodeRef();
        if (front == null)
            rear = null;
        size--;
        return node.getValue();
    }

    public Object peek() throws QueueUnderEmpty {
        if (hasItems())
            throw new QueueUnderEmpty(
                    "Queue is empty, cannot peek");
        return front.getValue();
    }

    public void display() {
        System.out.print("\nQueue = ");
        if (size == 0) {
            System.out.print("Empty\n");
            return;
        }
        ListNode ptr = front;
        while (ptr != rear.getNextNodeRef()) {
            System.out.print(ptr.getValue() + " ");
            ptr = ptr.getNextNodeRef();
        }
        System.out.println();
    }
    public static void main(String a[]) {
        try {
            BoundedLinkedListQueue sl = new BoundedLinkedListQueue(4);
            sl.enqueue(34);
            sl.enqueue(243);
            sl.enqueue(549);
            sl.enqueue(5494);
            sl.dequeue();
            sl.dequeue();
            sl.display();
            sl.dequeue();
            Object topElement = sl.peek();
            System.out.println(topElement);
        } catch (QueueUnderEmpty e) {
            e.printStackTrace();
        } catch (QueueOverFill e) {
            e.printStackTrace();
        }
    }
    @Override
    public boolean hasRoom() {
        return this.maxSize > this.size;
    }
}