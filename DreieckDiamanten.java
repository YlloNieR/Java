import java.util.Scanner;

public class DreieckDiamanten {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Geben Sie die Anzahl der Zeilen ein:");
        int zeilenanzahl = s.nextInt();
        System.out.println("\nAusgabe:");

        zeilenanzahl = 2 * zeilenanzahl;
        String space = " ";
        String diamant = "*";
        int tmp = zeilenanzahl;

        for (int i = 0; i <= zeilenanzahl; i++) {
            if (i % 2 != 0) {
                for (int k = zeilenanzahl; k > i; k = k - 2) {
                    System.out.print(space);
                }
                for (int j = 0; j < i; j++) {
                    System.out.print(diamant);
                }
                System.out.println();
            }
        }
        for (int i = 0; i < tmp; i++) {
            if (i % 2 == 0) {
                if (i > 0) {
                    if (tmp % 2 != 0) {
                        for (int k = 0; k < i; k = k + 2) {
                            System.out.print(space);
                        }

                        for (int j = tmp; j > i; j--) {
                            System.out.print(diamant);
                        }
                    } else {
                        int tmp2 = 0;
                        for (int k = 0; k <= i-tmp2; k++) {
                            System.out.print(space);
                            tmp2++;
                        }
                        for (int j = tmp - 1; j > i; j--) {
                            System.out.print(diamant);
                        }
                    }

                    System.out.println();
                }
            }

        }

        s.close();
    }
}