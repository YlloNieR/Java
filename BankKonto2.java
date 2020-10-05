
public class BankKonto2{
    protected double kontoStand2;

    public BankKonto2(double anfangsBetrag2) {
        this.kontoStand2 = anfangsBetrag2;
    }

    public double getKontoStand() {
        return this.kontoStand2;
    }

    public String kommastellen(double x) {
        String s = String.format("%.2f", x);
        return s;
    }

    public void einzahlen(double x) {
        this.kontoStand2 = this.kontoStand2 + x;
        System.out.println(
                "Der Betrag " + kommastellen(x) + " Euro wurde auf das Konto eingezahlt.\nDer neue Kontostand lautet: "
                        + kommastellen(this.kontoStand2) + " Euro");
    }

    public void abheben(double x) throws AusnahmeException{
        if(this.kontoStand2-x < 0) throw new AusnahmeException("Konto kann nicht ueberzogen werden!\n");        
        this.kontoStand2 = this.kontoStand2 - x;
        System.out.println(
                "Der Betrag " + kommastellen(x) + " Euro wurde vom Konto abhgehoben.\nDer neue Kontostand lautet: "
                        + kommastellen(this.kontoStand2) + " Euro");
    }       
}