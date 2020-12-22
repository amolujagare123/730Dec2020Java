package Inheritance.Polymorphism;

public class OverloadingDemo {

    void addition()
    {
        int a,b;
        a= 10;
        b=20;
        int c=0;
        c= a +b ;
        System.out.println("Addition="+c);

    }

    void addition(int a, int b)
    {
        int c=0;
        c= a +b ;
        System.out.println("Addition="+c);

    }

    void addition(int a, int b , int x)
    {
        int c=0;
        c= a +b +x;
        System.out.println("Addition="+c);

    }

    void addition(double a, double b)
    {
        double c=0;
        c= a +b ;
        System.out.println("Addition="+c);

    }

    void addition(String a, String b)
    {
        String c="";
        c= a +b ;
        System.out.println("Addition="+c);

    }


    public static void main(String[] args) {

        OverloadingDemo ob = new OverloadingDemo();
        ob.addition();
        ob.addition(2,3);
        ob.addition(2.4,5.6);
        ob.addition(1,1,1);
        ob.addition("abc","-pqr");

    }
}
