public class Pizzabelag {
    public static void main(String[] args){
        double leerePizza = 6.50;
        String StringleerePizza = String.format("%.2f",leerePizza);
        double Belag = 0.75;
        String StringBelag = String.format("%.2f",Belag);
        int Anzahl = 12;

        if (Anzahl == 0){
            double Berechnung = leerePizza;
            String StringBerechnung = String.format("%.2f",Berechnung);    
            System.out.println("Grundpreis der Pizza = "+StringleerePizza+" EURO");
            System.out.println("Belagpreis = "+StringBelag+" EURO");
            System.out.println("Anzahl Belaege = "+Anzahl);
            System.out.println("Gesamtpreis = "+StringBerechnung+" EURO");
        }
        else{
            double Berechnung = leerePizza * (Belag*Anzahl);
            String StringBerechnung = String.format("%.2f",Berechnung);    
            System.out.println("Grundpreis der Pizza = "+StringleerePizza+" EURO");
            System.out.println("Belagpreis = "+StringBelag+" EURO");
            System.out.println("Anzahl Belaege = "+Anzahl);
            System.out.println("Gesamtpreis = "+StringBerechnung+" EURO");
        }
    }
}