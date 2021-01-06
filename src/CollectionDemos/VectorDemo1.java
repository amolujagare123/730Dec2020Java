package CollectionDemos;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo1 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>(8,3);

        System.out.println("capacity:"+v.capacity()); // 10
        System.out.println("Size:"+v.size());// 0

        v.add("amol");
        v.add("kuldeep");
        v.add("vikram");
        v.add("rahul");
        v.add("rajesh");
        v.add("rahul");
        v.add("rajesh");
        v.add("rahul");
        v.add("rajesh");

        System.out.println("capacity:"+v.capacity()); //10
        System.out.println("Size:"+v.size()); // 6

        System.out.println(v);




    }

}
