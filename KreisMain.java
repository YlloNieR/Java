import java.util.Scanner;

public class KreisMain {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Gebe die X Koordinate an:");
        double x = s.nextDouble();
        System.out.println("Gebe die Y Koordinate an:");
        double y = s.nextDouble();
        System.out.println("Gebe den Radius an:");
        double r = s.nextDouble();

        KreisKlasse neuerKreis = new KreisKlasse(r,x,y);
        System.out.println(neuerKreis.printInfo());
        s.close();
    }
}