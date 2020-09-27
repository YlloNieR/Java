public class Auto {
    public Farben farbe;
    private double kilometer;
    public String marke;
    public int ps;
    public double verbrauch;
    private double preis;
    public int baujahr;
    private double tank;

    public Auto(Farben farbe,double kilometer,String marke, int ps, double verbrauch,double preis,int baujahr,double tank){
        this.farbe = farbe;
        this.kilometer = kilometer;
        this.marke = marke;
        this.ps = ps;
        this.verbrauch = verbrauch;
        this.preis = preis;
        this.baujahr = baujahr;
        this.tank = tank;
    }

    //default Konstruktor
    public Auto(){
        this.farbe = Farben.Rot;
        this.kilometer = 20;
        this.marke = "Mercedes";
        this.ps = 200;
        this.verbrauch = 5;
        this.preis = 20000;
        this.baujahr = 1998;
        this.tank = 40;
    }

    public static void fahren(){
        System.out.println("Das Auto fährt");
    };

    public static void bremsen(){
        System.out.println("Das Auto bremst");
    };

    public static double spritverbrauch( double kilometer, double verbrauch){
        double berechnung = kilometer*(verbrauch/100);        
        return berechnung;
    };

    public static void kundendienst(){
        System.out.println("In 1000 km ist Kundendienst!");
    };

    public static String hupen(){
        java.awt.Toolkit.getDefaultToolkit().beep();
        return "tuuuuuuut";
    };

    public static void aufleuchten(){
        System.out.println("Es leuchtet!");
    };

    public static void tanken(int tank, double kilometer, double verbrauch){
        double spritverbrauchErg = spritverbrauch(kilometer,verbrauch);
        double ergebnis = spritverbrauchErg * tank;
        System.out.println("In "+ergebnis+" km sollten Sie tanken fahren!");
    };
}