public class Getraenk {
    public double preis;
    public double menge;

    public Getraenk(double preis, double menge){
        this.preis = preis;
        this.menge = menge;
    }    

    public void trinken(){
        System.out.println("etwas trinken");
    }
}