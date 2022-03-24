
public class Question2 {

    public int sizeAlter(){
        Node<E>x=head;
        int size=0;
        if (head==null)

            return size;
        while (!=null){
            x=x.getNext();
            size++;
        }
        return size;
    }

}
