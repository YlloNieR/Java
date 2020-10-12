abstract class GleichseitigesVieleck {

    public int seitenanzahl;
    public int seitenLaenge;

    public GleichseitigesVieleck(int seitenanzahl, int seitenLaenge) {
        this.seitenanzahl = seitenanzahl;
        this.seitenLaenge = seitenLaenge;
    }

    public int getAnzahlSeiten(){
        return seitenanzahl;
    };

    public int getSeitenLaenge(int zahl){
        return seitenanzahl;
    };

}


/*public interface GleichseitigesVieleck {

    abstract int getAnzahlSeiten();

    abstract int getSeitenLaenge(int zahl);

}*/
