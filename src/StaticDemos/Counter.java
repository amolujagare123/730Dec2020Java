package StaticDemos;

public class Counter {

    static  int cout = 0;

    Counter()
    {
        cout++;
        System.out.println(cout);
    }

    public static void main(String[] args) {

        Counter ob1 = new Counter();//1
        Counter ob2 = new Counter();//1
        Counter ob3 = new Counter();//1
    }
}
