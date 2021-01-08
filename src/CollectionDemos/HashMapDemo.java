package CollectionDemos;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(101,"amol");
        hm.put(201,"rahul");
        hm.put(111,"prakash");
        hm.put(301,"kuldeep");
        hm.put(221,"vikram");

        System.out.println("hm="+hm);

        HashMap<Integer,String> hm1 = new HashMap<>();

        System.out.println("hm1="+hm1);
        hm1.putAll(hm);

        System.out.println("hm1="+hm1);

        System.out.println(hm.get(101));

        hm.remove(101);
        System.out.println("hm="+hm);

        System.out.println(hm.containsKey(301));

        System.out.println(hm.containsValue("kuldeep1"));

        System.out.println(hm.size());

        System.out.println(hm.isEmpty());

        hm.clear();
        System.out.println("hm="+hm);



    }
}
