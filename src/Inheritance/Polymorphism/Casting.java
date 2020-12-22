package Inheritance.Polymorphism;

public class Casting {

    public static void main(String[] args) {

        int a = 10 ;
        int b = 3;
       //  double c = 1; // 3.333

       //double-A  c = a/b (int - B) ;

        double  c = (double) a/b ;

        System.out.println("c=" + c); // 3.333

        // if you wan to convert one type of data(A) in another type(B)
        // you can achieve this using casting


    }
}
