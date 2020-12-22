package Miseleneous;

public class ReturningValue {

    int getMyValue() // 11
    {
        int a = 11;
        return  a; //11
    }

    public static void main(String[] args) {

        ReturningValue ob = new ReturningValue();

        int x = 10 ;

        System.out.println(x);

        int i  = x;

        System.out.println("i="+i);

        x = ob.getMyValue();

        System.out.println("x="+x);

    }

}
