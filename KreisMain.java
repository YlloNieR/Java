import java.util.Scanner;

public class KreisMain {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Gebe die X Koordinate an:");
        double x2 = s.nextDouble();
        System.out.println("Gebe die Y Koordinate an:");
        double y2 = s.nextDouble();
        System.out.println("Gebe den Radius an:");
        double r2 = s.nextDouble();

        KreisKlasse neuerKreis = new KreisKlasse(r2,x2,y2);
        System.out.println(neuerKreis.printInfo());
        s.close();


        KreisKlasse k1 = new KreisKlasse(3.0, 4.0, 2);
        KreisKlasse k2 = new KreisKlasse(4.0, 4.0, 3.0);

        System.out.println("Flaecheninhalt von Kreis 1"+k1.flaecheninhalt());
        System.out.println("Umfang von Kreis 2"+k2.umfang());

        System.out.println("Radius von Kreis 1"+k1.getRadius());
        k1.setRadius(3.0);
        System.out.println("Radius neu von Kreis 1"+k1.getRadius());
        System.out.println("Flaecheninhalt neu von Kreis 1"+k1.flaecheninhalt());

    }
}