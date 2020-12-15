package DateDemos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);
         // 14/12/2020 , 14-12-2020
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");

        String dateStr =  sd.format(date); // converts the date into string in given format

        System.out.println(dateStr);

        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");
        String dateStr0 = sd0.format(date);
        System.out.println(dateStr0);

        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy h:mm");
        String dateStr1 = sd1.format(date);
        System.out.println(dateStr1);


        // Convert Date into String --> use format

    }
}
