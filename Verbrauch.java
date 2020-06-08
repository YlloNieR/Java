public class Verbrauch{
    public static void main(String[] args){
        double VerbrauchBenzin = 6.8/100;
        String StringVerbrauchBenzin = String.format("%.4f", VerbrauchBenzin);
        double VerbrauchOel = 0.5/1000;
        String StringVerbrauchOel = String.format("%.4f", VerbrauchOel);

        double KMStrecke = 314.15; // Hier die Kilometereingabe

        double BerechnungBenzin = VerbrauchBenzin*KMStrecke;
        String StringBerechnungBenzin = String.format("%.4f", BerechnungBenzin);
        double BerechnungOel = VerbrauchOel*KMStrecke;
        String StringBerechnungOel = String.format("%.4f", BerechnungOel);
        System.out.println("Autoverbraucher Rechner\n");
        System.out.println("Bei einer Strecke von \n"+KMStrecke+" km & einem Benzin Verbauch von\n"+StringVerbrauchBenzin+" l/km & einem Oelverbrauch von\n"+StringVerbrauchOel+" l/km\n");
        System.out.println("hat man folgenden Verbrauch:\n");
        System.out.println("Benzin = "+StringBerechnungBenzin+" l"+"\nOel = "+StringBerechnungOel+" l\n");

        double Benzinpreis = 1.207;
        String StringBenzinpreis = String.format("%.2f", Benzinpreis);
        double Oelpreis = 37.47/5;
        String StringOelpreis = String.format("%.2f", Oelpreis);
        double BerechnungBenzinpreis = BerechnungBenzin*Benzinpreis;
        String StringBerechnungBenzinpreis = String.format("%.2f", BerechnungBenzinpreis);
        double BerechnungOelpreis = BerechnungOel*Oelpreis;
        String StringBerechnungOelpreis = String.format("%.2f", BerechnungOelpreis);
        System.out.println("Bei einem Benzinpreis von \n"+StringBenzinpreis+" EURO/l & einem Oelpreis von\n"+StringOelpreis+" EURO/l \n");
        System.out.println("hat man folgende Kosten:\n");
        System.out.println("Benzin = "+StringBerechnungBenzinpreis+" EURO"+"\nOel = "+StringBerechnungOelpreis+" EURO");

    }    
}