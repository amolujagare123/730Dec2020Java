package CollectionDemos;

import javafx.print.Collation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo1 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(101,"amol");
        hm.put(201,"rahul");
        hm.put(111,"prakash");
        hm.put(301,"kuldeep");
        hm.put(221,"vikram");
        hm.put(222,"vikram");

        System.out.println("hm="+hm);

        Set s = hm.keySet();

        System.out.println("keyset="+s);

        Collection c = hm.values();

        System.out.println("all values="+c);

        Set  entrySet = hm.entrySet();

        System.out.println("EntrySet="+entrySet);
    }
}
