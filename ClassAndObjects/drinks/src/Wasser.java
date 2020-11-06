public class Wasser extends Getraenk{
    public Wasser(double preis, double menge){
        super(preis, menge);
    }
    
    @Override 
    public void trinken(){
        System.out.println("Es werden keine Kalorien konsumiert");
    }


    public static void main(String[] args){
        Wasser h2o = new Wasser(1.50,0.5);
        h2o.trinken();
    }
}
