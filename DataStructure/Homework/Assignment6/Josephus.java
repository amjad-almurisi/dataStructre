//public class QueueHomW {
//
//public static <E> E Josephus(CircularQueue<E> queue, int k) {
//    if (queue.isEmpty()) return null;
//    while (queue.size() > 1) {
//        for (int i = 0; i < k−1;
//        i++)
//        queue.rotate();
//        E e = queue.dequeue();
//        System.out.println(" " + e + "  out");
//    }


    public class Josephus {
        public static void main(String[] args) {
            String[] a1 = {"amjad", "ali", "ahmed", "bander", "sleem", "ieman"};
            CircQueueImp<String> cq = new CircQueueImp<>();

            for (int i = 0; i < a1.length; i++) {
                cq.enqueue(a1[i]);
            }
            while (cq.size() > 1) {
                for (int i = 0; i < 2; i++)
                    cq.rotate();
                System.out.println(cq.dequeue() + "is out");
            }
            System.out.println(" is winner   " + cq.dequeue());
        }
    }
}
}