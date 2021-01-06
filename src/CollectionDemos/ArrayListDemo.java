package CollectionDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {


    public static void main(String[] args) {


        ArrayList al = new ArrayList();

        al.add("amol");
        al.add("kuldeep");
        al.add("vikram");
        al.add("rahul");
        al.add("rajesh");
        al.add("kumar");
        al.add('h');
        al.add(12.4);
        al.add(12);

        System.out.println(al);

        System.out.println("size of the list="+al.size());

       /* for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }*/

        Iterator itr = al.iterator();

        while(itr.hasNext())
            System.out.println(itr.next());





    }

}
