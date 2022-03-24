public interface Queue<E> {
    boolean isEmpty();
    int s();
    void enqueue(E ele);
    E dequeue();
    E first();
}
