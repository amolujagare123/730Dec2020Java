package ClassDemos;

public class NomalConst {
    int a;
    double d;
    char c;
    String str; // data members

    NomalConst()
    {
        a = 10;
        d =1.3;
        c='p';
        str="abc";
    }

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        NomalConst ob = new NomalConst();

        ob.display();

        NomalConst ob2 = new NomalConst();

        ob2.display();


    }


}
