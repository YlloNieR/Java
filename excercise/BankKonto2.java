
public class BankKonto2 {    
    protected String kontobesitzer2;
    protected double kontoStand2;
    protected double kontofuehrungsgebuehr2;
    protected double kontozinssatz2;

    public BankKonto2(String kontobesitzer2In, double anfangsBetrag2In, double kontofuehrungsgebuehr2In, double kontozinssatz2In) {
        this.kontobesitzer2 = kontobesitzer2In;
        this.kontoStand2 = anfangsBetrag2In;
        this.kontofuehrungsgebuehr2 = kontofuehrungsgebuehr2In;
        this.kontozinssatz2 = kontozinssatz2In;
    }

    public String getKontobesitzer() {
        return this.kontobesitzer2;
    }

    public double getKontostand() {
        return this.kontoStand2;
    }

    public double getKontofuehrungsgebuehr() {
        return this.kontofuehrungsgebuehr2;
    }

    public double getKontozinssatz() {
        return this.kontozinssatz2;
    }    

    public String kommastellen(double x) {
        String s = String.format("%.2f", x);
        return s;
    }

    public void einzahlen(double x) {
        this.kontoStand2 = this.kontoStand2 + x;
        /*
         * System.out.println( "Der Betrag " + kommastellen(x) +
         * " Euro wurde auf das Konto eingezahlt.\nDer neue Kontostand lautet: " +
         * kommastellen(this.kontoStand2) + " Euro");
         */
    }

    public String zweistellen(double x){
        String str = String.format("%.2f",x);
        return str;
    }

    public void abheben(double x) throws AusnahmeException {
        if (this.kontoStand2 - x < 0)
            throw new AusnahmeException("Konto kann nicht ueberzogen werden!\n");
        this.kontoStand2 = this.kontoStand2 - x;
        /*
         * System.out.println( "Der Betrag " + kommastellen(x) +
         * " Euro wurde vom Konto abhgehoben.\nDer neue Kontostand lautet: " +
         * kommastellen(this.kontoStand2) + " Euro");
         */
    }
}