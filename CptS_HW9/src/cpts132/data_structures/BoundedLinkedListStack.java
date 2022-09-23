/**
 * @Author Ryan Garbutt
 * Cpts 132
 * Spring 2021
 * HW9 Stack/Queue Implementation
 */

package cpts132.data_structures;

import cpts132.data_structures.StackOverFill;
import cpts132.data_structures.StackUnderEmpty;

public class BoundedLinkedListStack implements BoundedArrayStack {
    protected ListNode head;
    protected int size;
    private int maxSize = 0;

    public BoundedLinkedListStack(int maxCapacity) {
        head = null;
        size = 0;
        this.maxSize = maxSize;
    }

    @Override
    public boolean hasItems() {
        return head == null;
    }
    @Override
    public boolean hasRoom() {
        return this.maxSize > this.size;
    }
    @Override
    public int getSize() {
        return this.size;
    }
    @Override
    public void push(Object o) throws StackOverFill {
        if (!hasRoom())
            throw new StackOverFill(
                    "Element cannot be added.");
        ListNode node = new ListNode(o, null);
        if (head == null){
            head = node;
        }else {
            node.setNextNodeRef(head);
            head = node;
        }
        size++;
    }
    @Override
    public Object pop() throws StackUnderEmpty {
        if (hasItems())
            throw new StackUnderEmpty("Stack Empty.");
        ListNode node = head;
        head = node.getNextNodeRef();
        size--;
        return node.getValue();
    }
    @Override
    public Object peek() throws StackUnderEmpty {
        if (hasItems())
            throw new StackUnderEmpty("Stack Empty.");
        return head.getValue();
    }
    public static void main(String a[]) {
        try {
            BoundedLinkedListStack sl = new BoundedLinkedListStack(3);
            sl.push(4);
            sl.push(43);
            sl.push(59);
            sl.pop();
            sl.pop();
            Object topElement = sl.peek();
            System.out.println(topElement);
        } catch (StackUnderEmpty e) {
            e.printStackTrace();
        } catch (StackOverFill e) {
            e.printStackTrace();
        }
    }
}
