// import java.util.Scanner;

public class Girokonto extends Bankkonto {

    public Girokonto(String kontobesitzer2In, double anfangsBetrag2In, double kontofuehrungsgebuehr2In, double kontozinssatz2In) {
        super(kontobesitzer2In, anfangsBetrag2In, kontofuehrungsgebuehr2In, kontozinssatz2In);
    }

    public String kommastellen(double x) {
        String s = String.format("%.2f", x);
        return s;
    }

    public static void main(String[] args) {
        // GUI Anfang
        Bankkonto bankKonto2 = new Bankkonto("Heiko Marzahn", 200.0, 2.0, 1.3);
        BankkontoGUI GUI = new BankkontoGUI(bankKonto2);
        GUI.setVisible(true);
        // GUI Ende

        /*
         * // Anfang Terminal Teil des Programms Scanner s = new Scanner(System.in);
         * System.out.println("\nGeben Sie den Anfangsbestand ihres Kontos an:");
         * 
         * double anfangsBetrag2 = s.nextDouble(); double gebuehr = 2.3;
         * 
         * Girokonto2 kontoNeu = new Girokonto2(anfangsBetrag2, gebuehr);
         * System.out.println("\nAusgangsbetrag: " +
         * kontoNeu.kommastellen(kontoNeu.kontoStand2) + " Euro"); double einzahlung =
         * 4; kontoNeu.einzahlen(einzahlung); kontoNeu.kontoStand2 =
         * kontoNeu.kontoStand2 - gebuehr; System.out.println("nach Einzahlung von " +
         * kontoNeu.kommastellen(einzahlung) + " Euro" + " nach Abzug der Gebuehr: " +
         * kontoNeu.kommastellen(kontoNeu.kontoStand2) + " Euro");
         * 
         * try { kontoNeu.abheben(30); } catch (AusnahmeException ausnahmeException) {
         * System.out.print("Kann nicht negativ werden!\n"); System.exit(0); }
         * 
         * kontoNeu.kontoStand2 = kontoNeu.kontoStand2 - gebuehr;
         * System.out.println("nach Auszahlung von " + kontoNeu.kommastellen(einzahlung)
         * + " Euro" + " nach Abzug der Gebuehr: " +
         * kontoNeu.kommastellen(kontoNeu.kontoStand2) + " Euro"); s.close(); // Ende
         * Terminal Teil des Programms
         */
    }
}