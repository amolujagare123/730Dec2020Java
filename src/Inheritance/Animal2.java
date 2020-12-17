package Inheritance;

public class Animal2 {

    void animalMethod()
    {
        System.out.println("This is animal");
    }

}

class Mammal extends Animal2
{
    void mammalMethod()
    {
        System.out.println("This is mammal");
    }
}

class Reptile extends Animal2
{
    void reptileMethod()
    {
        System.out.println("This is Reptile");
    }
}

class Tiger extends  Mammal
{
    void tigerMethod()
    {
        System.out.println("This is Tiger");
    }
}

class  TestHybridInheritance
{
    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        tiger.tigerMethod();
        tiger.mammalMethod();
        tiger.animalMethod();

    }
}