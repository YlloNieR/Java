public class Girokonto2 extends BankKonto2 {
    public double gebuehr;

    public Girokonto2(double anfangsBetrag2, double gebuehr) {
        super(anfangsBetrag2);
        this.gebuehr = gebuehr;
    }

    public String kommastellen(double x){
        String s = String.format("%.2f",x);
        return s;
    }

    public static void main(String[] args) {
        double anfangsBetrag2 = 100;
        double gebuehr = 2.3;
        Girokonto2 kontoNeu = new Girokonto2(anfangsBetrag2, gebuehr);
        System.out.println("Ausgangsbetrag: " + kontoNeu.kommastellen(kontoNeu.kontoStand2)+" Euro");
        double einzahlung = 4;
        kontoNeu.einzahlen(einzahlung);
        kontoNeu.kontoStand2 = kontoNeu.kontoStand2 - gebuehr;
        System.out.println("nach Einzahlung von " + kontoNeu.kommastellen(einzahlung)+" Euro" + " nach Abzug der Gebuehr: " + kontoNeu.kommastellen(kontoNeu.kontoStand2)+" Euro");
        double auszahlung = 2;
        kontoNeu.abheben(auszahlung);
        kontoNeu.kontoStand2 = kontoNeu.kontoStand2 - gebuehr;
        System.out.println("nach Auszahlung von " + kontoNeu.kommastellen(einzahlung)+" Euro" + " nach Abzug der Gebuehr: " + kontoNeu.kommastellen(kontoNeu.kontoStand2)+" Euro");
    }
}