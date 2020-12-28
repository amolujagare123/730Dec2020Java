package ExceptionDemos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo3 {

    public static void main(String[] args) throws ParseException {

       String dateStr = "12/23/2020";
        System.out.println("date in string:"+dateStr);

        SimpleDateFormat sd = new SimpleDateFormat("MM/dd/ yyyy");

        Date date = sd.parse(dateStr);

        System.out.println(date);

        System.out.println("End of the program");


    }
}
