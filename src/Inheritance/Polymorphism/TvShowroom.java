package Inheritance.Polymorphism;

public class TvShowroom {

    void channels()
    {
        System.out.println("TvShowroom Channels");
    }
    void volumeControl()
    {
        System.out.println("TvShowroom volumeControl");
    }
    void settings()
    {
        System.out.println("TvShowroom settings");
    }
}
class LG extends TvShowroom {

    void channels()
    {
        System.out.println("LG Channels");
    }
    void volumeControl()
    {
        System.out.println("LG volumeControl");
    }
    void settings()
    {
        System.out.println("LG settings");
    }
}

class Samsang extends TvShowroom {

    void channels()
    {
        System.out.println("Samsang Channels");
    }
    void volumeControl()
    {
        System.out.println("Samsang volumeControl");
    }
    void settings()
    {
        System.out.println("Samsang settings");
    }
}


class Onida extends TvShowroom {

    void channels()
    {
        System.out.println("Onida Channels");
    }
    void volumeControl()
    {
        System.out.println("Onida volumeControl");
    }
    void settings()
    {
        System.out.println("Onida settings");
    }
}


class TestOverriding
{

    public static void main(String[] args) {

       /* TvShowroom tv = new TvShowroom();
        tv.channels();
        tv.settings();
        tv.volumeControl();*/

        TvShowroom tv;

        tv = new LG(); // up casting
        tv.channels();
        tv.settings();
        tv.volumeControl();

        tv = new Onida();  // up casting
        tv.channels();
        tv.settings();
        tv.volumeControl();

        tv = new Samsang();  // up casting
        tv.channels();
        tv.settings();
        tv.volumeControl();
    }

}
