package Abstraction;

public interface MyInterface {

    void start(); // public
    void run();

    default void display()
    {
        System.out.println("inside diplay");
    }

    static void display1() // public
    {
        System.out.println("inside diplay1");
    }
}

class ChildInterface implements MyInterface
{
    public void start() // default // overriding
    {
        System.out.println("start");
    }

    public void run()
    {
        System.out.println("run");
    }

    public static void main(String[] args) {

        ChildInterface ob = new ChildInterface();
        ob.run();
        ob.start();
        ob.display();


        MyInterface ob1 = new ChildInterface();

        ob1.start();
        ob1.run();
        ob1.display();

        MyInterface.display1();

        // static methods inside the interface cant be called
        // using object or object refernce
        // they can be called using interface name only

    }

}
