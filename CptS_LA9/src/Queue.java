/**
 * This interface describes the simplest form of queue.
 */
public interface Queue<E> {

    /**
     * Add to the tail of the queue.
     * @param element The value to be added to the tail
     * of the queue
     */
    public void enqueue(E element);

    /**
     * Remove from the head of the queue.
     * @return The value from the head of the queue
     */
    public E dequeue();

    /**
     * Peek at the head of the queue.
     * @return The value at the head of the queue
     */
    public E peek();

    /**
     * Check for elements in the queue.
     * @return True if the queue is empty
     */
    public boolean isEmpty();

}