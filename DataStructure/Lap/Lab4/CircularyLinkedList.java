package Lap4;

public class CircularyLinkedList <E>{

  private Node<E> tail=null;
  private int size=0;

    public CircularyLinkedList() {
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int Size(){
        return size;
    }

    public E first(){

        if (isEmpty())return null;
        return tail.getNext().getElement();
    }

    public E last(){
        if (isEmpty())return null;
        return tail.getElement();
    }

    public void addFirst(E ele){
        if (isEmpty()){
            tail=new Node<E>(ele,null);
            tail.setNext(tail);
        }
        else {
            Node<E> newest=new Node<E>(ele,tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }

    public void addLast(E ele){
        addFirst(ele);
        tail=tail.getNext();
    }

        public E removeFirst(){
            if (isEmpty()) return null;
            Node<E>x=tail.getNext();
            if (x==tail)
                tail=null;
            else
                tail.setNext(x.getNext());
            size--;
            return x.getElement();
        }
        public void rotate(){
            if (tail != null)
                tail=tail.getNext();
        }

        private static class Node<E>{
            private E element;
            private Node<E> next;

            public Node(E element, Node<E> next) {
                this.element = element;
                this.next = next;
            }

            public E getElement() {
                return element;
            }

            public Node<E> getNext() {
                return next;
            }

            public void setNext(Node<E> next) {
                this.next = next;
            }
        }

}
