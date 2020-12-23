package Miseleneous;

public class FinalVariable {

   final int speed =100;

    void change()
    {
   //     speed =200;
    }

    public static void main(String[] args) {

        FinalVariable ob = new FinalVariable();

        System.out.println(ob.speed); // 100

        ob.change();

        System.out.println(ob.speed); // 200

    }
}
