import java.util.Scanner;

public class berechneMitternachtsformel {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Geben Sie die erste Zahl ein:");
        double a = s.nextDouble();
        System.out.println("Geben Sie die zweite Zahl ein:");
        double b = s.nextDouble();
        System.out.println("Geben Sie die dritte Zahl ein:");
        double c = s.nextDouble();

        double determinate = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

        int z = 0;
        if (determinate > 0) {
            System.out.println("Es gibt 2 Loesungen");
            z = 2;
        }
        if (determinate == 0) {
            System.out.println("Es gibt 1 Loesung");
            z = 1;
        }
        if (determinate < 0) {
            System.out.println("Es gibt keine Loesung");
            z = 0;
        }

        switch (z) {
            case 0:
                System.exit(0);
            case 1:
                double x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
                System.out.println("x= " + x);
            case 2:
                double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
                double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
                System.out.println("x1= " + x1);
                System.out.println("x2= " + x2);
        }
        s.close();
    }
}