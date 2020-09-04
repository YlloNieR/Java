import java.util.Scanner;

public class DreieckDiamantZahlen {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Geben Sie die Anzahl der Zeilen ein:");
        int zeilenanzahl = s.nextInt();
        System.out.println("\nAusgabe:");

        zeilenanzahl = 2 * zeilenanzahl;
        int zeile = 0;
        String space = " ";
        int tmp = 1;
        int tmp2 = 0;

        for (int i = 0; i <= zeilenanzahl; i++) {
            if (i % 2 != 0) {
                zeile++;
                for (int k = zeilenanzahl; k > i; k = k - 2) {
                    System.out.print(space);
                }
                tmp = zeile;
                for (int j = 0; j < tmp + zeile; j++) {
                    System.out.print(tmp);
                    tmp--;
                }
                tmp2 = 2;
                for (int j = 1; j < zeile; j++) {
                    System.out.print(tmp2);
                    tmp2++;
                }
                System.out.println();
            }
        }
        for (int i = 0; i < zeile; i++) {
            System.out.print(space);
            System.out.print(space);
            for (int k = 0; k < i; k++) {
                System.out.print(space);
            } 
            for (int j = zeile - i-1; j > 0; j--) {
                System.out.print(j);
            }
            for(int l = 2; l<zeile-i; l++){
                System.out.print(l);
            }
            
            System.out.println();
        }
        s.close();
    }
}