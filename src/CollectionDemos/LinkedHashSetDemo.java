package CollectionDemos;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("amol");
        lhs.add("kuldeep");
        lhs.add("vikram");
        lhs.add("rahul");
        lhs.add("rajesh");
        lhs.add("kumar");

        System.out.println(lhs);

        System.out.println(lhs.add("kumar"));

        System.out.println(lhs);

    }
}
