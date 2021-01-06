package CollectionDemos;

import java.util.ArrayList;

public class ArrayListDem7 {


    public static void main(String[] args) {


        ArrayList<Integer> al = new ArrayList();

        al.add(12);
        al.add(32);
        al.add(42);
        al.add(43);
        al.add(44);
        al.add(120);
        al.add(123);
        al.add(222);
        al.add(121);

        System.out.println(al);

        // remove all the elements which are less than 50
        al.removeIf(i -> i<50 );

        System.out.println(al);


    }

}
