public class Tagerechner {
    public static void main(String[] args){
        int heute = 23; //Heutiges Datum
        int monat = 10; // aktueller monat
        int meinGeb = 6; // Geburtstag am 6.
        int meinGebMonat = 8; // Ich habe im August Geburtstag
        int Rechnung_2_2 = ((28-heute) + meinGeb)+(((12-monat)+meinGebMonat)*28);        
        System.out.println("Es sind noch "+Rechnung_2_2+" Tage bis zu meinem Geburtstag."); // Ergebnis 2.2        
    }
}