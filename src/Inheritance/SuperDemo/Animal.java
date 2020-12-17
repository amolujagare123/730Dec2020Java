package Inheritance.SuperDemo;

public class Animal {

    String color = "White";
}

class Dog extends  Animal
{

    String color = "Black";

    void printColor()
    {
        System.out.println("Dog:"+color);
        System.out.println("Animal:"+super.color);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printColor();

    }

}
