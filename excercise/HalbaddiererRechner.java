import java.util.Scanner;
import java.lang.Integer;

public class HalbaddiererRechner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Geben Sie a ein!");
        int a = s.nextInt();
        System.out.println("Geben Sie b ein!");
        int b = s.nextInt();

        if (a > 1 || b > 1) {
            System.out.println("Eine der eingebenen Zahlen ist keine binaer Zahl");
            System.exit(0);
        }

        if (a == 1 || b == 1) {
            System.out.println("Wenn a = " + a);
            System.out.println("und b = " + b);
            System.out.println("dann Summe = " + 0);
            System.out.println("dann Uebertrag = " + 1);
        }

        if (a == 1 && b == 0 || a == 0 && b == 1) {
            System.out.println("Wenn a = " + a);
            System.out.println("und b = " + b);
            System.out.println("dann Summe = " + 1);
            System.out.println("dann Uebertrag = " + 0);
        }

        if (a == 0 && b == 0) {
            System.out.println("Wenn a = " + a);
            System.out.println("und b = " + b);
            System.out.println("dann Summe = " + 0);
            System.out.println("dann Uebertrag = " + 0);
        }
        s.close();
    }

    public static String berechnung(int c, int d) {
        String e = Integer.toBinaryString(c + d);
        return e;

    }
}