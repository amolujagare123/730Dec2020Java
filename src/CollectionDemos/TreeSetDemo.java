package CollectionDemos;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        // it does not allow duplicated

        ts.add("amol");
        ts.add("kuldeep");
        ts.add("vikram");
        ts.add("rahul");
        ts.add("rajesh");
        ts.add("kumar");

        System.out.println(ts);

        System.out.println(ts.add("kumar"));

        System.out.println(ts);

    }
}
