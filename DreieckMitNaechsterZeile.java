import java.util.Scanner;

public class DreieckMitNaechsterZeile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Geben Sie die Anzahl der Zeilen ein:");
        int zeilenanzahl = s.nextInt();
        System.out.println("\nAusgabe:");

        int tmp = 0;
        for (int i = 1; i <= zeilenanzahl; i++) {
            for (int j = 1; j <= i; j++) {
                    tmp++;
                    System.out.print(tmp); 
            }
            System.out.println();
        }
        s.close();
    }
}
