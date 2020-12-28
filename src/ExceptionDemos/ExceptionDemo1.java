package ExceptionDemos;

public class ExceptionDemo1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int c =1;

        try {
            c = a / b;
        }
        catch (Exception e)
        {
            System.out.println("Inside catch block");
            System.out.println(e);
            System.out.println("only msg:"+e.getMessage());
            System.out.println("only clas name with its pakage name:"+e.getClass());

            e.printStackTrace();
        }

        System.out.println("c="+c);
        System.out.println("End of the program");



    }
}
