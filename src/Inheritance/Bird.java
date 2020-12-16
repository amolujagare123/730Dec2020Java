package Inheritance;

public class Bird {

    void fly()
    {
        System.out.println("fly");
    }
}

class Sparrow extends  Bird {

    void colorYellow()
    {
        System.out.println("colorYellow");
    }
}


class Crow extends  Bird  {

    void colorBlack()
    {
        System.out.println("colorBlack");
    }

    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.fly();

        Sparrow sparrow = new Sparrow();
        sparrow.fly();
        sparrow.colorYellow();

        Crow crow = new Crow();
        crow.fly();
        crow.colorBlack();

    }
}
