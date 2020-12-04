public class UnaryOperatorDemo1 {

    public static void main(String[] args) {


        /*
        a++  / a-- : first the statements will execute
        then the increment / decrement will happen

        ++a / --a :  first the increment / decrement will
        happen Then statements will execute then.
        */

        int i = 10;

        System.out.println(i++); // 10
        System.out.println(i); // 11
        System.out.println(++i); // 12
        System.out.println(i);// 12

    }

}
