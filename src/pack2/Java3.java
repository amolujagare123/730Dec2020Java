package pack2;

import pack1.Java1;

public class Java3 extends  Java1 {

    int a3;
    double d3;
    char c3;
    String str3 ;

    void display3()
    {
        System.out.println("a="+a3);
        System.out.println("d="+d3);
        System.out.println("c="+c3);
        System.out.println("str="+str3);
    }

    public static void main(String[] args) {
        Java1 ob =new Java1();

        ob.a1 = 23;
        ob.d1 = 23.4;

     /*   ob.c1 ='g';
        ob.str1 ="abc";
*/

        Java3 ob1 = new Java3();
        ob1.a1 = 23;
        ob1.d1 = 23.4; // public

        ob1.c1 ='g';
       // ob1.str1 ="abc"; // default


    }

}
