
public class Question4 {
//    public DoublyLinkedList<E> clone() throws CloneSupportedException {
//
//        DoublyLinkedList<E> other = (DoublyLinkedList<E>) super.clone();
//        if (size > 0) {
//            other.header = new DoublyLinkedList.Node<>(null, null, null);
//            other.trailer = new DoublyLinkedList.Node<>(null, other.header, null);
//            other.header.setNext(other.trailer);
//            DoublyLinkedList.Node<E> walk = header.getNext();
//            DoublyLinkedList.Node<E> otherWalk = other.header;
//            for(int i = 0; i < size; i++) {
//                DoublyLinkedList.Node<E> newest = new DoublyLinkedList.Node<>(walk.getElement(), null, null);
//                otherWalk.setNext(newest);
//                otherWalk = newest;
//                otherWalk.setPrev(newest);
//                walk = walk.getNext();
//            }
//        }
//        return other;
//    }


    public DublyLinkedlist<E> clone() throws CloneSupportedException {
        DublyLinkedlist<E> other = (DublyLinkedlist<E>) super.clone();
        if (size > 0) {
            other.header = new Node<>(null, null, null);
            other.trailer = new Node<>(null, other.header, null);
            other.header.setNext(other.trailer);
            Node<E> walk = header.getNext();
            Node<E> otherWalk = other.header;
                for (int i = 0; i < size; i++) {
                    Node<E> newest = new Node<>(walk.getElement(), otherWalk, otherWalk.getNext());
                    otherWalk.getNext().setPrev(newest);
                    otherWalk.setNext(newest);
                    otherWalk = otherWalk.getNext();
                    walk = walk.getNext();
            }
        }
        return other;
    }
}