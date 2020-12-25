package StaticDemos;

public class StaticMethod {


    static  int count = 10;

    static void display()
    {
        System.out.println("count="+count);
    }

    static void myMethod()
    {
        count++;
        display();
    }

    void nonStatic()
    {
        count++;
        display();
    }

    public static void main(String[] args) {

        StaticMethod ob = new StaticMethod();

        ob.myMethod();

        StaticMethod.myMethod();

        myMethod();

        ob.nonStatic();
    }


}
