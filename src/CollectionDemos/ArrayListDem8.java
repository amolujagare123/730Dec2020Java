package CollectionDemos;

import java.util.ArrayList;

public class ArrayListDem8 {

    public static void main(String[] args) {

        ArrayList<Character> al = new ArrayList();

        al.add('a');
        al.add('b');
        al.add('c');
        al.add('d');
        al.add('e');
        al.add('f');
        al.add('g');
        al.add('h');
        al.add('i');
        al.add('j');
        al.add('k');
        al.add('l');
        al.add('m');

        System.out.println(al);

        // remove all the vowels from the list
        al.removeIf(ch -> ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u');

        System.out.println(al);


    }

}
