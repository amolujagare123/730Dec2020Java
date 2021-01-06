package CollectionDemos;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(23);
        ll.add(33);
        ll.add(43);
        ll.add(25);
        ll.add(13);

        System.out.println(ll);

        ll.addFirst(0);
        ll.addLast(100);

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }

}
