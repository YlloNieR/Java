import java.util.InputMismatchException;
import java.util.Scanner;

public class RekursivFakultaet {

    public int n;
    public int ergebnis = 1;

    public int fakultaet(int n) {
        if (n == 0) {
            return ergebnis;
        } else {
            ergebnis = ergebnis * n;
            return (fakultaet(n - 1));
        }

    }

    public static void main(String[] args) {
        /* Fakultaet: n */
        /* n! = n*(n-1)*(n-2)*(n-3)*...*1 */
        /* 5! = 5*4*3*2*1 = 120 */
        /* 4! = 4*3*2*1 = 24 */

        RekursivFakultaet rf = new RekursivFakultaet();

        Scanner s = new Scanner(System.in);

        System.out.println("\nrobuste Fakultaet Berechnung");
        while (true) {
            try {
                System.out.println("Geben Sie eine Zahl ein zwischen 0 & 11:");
                int integer = s.nextInt();
                if (integer > 10 || integer == 0) {
                    throw new IllegalArgumentException(
                            "\nError - Die Zahl liegt nicht Bereich zwischen 0 & 11 \n= throw new IllegalArgumentException");
                } else {
                    if (integer < 0) {
                        throw new IllegalArgumentException(
                                "\nError - Die Zahl ist negativ \n= throw new IllegalArgumentException");                                
                    } else {
                        System.out.println("\nDie Fakultaet von " + integer + " ist " + rf.fakultaet(integer) + "\n");
                    }
                }
            } catch (InputMismatchException exeptionName) {
                System.out.println("Error - Das ist Kein Integer \n= try / catch InputMismatchException exeptionName");          
            }
        }        
    }
}
