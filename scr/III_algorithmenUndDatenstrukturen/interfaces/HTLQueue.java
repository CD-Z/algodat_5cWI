package III_algorithmenUndDatenstrukturen.interfaces;

public interface HTLQueue {
    public void enqueue(int i);

    public int dequeue() throws NullPointerException;

    public void printQueue();
}