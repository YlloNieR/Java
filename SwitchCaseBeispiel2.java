import java.util.Scanner;

public class SwitchCaseBeispiel2 {
    public static void main(String[] args) {
        String IstNicht = " != ";
        String kleiner = " < ";
        String groesser = " > ";

        Scanner s = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein:");
        int i = s.nextInt();
        System.out.println("Geben Sie eine Zahl ein:");
        int j = s.nextInt();
        int a = 0;

        System.out.println("Ausgabe If Abfrage");
        if (i != j) {
            System.out.println(i + IstNicht + j);
        }
        if (i < j) {
            System.out.println(i + kleiner + j);
        }
        if (i > j) {
            System.out.println(i + groesser + j);
        }

        System.out.println("Ausgabe Switch Case");
        if (i != j) {
            a = 1;
        }
        if (i < j) {
            a = 2;
        }
        if (i > j) {
            a = 3;
        }

        switch (a) {

            case 1:
                System.out.println(i + IstNicht + j);
                System.out.println(i + kleiner + j);

                break;

            case 2:
                System.out.println(i + IstNicht + j);
                System.out.println(i + groesser + j);
                break;

            default:
                System.out.println("Fehler");
                break;
        }
        s.close();

    }
}