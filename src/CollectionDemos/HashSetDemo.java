package CollectionDemos;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("amol");
        hs.add("kuldeep");
        hs.add("vikram");
        hs.add("rahul");
        hs.add("rajesh");
        hs.add("kumar");

        System.out.println(hs);

        System.out.println(hs.add("kumar"));

        System.out.println(hs);

    }
}
