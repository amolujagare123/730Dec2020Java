package WrapperClassDemos;

public class Wrapperclass2 {

    public static void main(String[] args) {

        String str1 = "111";
        String str2 = "222";

        System.out.println(str1+str2); // 111222

        int i1 = Integer.parseInt(str1);
        int i2 = Integer.parseInt(str2);

        System.out.println(i1+i2);


        String str3 = "12.5";
        String str4 = "2.5";

        System.out.println(str3+str4);

        double d1 = Double.parseDouble(str3);
        double d2 = Double.parseDouble(str4);

        System.out.println(d1+d2);

        Float.parseFloat("12.3f");
        Boolean.parseBoolean("true");

        // we dont have a method to convert the character from string
        // just like for e.g. Integer.parseInt("") / Character.parseChar()

        String strChar = "s"; // conver this single char string into chracter

        char ch = strChar.charAt(0); //--> 's'

    }
}
