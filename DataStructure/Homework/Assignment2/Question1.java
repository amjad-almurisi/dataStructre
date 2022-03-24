

public class Question1 {


    public E secound node(Node<E> n){
        Node<E> current=n;
        if (current==null||newes.getNext()==null)return null;
        while (current.getNext().getNext()!=null)
        {
            current=newes.getNext();
        }
        return current.getElement();
    }
}