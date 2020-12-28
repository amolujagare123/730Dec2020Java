package ExceptionDemos;

public class ThrowDemo {

    void checkNumber(int i) throws ArithmeticException // 'i' must be in between 1 to 10
    {
        if(i<=10 && i>=1)
            System.out.println("we are safe");

        else
        {
            System.out.println("We are in danger");

            throw  new ArithmeticException("I said we are in danger");
        }

    }

    public static void main(String[] args) throws ArithmeticException {

        ThrowDemo ob = new ThrowDemo();
        System.out.println("Start of the program exection");

        int a =11;

        System.out.println("value to be passed : "+a);

        ob.checkNumber(a);

        System.out.println("End of the program execution");
    }
}
