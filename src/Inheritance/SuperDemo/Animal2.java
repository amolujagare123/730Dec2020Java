package Inheritance.SuperDemo;

public class Animal2 {
    void eat()
    {
        System.out.println("Animal eat");
    }

}

class Dog2 extends Animal2
{
    void eat()
    {
        System.out.println("Dog eat");
    }

    void bark()
    {
        System.out.println("bark");
    }

    void work()
    {
        eat();
        bark();
        super.eat();
    }

    public static void main(String[] args) {
        Dog2 ob = new Dog2();

        ob.work();
    }
}
