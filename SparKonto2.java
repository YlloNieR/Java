public class SparKonto2 extends BankKonto2{
    private double zinsSatz2;

    private SparKonto2(double anfangsBetrag2, double zinsSatz2){
        super(anfangsBetrag2);
        this.zinsSatz2 = zinsSatz2;
    }

    public void zinsenAnrechnen(){
        this.kontoStand2 = (((this.kontoStand2/100)*this.zinsSatz2)+this.kontoStand2);
    }

    public String kommastellen(double x){
        String s = String.format("%.2f", x);
        return s;
    }

    public static void main(String[] args){
        double anfangsBetrag2 = 100;
        double zinsSatz2 = 2.4;

        SparKonto2 sparkKontoNeu = new SparKonto2(anfangsBetrag2,zinsSatz2);
        System.out.println("Sparkkontostand: "+sparkKontoNeu.kommastellen(sparkKontoNeu.kontoStand2)+" Euro");
        System.out.println("Zinssatz: "+sparkKontoNeu.kommastellen(sparkKontoNeu.zinsSatz2)+" Euro");
        sparkKontoNeu.zinsenAnrechnen();
        System.out.println("Sparkkontostand mit Zinsen: "+sparkKontoNeu.kommastellen(sparkKontoNeu.kontoStand2)+" Euro");
    }

}