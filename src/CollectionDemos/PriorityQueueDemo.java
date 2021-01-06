package CollectionDemos;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {


        PriorityQueue<Integer> pq = new PriorityQueue();

        pq.offer(34);
        pq.offer(14);
        pq.offer(342);
        pq.offer(24);
        pq.offer(43);
        pq.offer(341);

        System.out.println(pq);

        // 14 , 24 ,34 ,43 ,341 ,342
 // some operating system / compliers does not support priority queue

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

        System.out.println(pq.remove());



    }

}
