package Miseleneous;

import pack1.Java1;

import java.util.Date;

public class ReturningObject {

    String getMyString()
    {
        String str = "amol";
        return  str;
    }

    Date getMyDate()
    {
       Date d = new Date();
       return  d;
    }

    Java1 getMyObject()
    {
        Java1 object = new Java1();

        object.a1 = 10;
        object.d1 = 1.1;
        object.str1 ="string";

        return object;

    }

    public static void main(String[] args) {

        ReturningObject ob = new ReturningObject();

        String myStr = ob.getMyString();
        System.out.println("mystr="+myStr);
        System.out.println(ob.getMyString());

        Date date = ob.getMyDate();

        System.out.println(date);
        System.out.println(ob.getMyDate());


        System.out.println("==== Creating object using regular way===========");
        Java1 obj = new Java1();
        obj.display1();

        System.out.println("==== Object is assigned via a method returning object===========");
        Java1 obj1 = ob.getMyObject();
        obj1.display1();

    }
}
