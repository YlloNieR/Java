import java.util.Scanner;

public class BerechneGeschwindigkeit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Geben Sie die Distanz ein in km:");
        double km = s.nextDouble();

        System.out.println("Geben Sie die Zeit in h ein:");
        double h = s.nextDouble();

        double v = km * h;

        System.out.println("Ihre Gechwindigkeit ist " + v + " km/h");
        s.close();

    }
}