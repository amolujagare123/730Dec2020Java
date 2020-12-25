package Abstraction;

public interface MyInterface1 {

    void start(); // public
    void run();
    void display(); //abstract

    static void myMethod() // public
    {
        System.out.println("inside myMethod");
    }
}

class MyClass
{
    void abc()
    {
        System.out.println("Abc");
    }
}

interface  AnotherInterface
{
    void display(); // abstract
}

class ChildInterface1 extends  MyClass implements MyInterface1,AnotherInterface
{
    public void start() // default // overriding
    {
        System.out.println("start");
    }

    public void run()
    {
        System.out.println("run");
    }

    public void display() // public
    {
        System.out.println("inside diplay1");
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