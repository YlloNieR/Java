import java.util.Scanner;

public class WochentagAusgabe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Geben Sie die erste Zahl ein:");
        
        String[] wochentag = {"Montag", "Dienstag","Mittwoch","Donnerstag","Freitag","Samstag","Sonntag"};
        int zahl = s.nextInt();

        while(zahl > 7){
            System.out.println("Ihre Zahl ist groesser als 7! Geben Sie erneut eine Zahl ein!");    
            zahl = s.nextInt();
        }
        System.out.println("Der Wochentag ist " + wochentag[zahl-1]);
        s.close();
    }
}