package WrapperClassDemos;

public class Wrapperclass1 {

    public static void main(String[] args) {

        int i =10;

        Integer ii = new Integer(i);

        System.out.println("ii="+ii);

        Integer ii1 = 5;
        System.out.println("ii1="+ii1);


        Integer ii2 = new Integer(7);

        int a1 = ii2.intValue();

        System.out.println("a1="+a1);

        int a2 = ii2;

        System.out.println("a2="+a2);





    }
}
