package StringDemos;

public class StringComparision {

    public static void main(String[] args) {

        String str1 = "amol";
        String str2 = "abcd";
        String str3 = "amol";
        String str4 = "Amol";
        String str5 = new String("amol");

        System.out.println(str1.equals(str2)); // false

        System.out.println(str1.equals(str3)); //true
        System.out.println(str1.equals(str4)); // false

        System.out.println(str1.equalsIgnoreCase(str4)); // true

        System.out.println(str1.equalsIgnoreCase(str5)); // true

        System.out.println("\n comparision using ==  \n");

        System.out.println(str1==str3); // false





    }
}
