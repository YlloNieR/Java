import java.util.Scanner;

public class Primzahltester {
    public static void main(String[] args) {
        System.out.println("Primzahltester 1");

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int t = 0; // Teileranzahl
        int i = 1; // Laufvariable

        while (i <= n) {
            if ((n % i) == 0) {
                t++;
            } else {

            }
            i++;
        }

        if (t == 2) {
            System.out.println(n + " ist eine Primzahl.");
        } else {
            System.out.println(n + " ist keine Primzahl.");
        }    
        s.close();
    }
}