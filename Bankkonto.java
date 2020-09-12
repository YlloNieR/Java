public class Bankkonto {
    // Attribute
    private int kontonummer;
    private double guthaben;
    private String inhaber;

    // Konstruktor
    // wie erstelle ich ein Objekt?
    // was muss ich bekommen?
    public Bankkonto(int kontonummer, String name){
        this.kontonummer = kontonummer; // this = aus dieser Klasse        
        this.guthaben = 0.0;
        this.inhaber = name;
    }

    public Bankkonto(int kontonummer, String name, double kontostand){
        this.kontonummer = kontonummer; // this = aus dieser Klasse        
        this.guthaben = kontostand;
        this.inhaber = name;
    }

    // default Konstruktor
    public Bankkonto(){
        this.kontonummer = 000; // this = aus dieser Klasse        
        this.guthaben = 0.0;
        this.inhaber = "John Doe";
    }

    public void setInhaber(String name){
        this.inhaber = name;
    }

    public String getInhaber(){
        return this.inhaber;
    }

    public void setGuthaben(double betrag){
        this.guthaben = betrag;
    }

    public double getGuthaben(){
        return this.guthaben;
    }

    public void einzahlen(double einzahlung){
        double neuerBetrag = getGuthaben()+einzahlung;
        setGuthaben(neuerBetrag);        
    }

    public void abheben(double abhebung){
        double neuerBetrag = getGuthaben()-abhebung;
        setGuthaben(neuerBetrag);
    }

    public double zinsen(double zinssatz){
        double neuerBetrag = ((getGuthaben()/100)*zinssatz)+getGuthaben();
        setGuthaben(neuerBetrag);
        return getGuthaben();
    }
 

    public void kontoauszug(){
        System.out.println("Der Inhaber ist: "+this.inhaber);
        System.out.println("Das Guthaben ist: "+this.guthaben+" Euro");
        System.out.println("Die Knr.: "+this.kontonummer);
    }
}
