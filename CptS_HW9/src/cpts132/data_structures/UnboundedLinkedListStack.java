/**
 * @Author Ryan Garbutt
 * Cpts 132
 * Spring 2021
 * HW9 Stack/Queue Implementation
 */

package cpts132.data_structures;

import cpts132.data_structures.ListNode;
import cpts132.data_structures. StackUnderEmpty;
public class UnboundedLinkedListStack implements UnboundedArrayStack {
    protected ListNode head;
    protected int size;

    public UnboundedLinkedListStack() {
        head = null;
        size = 0;
    }

    public boolean hasItems() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void push(Object data) {
        ListNode node = new ListNode(data, null);
        if (head == null)
            head = node;
        else {
            node.setNextNodeRef(head);
            head = node;
        }
        size++;
    }

    public Object pop() throws StackUnderEmpty {
        if (hasItems())
            throw new StackUnderEmpty("Underflow Exception");
        ListNode node = head;
        head = node.getNextNodeRef();
        size--;
        return node.getValue();
    }

    public Object peek() throws StackUnderEmpty {
        if (hasItems())
            throw new StackUnderEmpty("Underflow Exception");
        return head.getValue();
    }

    public void display() {
        System.out.print("\nStack = ");
        if (size == 0) {
            System.out.print("Empty\n");
            return;
        }
        ListNode ptr = head;
        while (ptr != null) {
            System.out.print(ptr.getValue() + " ");
            ptr = ptr.getNextNodeRef();
        }
        System.out.println();
    }
    public static void main(String a[]) {
        try {
            UnboundedLinkedListStack sl = new UnboundedLinkedListStack();
            sl.push(4);
            sl.push(43);
            sl.push(59);
            sl.pop();
            Object topElement = sl.peek();
            System.out.println(topElement);
        } catch (StackUnderEmpty e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
