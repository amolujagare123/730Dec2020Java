package ExceptionDemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo4 {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        try {

            FileInputStream fp = new FileInputStream("D:\\pallavi\\screenshot1.png");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("End of the program");

        Thread.sleep(3000);

    }
}
