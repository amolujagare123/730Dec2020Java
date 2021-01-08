package CollectionDemos;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> lm = new LinkedHashMap<>();

        lm.put(101,"amol");
        lm.put(201,"rahul");
        lm.put(111,"prakash");
        lm.put(301,"kuldeep");
        lm.put(221,"vikram");
        lm.put(222,"vikram");

        System.out.println(lm);

    
    }
}
