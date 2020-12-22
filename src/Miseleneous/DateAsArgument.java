package Miseleneous;

import java.util.Date;

public class DateAsArgument {

    void getDate(Date d)
    {
        System.out.println(d);
    }

    public static void main(String[] args) {


        DateAsArgument ob = new DateAsArgument();

        Date date = new Date();

        ob.getDate(date);
    }
}
