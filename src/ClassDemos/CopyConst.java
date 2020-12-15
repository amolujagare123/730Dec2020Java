package ClassDemos;

public class CopyConst {
    int a;
    double d;
    char c;
    String str; // data members

    CopyConst()
    {

    }

    CopyConst(CopyConst obj)
    {
        a = obj.a;
        d= obj.d;
        c= obj.c;
        str= obj.str;
    }

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        CopyConst ob = new CopyConst();

        ob.a  = 10 ;
        ob.d = 1.3;
        ob.c = 'g';
        ob.str = "abc";
        System.out.println("======||  Object : ob    ||======");
        ob.display();

        CopyConst ob1 = new CopyConst();

        System.out.println("======||  Object : ob1    ||======");
        ob1.display();

        CopyConst ob2 = new CopyConst(ob);

        System.out.println("======||  Object : ob2    ||======");
        ob2.display();



    }


}
