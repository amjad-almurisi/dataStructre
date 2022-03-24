package Lab4;


public class {
public boolean equal(circlyLinkedList lest1,circlyLinkedList lest2) {
        boolean p = false;
        if (lest1.size() == lest2.size()){
          int num = lest1.size ();
            Node<E> num1 =lest1.tail.getNext();
//            Node<E> nm2 = lest2.tail.getNext();
            Node<E> num2 =lest2.tail.getNext();
          while (num != 0){
        if (lest1.tail.getElement().equal( lest2.tail.getElement () ) || num1.getElement().equals ( num2.getElement() ) ){
          p = true;
        }
        
        else p=false;
            num1 = n1.getNext();
            num2 = n2.getNext();
            num--;
        }
        }return p;
        }
}
