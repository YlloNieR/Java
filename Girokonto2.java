import java.util.Scanner;

public class Girokonto2 extends BankKonto2 {
    public double gebuehr;

    public Girokonto2(double anfangsBetrag2, double gebuehr) {
        super(anfangsBetrag2);
        this.gebuehr = gebuehr;
    }

    public String kommastellen(double x) {
        String s = String.format("%.2f", x);
        return s;
    }

    public static void main(String[] args) {
        // GUI Anfang
        BankKonto2 bankKonto2 = new BankKonto2(25.0);
        Bankkonto2Gui GUI = new Bankkonto2Gui(bankKonto2);
        GUI.setVisible(true);        
        // GUI Ende

        // Anfang Terminal Teil des Programms
        
        Scanner s = new Scanner(System.in);
        System.out.println("\nGeben Sie den Anfangsbestand ihres Kontos an:");

        double anfangsBetrag2 = s.nextDouble();
        double gebuehr = 2.3;

        Girokonto2 kontoNeu = new Girokonto2(anfangsBetrag2, gebuehr);
        System.out.println("\nAusgangsbetrag: " + kontoNeu.kommastellen(kontoNeu.kontoStand2) + " Euro");
        double einzahlung = 4;
        kontoNeu.einzahlen(einzahlung);
        kontoNeu.kontoStand2 = kontoNeu.kontoStand2 - gebuehr;
        System.out.println("nach Einzahlung von " + kontoNeu.kommastellen(einzahlung) + " Euro"
                + " nach Abzug der Gebuehr: " + kontoNeu.kommastellen(kontoNeu.kontoStand2) + " Euro");

        try {
            kontoNeu.abheben(30);
        } catch (AusnahmeException ausnahmeException) {
            System.out.print("Kann nicht negativ werden!\n");
            System.exit(0);
        }

        kontoNeu.kontoStand2 = kontoNeu.kontoStand2 - gebuehr;
        System.out.println("nach Auszahlung von " + kontoNeu.kommastellen(einzahlung) + " Euro"
                + " nach Abzug der Gebuehr: " + kontoNeu.kommastellen(kontoNeu.kontoStand2) + " Euro");
        s.close();
        // Ende Terminal Teil des Programms
        

    }

}