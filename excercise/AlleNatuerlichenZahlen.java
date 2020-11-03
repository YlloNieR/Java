import java.util.Scanner;

public class AlleNatuerlichenZahlen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Geben Sie die Laenge ein, die gezaehlt werden soll:");
        int laenge = s.nextInt();
        System.out.println("\nAusgabe:");

        int z = 0;
        for(int i = 0; i < laenge; i++){
            System.out.println(i+1);
            z = (i+1) + z;
        }
        System.out.println("Summe = "+z);
        s.close();
    }
}