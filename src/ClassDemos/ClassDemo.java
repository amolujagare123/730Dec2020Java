package ClassDemos;

public class ClassDemo {
    int a;
    double d;
    char c;
    String str ; // data members

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        ClassDemo ob = new ClassDemo();

        ob.a  = 10 ;
        ob.d = 1.3;
        ob.c = 'g';
        ob.str = "abc";


        ClassDemo ob2 = new ClassDemo();

        ob2.a  = 10 ;
        ob2.d = 1.3;
        ob2.c = 'g';
        ob2.str = "abc";


        ob.display();

        System.out.println(ob.a);
        System.out.println(ob.c);

    }


}
