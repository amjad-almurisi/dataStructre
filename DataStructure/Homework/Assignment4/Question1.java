
public class Q1 {

    public void addFirst(E ele){
        if (isEmpty()){
            tail= new Node<E>( ele,null);
            tail.setNext(tail);
        }
        else {
            tail.next = new Node<>(ele, tail.getNext());
        }


    }
}
