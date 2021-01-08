package CollectionDemos;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer,String> tm = new TreeMap<>();

        tm.put(101,"amol");
        tm.put(201,"rahul");
        tm.put(111,"prakash");
        tm.put(301,"kuldeep");
        tm.put(221,"vikram");
        tm.put(222,"vikram");

        System.out.println(tm);

    
    }
}
