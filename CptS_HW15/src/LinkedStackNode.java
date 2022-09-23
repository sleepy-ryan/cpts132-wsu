import java.util.EmptyStackException;

public class LinkedStackNode implements NumberStack{

    /**
     * An object of type Node holds one of the items in the linked list
     * that represents the stack.
     */
    private static class Node {
        double item;
        Node next;
    }

    private Node top; // Pointer to the Node that is at the top of
// of the stack. If top == null, then the
// stack is empty.

    /**
     * Add N to the top of the stack.
     */
    public void push( double N ) {
        Node newTop; // A Node to hold the new item.
        newTop = new Node();
        newTop.item = N; // Store N in the new Node.
        newTop.next = top; // The new Node points to the old top.
        top = newTop; // The new item is now on top.
    }

    /**
     * Remove the top item from the stack, and return it.
     * Throws an IllegalStateException if the stack is empty when
     * this method is called.
     */
    public double pop() {
        if ( top == null )
            throw new EmptyStackException();
        double topItem = top.item; // The item that is being popped.
        top = top.next; // The previous second item is now on top.
        return topItem;
    }

    /**
     * Returns true if the stack is empty. Returns false
     * if there are one or more items on the stack.
     */
    public boolean isEmpty() {
        return (top == null);
    }

    @Override
    public double peek() {
        // TODO Auto-generated method stub
        if ( top == null )
            throw new EmptyStackException();
        double topItem = top.item; // The item that is being popped.
        return topItem;
    }

} // end class Stack