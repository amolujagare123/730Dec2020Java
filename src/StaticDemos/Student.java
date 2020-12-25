package StaticDemos;

import static StaticDemos.StaticMethod.myMethod;

public class Student {

    int rno;
    String name ;
    static String college="ITC";

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name"+name);
        System.out.println("college="+college);
    }

    public static void main(String[] args) {

        Student st1 = new Student();
        st1.rno = 1;
        st1.name="Kuldeep";

        Student st2 = new Student();
        st2.rno = 2;
        st2.name="vikram";
        st2.college="PICT";


        Student st3 = new Student();
        st3.rno = 3;
        st3.name="Amol";


        Student.college = "Puna college";

        System.out.println("college printed using classname="+Student.college); //
        // you dont need a object to access the static variable

        st1.display();//
        st2.display();//
        st3.display();//


      myMethod();

      myMethod();

    }

}
