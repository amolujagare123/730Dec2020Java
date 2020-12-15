package ClassDemos;

public class ClassEmptyConst {
    int a;
    double d;
    char c;
    String str; // data members

    ClassEmptyConst()
    {
        // empty
    }

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        ClassEmptyConst ob = new ClassEmptyConst();

        ob.display();


    }


}
