package CollectionDemos;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("amol");
        v.add("kuldeep");
        v.add("vikram");
        v.add("rahul");
        v.add("rajesh");
        v.add("kumar");

        System.out.println(v);

        System.out.println(v.contains("vikram12"));

        System.out.println(v.firstElement());

        System.out.println(v.lastElement());

        Object[] obj = v.toArray();

        System.out.println("using converted array");
        for(int i =0;i<obj.length;i++)
        {
            System.out.println(obj[i]);
        }

        /*ListIterator itr = v.listIterator();

        while(itr.hasNext())
            System.out.println(itr.next());

        */
        System.out.println("using Enumeration.............");
        Enumeration e =v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());


    }

}
