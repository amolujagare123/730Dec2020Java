package StaticDemos;

public class StaticBlockDemo {

    static {

        System.out.println("Static block");
    }

    public static void main(String[] args) {

        System.out.println("inside main");
    }

}
