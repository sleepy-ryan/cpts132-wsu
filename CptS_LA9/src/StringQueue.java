/**
 * @author Ryan Garbutt
 * CptS 132
 * Spring 2021
 * LA9 StringQueue
 */

import java.util.NoSuchElementException;

public class StringQueue implements Queue<String> {
    private static int capacity = 10;

    private String stringArray[];

    private int head, tail, size;

    public StringQueue() {

        stringArray = new String[capacity];

        head = 0;
        size = 0;
        tail = 0;
    }

    public StringQueue(int capacity) {

        this.capacity = capacity;

        stringArray = new String[capacity];

        head = 0;
        size = 0;
        tail = 0;
    }


    boolean isFull() {

        return (this.size == capacity);
    }

    @Override
    public void enqueue(String element) {

        if (isFull()) {
            throw new NoSuchElementException("Overflow Exception");
        }

        if (tail == 0) {
            stringArray[tail] = element;

            tail = 1;
        }

        else if (tail + 1 < capacity) {

            stringArray[tail] = element;

            tail++;
        }
        size++;
    }

    @Override

    public String dequeue() {

        if (isEmpty())

            throw new NoSuchElementException("Underflow Exception");

        else {

            String element = stringArray[head];

            if (head == tail) {

                head = 0;

                tail = 0;
            }

            else {
                head++;
            }

            size--;

            return element;
        }
    }

    public void printQueue() {

        System.out.print("storage: [");

        if (size == 0) {

            System.out.println("Empty");

            return;

        }

        for (int i = head; i < capacity; i++) {

            if (i == capacity - 1) {
                System.out.print(stringArray[i] + "]");
            }

            else {
                System.out.print(stringArray[i] + " ");
            }
        }

        System.out.println();
    }

    public int getSize() {

        return this.size;

    }

    public static void main(String[] args) {

        StringQueue newQueue = new StringQueue();

        newQueue.enqueue("Ahmed");

        newQueue.enqueue("Bobby");

        newQueue.enqueue("Chris");

        newQueue.printQueue();

        String s = newQueue.dequeue();

        newQueue.enqueue("Ahmed");

        newQueue.printQueue();

        StringQueue sQueue1 = new StringQueue(9);
    }

    @Override

    public String peek() {

        if (isEmpty())

            throw new NoSuchElementException("Underflow Exception");

        return stringArray[head];

    }

    @Override

    public boolean isEmpty() {

        return size == 0;

    }

}
