package ClassDemos;

public class ParameterizedConstWithThis {
    int a;
    double d;
    char c;
    String str; // data members

    ParameterizedConstWithThis(int a, double d, char c, String str)
    {
        this.a =  a;
        this.d =  d;
        this.c =  c;
        this.str= str;
    }

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        ParameterizedConstWithThis ob = new ParameterizedConstWithThis(11,2.3,'d',"pqr");

        ob.display();


    }


}
