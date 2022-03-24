
public class Question2 {



    public boolean equals(DoublyLinkedlist list1, DoublyLinkedlist list2) {
        boolean b = false;
        if (list1.isEmpty() && list2.isEmpty()){
            System.out.println("the tow Lists are empty");
            return true;
        }
        if (list1.size() == list2.size()){
            int x = list1.size ();
            DoublyLinkedlist.Node<E> num1 = list1.header.getNext();
            DoublyLinkedlist.Node<E> num2 = list2.header.getNext();
            while (x != 0){
                if ( num1.getElement() .equals( num2.getElement())){
                    b = true;
                }
                else b=false;
                num1 = num1.getNext();
                num2 = num2.getNext();
                x--;
            }
        }return b;
    }
