public class Oops {

    //    Instatatiate a RuntimeException here.
    RuntimeException x;

    public Oops() {
//    Instatatiate a RuntimeException here.
//        x = new RuntimeException("Instantiated in the constructor");
    }

    public void m1() {
        m2();
    }

    public void m2() {
//    Instatatiate a RuntimeException here.
//        x = new RuntimeException("Instantiated in m2");
        m3();
    }

    public void m3() {
        m4();
    }

    public void m4() {
//    Instatatiate a RuntimeException here.
//        x = new RuntimeException("Instantiated in m4");
        throw x;
    }

    public static void main(String[] args) {
//    Instatatiate a RuntimeException here.

        Oops obj = new Oops();

        obj.x = new RuntimeException("Instantiated in main");

        obj.m1();

        new Oops().m1();



    }

}

