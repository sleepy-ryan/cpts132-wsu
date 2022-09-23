/**
 * @Author Ryan Garbutt
 * Cpts 132
 * Spring 2021
 * HW9 Stack/Queue Implementation
 */

package cpts132.data_structures;

import cpts132.data_structures.ListNode;
import cpts132.data_structures.QueueUnderEmpty;
public class UnboundedLinkedListQueue implements UnboundedArrayQueue {
    protected ListNode front, rear;
    public int size;
    /* Constructor */
    public UnboundedLinkedListQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    @Override
    public boolean hasItems() {
        return front == null;
    }

    public int getSize() {
        return size;
    }

    public void enqueue(Object data) {
        ListNode nptr = new ListNode(data, null);
        if (rear == null) {
            front = nptr;
            rear = nptr;
        } else {
            rear.setNextNodeRef(nptr);
            rear = rear.getNextNodeRef();
        }
        size++;
    }

    public Object dequeue() throws QueueUnderEmpty {
        if (hasItems())
            throw new QueueUnderEmpty("Queue is empty, dequeue operation cannot be performed.");
        ListNode ptr = front;
        front = ptr.getNextNodeRef();
        if (front == null)
            rear = null;
        size--;
        return ptr.getValue();
    }

    public Object peek() throws QueueUnderEmpty {
        if (hasItems())
            throw new QueueUnderEmpty("Queue is empty, peek operation cannot be performed.");
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
            UnboundedLinkedListQueue sl = new UnboundedLinkedListQueue();
            sl.enqueue(34);
            sl.enqueue(243);
            sl.enqueue(549);
            sl.enqueue(5494);
            sl.display();
            sl.dequeue();
            Object topElement = sl.peek();
            System.out.println(topElement);
        } catch (QueueUnderEmpty e) {
            e.printStackTrace();
        }
    }
}
