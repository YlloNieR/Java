import java.util.Scanner;

public class PosiORNegativ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Geben Sie eine Zahl ein:");
        double zahl = s.nextDouble();

        if (zahl >= 0) {
            System.out.println(zahl + " ist positiv");
        } else {
            System.out.println(zahl + " ist negativ");
        }
        s.close();

    }

}