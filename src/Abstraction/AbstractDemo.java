package Abstraction;

public abstract class AbstractDemo {

    abstract void run();
    abstract void start();

    void display() // non abstract method
    {
        System.out.println("inside display");
    }

   /* public static void main(String[] args) {

        AbstractDemo ob = new AbstractDemo();
    }*/
}

class ChildClass extends  AbstractDemo
{

    void start() // overriding
    {
        System.out.println("start");
    }

    void run()
    {
        System.out.println("run");
    }

    void display()  // overriding
    {
        System.out.println("child diplay");
    }

    public static void main(String[] args) {

        ChildClass ob = new ChildClass();

        ob.start();
        ob.run();
        ob.display();

        AbstractDemo ob1 = new ChildClass();
        ob1.display();
    }

}