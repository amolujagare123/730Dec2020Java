package CollectionDemos;

import java.util.ArrayList;

public class ArrayListDem3 {


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

        System.out.println("before add all"+al2);

        al2.addAll(al);

        System.out.println("After add all"+al2);

    }

}
