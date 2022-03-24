
public class Question3 {

    public void rotate() {

            if (head != null) {
            Node tail = null;
            E curr = head.getElement();

            while (head.getNext() != null) {
                tail.setElement(curr);
                head = head.getNext();
            }
            
            if (tail != null) {
                tail.setNext(null);
                head.setNext(head);
                head.setElement(curr);
            }
        }
    }}
