import java.util.InputMismatchException;
import java.util.Scanner;

public class FacultyRecursive {

    public int n;
    public int ergebnis = 1;

    public int faculty(int n) {
        if (n == 0) {
            return ergebnis;
        } else {
            ergebnis = ergebnis * n;
            return (faculty(n - 1));
        }

    }

    public static void main(String[] args) {
        /* Faculty: n */
        /* n! = n*(n-1)*(n-2)*(n-3)*...*1 */
        /* 5! = 5*4*3*2*1 = 120 */
        /* 4! = 4*3*2*1 = 24 */

        FacultyRecursive rf = new FacultyRecursive();

        Scanner s = new Scanner(System.in);

        System.out.println("\nrobuste Faculty Berechnung");
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
                        System.out.println("\nDie Faculty von " + integer + " ist " + rf.faculty(integer) + "\n");
                    }
                }
            } catch (InputMismatchException exeptionName) {
                System.out.println("Error - Das ist Kein Integer \n= try / catch InputMismatchException exeptionName");          
            }
        }        
    }
}
