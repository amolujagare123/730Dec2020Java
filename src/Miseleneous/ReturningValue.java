package Miseleneous;

public class ReturningValue {

    int getMyValue() // 11
    {
        int a = 11;
        return  a; //11
    }

    char getMyChar()
    {
        char c ='f';
        return  c;
    }


    public static void main(String[] args) {

        ReturningValue ob = new ReturningValue();

       /* int x = 10 ;

        System.out.println(x);

        int i  = x;

        System.out.println("i="+i);*/

        int x = ob.getMyValue();

        System.out.println("x="+x);


        char ch = ob.getMyChar();
        System.out.println("ch="+ch);
        System.out.println(ob.getMyChar());
    }

}
