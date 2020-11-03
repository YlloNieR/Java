import java.util.Scanner;

public class DreieckMitZahlen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Geben Sie die Anzahl der Zeilen ein:");
        int zeilenanzahl = s.nextInt();
        System.out.println("\nAusgabe:");

        for (int i = 0; i < zeilenanzahl; i++) {
            for (int j = 0; j < (i + 1); j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
        s.close();
    }
}