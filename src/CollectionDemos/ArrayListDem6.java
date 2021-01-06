package CollectionDemos;

import java.util.ArrayList;

public class ArrayListDem6 {


    public static void main(String[] args) {


        ArrayList<String> al = new ArrayList();

        al.add("amol");
        al.add("kuldeep");
        al.add("vikram");
        al.add("rahul");
        al.add("rajesh");
        al.add("kumar");

        System.out.println(al);

        // remove all the elements(Strings) which starts with k

        // str.startWith("k")

        al.removeIf(str -> str.startsWith("k"));


        al.removeIf(str-> str.endsWith("l"));
        System.out.println(al);


    }

}
