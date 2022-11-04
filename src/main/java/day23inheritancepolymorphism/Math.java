package day23inheritancepolymorphism;

public class Math extends Courses {

    public void practice() {
        System.out.println("Solve questions");
    }

    public Math() {
        super("x");

        System.out.println("Constructor 1");
    }

    public Math(int a) {

        this();//Bu class daki parametresiz constructor'i kullan demek
        System.out.println("Constructor 2");
    }
}
