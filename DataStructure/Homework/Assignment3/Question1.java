
public class Question1 {

    public void splList() {
        Node<E> slowP = heade;
        Node<E> fastP= heade;
        Node<E> heade1;
        Node<E> heade2;

        if (heade == null) {
            return;
        }
        while (fastP != heade
                && fastP.next.next != heade) {
            fastP = fastP.next.next;
            slowP = slowP.next;

        }

        if (fastP.next.next == heade) {
            fastP = fast_ptr.next;
        }

        header1 = header;
        if (header.next != heade) {

            header2 = slowP.next;
        }

        fastP.next = slowP.next;
        slowP.next = heade;
    }

}
