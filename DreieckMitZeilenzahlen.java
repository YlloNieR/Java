import java.util.Scanner;

public class DreieckMitZeilenzahlen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Geben Sie die Anzahl der Zeilen ein:");
        int zeilenanzahl = s.nextInt();
        System.out.println("\nAusgabe:");

        for (int i = 1; i <= zeilenanzahl; i++) {
            for (int j = 1; j < (i + 1); j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        s.close();
    }
}