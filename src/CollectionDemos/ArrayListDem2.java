package CollectionDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDem2 {


    public static void main(String[] args) {


        ArrayList<String> al = new ArrayList();

        System.out.println(al.isEmpty()); // true

        al.add("amol");
        al.add("kuldeep");
        al.add("vikram");
        al.add("rahul");
        al.add("rajesh");
        al.add("kumar");

        System.out.println(al);
        System.out.println(al.isEmpty()); // false

       /* al.clear();
        System.out.println(al);*/

        al.set(3,"new string");

        System.out.println(al);


        al.remove(3);
        al.remove("kumar");

        System.out.println("after remove");
        System.out.println(al);



    }

}
