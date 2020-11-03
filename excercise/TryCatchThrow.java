import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchThrow {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Bitte gebe eine Zahl kleiner 10 &\ngroesser 0:");
        int input = 0;

        try {
            input = s.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Das war keine Zahl!");
        }

        if (input < 10) {
            throw new IllegalArgumentException("Falsche Zahl!");
        }
        s.close();
    }
}
