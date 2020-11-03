import java.util.Scanner;

public class DreieckZahlenPyramide {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Geben Sie die Anzahl der Zeilen ein:");
        int zeilenanzahl = s.nextInt();
        System.out.println("\nAusgabe:");

        String space = " ";
        int tmp = zeilenanzahl;
        for (int i = 1; i <= zeilenanzahl; i++) {
            for (int k = tmp; k > 0; k--) {
                System.out.print(space);
            }
            for (int j = 1; j < (i + 1); j++) {
                System.out.print(i);
                for(int l = 0;l < 1;l++){
                    System.out.print(space);
                }
            }
            tmp--;
            System.out.println();
        }
        s.close();
    }
}
