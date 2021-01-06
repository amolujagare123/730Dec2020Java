package CollectionDemos;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(34);
        adq.offer(14);
        adq.offer(342);
        adq.offer(24);
        adq.offer(43);
        adq.offer(341);

        System.out.println(adq);

        adq.offerFirst(0);
        adq.offerLast(100);
        System.out.println(adq);

        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);



    }

}
