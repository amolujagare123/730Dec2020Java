package Inheritance.SuperDemo;

public class SuperClass {

    SuperClass()
    {
        System.out.println("Superclass constructor");
    }
}
class SubClass extends SuperClass
{

    SubClass()
    {
        //super();
        System.out.println("SubClass constructor");
    }

    public static void main(String[] args) {
        SubClass ob = new SubClass();
    }
}
