import java.util.Scanner;

public class BerechneSummeDurchschnitt {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Geben Sie die erste Zahl ein:");
        double a = s.nextDouble();
        System.out.println("Geben Sie die erste Zahl ein:");
        double b = s.nextDouble();
        System.out.println("Geben Sie die erste Zahl ein:");
        double c = s.nextDouble();
        System.out.println("Geben Sie die erste Zahl ein:");
        double d = s.nextDouble();
        System.out.println("Geben Sie die erste Zahl ein:");
        double e = s.nextDouble();

        double summe = a + b + c + d + e;
        double durchschnitt = summe / 5;

        System.out.println("Summe = " + summe);
        System.out.println("Durchschnitt = " + durchschnitt);
        s.close();
    }
}