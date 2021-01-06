package CollectionDemos;

import java.util.ArrayList;

public class ArrayListDem4 {


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


        System.out.println("before add all"+al2);

        al2.addAll(al);

        // add all the elements from al
        System.out.println("After add all"+al2);



    }

}
