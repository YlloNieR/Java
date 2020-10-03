import java.util.Scanner;

public class AusnahmeException {
    protected double kontoStand2; 

    public double wiederholeAbfrage() {
        System.out.println("Wiederhole Abfrage:");
        Scanner s = new Scanner(System.in);
        double wAbfrage = s.nextDouble();
        s.close();
        return this.kontoStand2 = wAbfrage;
    }
    
    public double getKontoStand() {
        return this.kontoStand2;
    }

    public void exception(double x) {
        try {
            if (x < 0) {
                throw new IllegalArgumentException();
            } 
        } catch (IllegalArgumentException e) {
            System.out.println("Der Anfangsbestand darf nicht negativ sein!");
            wiederholeAbfrage();
        }
    }
}
