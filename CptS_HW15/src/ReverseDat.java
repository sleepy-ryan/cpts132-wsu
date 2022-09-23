import java.util.EmptyStackException;

public class ReverseDat implements NumberStack { // (alternate version, using an array)

    private double[] items = new double[10]; // Holds the items on the stack.

    private int top = 0; // The number of items currently on the stack.

    /**
     * Add N to the top of the stack.
     */
    public void push( double N ) {
        if (top == items.length) {
// The array is full, so make a new, larger array and
// copy the current stack items into it. (Note that
// java.util.Arrays must be imported.)
            double[] b=new double[2*items.length];

            for(int i=0;i<items.length;i++)
            {
                b[i]=items[i];
            }

            items=b;
        }
        items[top] = N; // Put N in next available spot.
        top++; // Number of items goes up by one.
    }

    /**
     * Remove the top item from the stack, and return it.
     * Throws an IllegalStateException if the stack is empty when
     * this method is called.
     */
    public double pop() {
        if ( top == 0 )
            throw new EmptyStackException();
        double topItem = items[top - 1]; // Top item in the stack.
        top--; // Number of items on the stack goes down by one.
        return topItem;
    }

    /**
     * Returns true if the stack is empty. Returns false
     * if there are one or more items on the stack.
     */
    public boolean isEmpty() {
        return (top == 0);
    }


    @Override
    public double peek() {
        // TODO Auto-generated method stub
        if ( top == 0 )
            throw new EmptyStackException();
        double topItem = items[top - 1]; // Top item in the stack.
        return topItem;
    }

} // end class Stack