package Lap6;

public class LinkedStack<E> implements Stack<E> {

    SingleLinkedList<E>list=new SingleLinkedList<>();

    @Override
    public boolean isEmpty() {
        return list.IsEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E top() {
        return list.first();
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public void push(E element) {
    list.addFirst(element);
    }
}
