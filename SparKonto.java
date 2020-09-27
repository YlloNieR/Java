public class SparKonto extends Bankkonto {
    private double zinsSatz;

    public double SparKonto(double anfangsBetrag, double zinsSatz) {
        super(anfangsBetrag);
        this.zinsSatz = zinsSatz;
    }

    public void zinsenAnrechnen(){
        this.kontostand += (this.kontostand * this.zinsSatz);
    }
}
