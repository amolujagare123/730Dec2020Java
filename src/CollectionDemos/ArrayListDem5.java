package CollectionDemos;

import java.util.ArrayList;

public class ArrayListDem5 {


    public static void main(String[] args) {


        ArrayList<String> al = new ArrayList();

        al.add("amol");
        al.add("kuldeep");
        al.add("vikram");
        al.add("rahul");
        al.add("rajesh");
        al.add("kumar");

        System.out.println(al);


        ArrayList<String> al2 = new ArrayList();

        al2.add("amol1");
        al2.add("kuldeep1");
        al2.add("vikram1");
        al2.add("rahul");
        al2.add("rajesh");
        al2.add("kumar");


        System.out.println("before remove all"+al2);

        al2.removeAll(al);

      //  the common elemets from al are removed from al2


        System.out.println("After add all"+al2);



    }

}
