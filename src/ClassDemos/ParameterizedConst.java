package ClassDemos;

public class ParameterizedConst {
    int a;
    double d;
    char c;
    String str; // data members

    ParameterizedConst(int x, double d1, char c1,String s)
    {
        a = x;
        d =d1;
        c=c1;
        str=s;
    }

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        ParameterizedConst ob = new ParameterizedConst(11,2.3,'d',"pqr");

        ob.display();


    }


}
