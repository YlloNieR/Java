import java.util.Scanner;

public class RechteckMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println(printInfoEingabeH());
        double h = s.nextDouble();

        System.out.println(printInfoEingabeB());
        double b = s.nextDouble();

        RechteckKlasse neuesRechteck = new RechteckKlasse(h, b);
        System.out.println(neuesRechteck.printInfo());
    }

    public static String printInfoEingabeH() {
        return "Wie hoch ist das Rechteck? ";
    }

    public static String printInfoEingabeB() {
        return "Wie hoch ist das Rechteck? ";
    }
}