public class Verbrauch{
	public static void main(String[] args){
		double autoVerbrauchBenzin = 6.8/100;
		double autoVerbrauchOel = 0.5/1000;
		
		// Aufgabe 5.2
		double benzinBerechnung1 = 0.5*autoVerbrauchBenzin; 
		String BenzinBerechnung1 = String.format("%.2f",benzinBerechnung1);
		double oelBerechnung1 = 0.5*autoVerbrauchOel; 
		String OelBerechnung1 = String.format("%.4f",oelBerechnung1);
		
		double benzinBerechnung2 =  5*autoVerbrauchBenzin; 
		String BenzinBerechnung2 = String.format("%.2f",benzinBerechnung2);
		double oelBerechnung2 = 5*autoVerbrauchOel; 
		String OelBerechnung2 = String.format("%.4f",benzinBerechnung2);

		double benzinBerechnung3 =  314.15*autoVerbrauchBenzin;
		String BenzinBerechnung3 = String.format("%.2f",benzinBerechnung3);
		double oelBerechnung3 = 314.15*autoVerbrauchOel; 
		String OelBerechnung3 = String.format("%.4f",oelBerechnung3);
		System.out.println("\nAufgabe 5.2");
		System.out.println("mit dem Wert 0,5 km ist der Benzinverbrauch = "+BenzinBerechnung1+" Liter");
		System.out.println("mit dem Wert 0,5 km ist der Oelverbrauch = "+OelBerechnung1+" Liter");
		System.out.println("mit dem Wert 5 km ist der Benzinverbrauch = "+BenzinBerechnung2+" Liter");
		System.out.println("mit dem Wert 5 km ist der Oelverbrauch = "+OelBerechnung2+" Liter");
		System.out.println("mit dem Wert 314.15 km ist der Benzinverbrauch = "+BenzinBerechnung3+" Liter");
		System.out.println("mit dem Wert 314.15 km ist der Oelverbrauch = "+OelBerechnung3+" Liter\n");
				
		// Aufgabe 5.3
		double benzinPreis = 1.207;
		double oelPreis = 37.47/5;
		
		double benzinPreis1 = benzinPreis * benzinBerechnung1;
		String BenzinPreis1 = String.format("%.2f",benzinPreis1);
		double oelPreis1 = oelPreis * oelBerechnung1;
		String OelPreis1 = String.format("%.2f",oelPreis1);
		double benzinPreis2 = benzinPreis * benzinBerechnung2;
		String BenzinPreis2 = String.format("%.2f",benzinPreis2);
		double oelPreis2 = oelPreis * oelBerechnung2;
		String OelPreis2 = String.format("%.2f",oelPreis2);
		double benzinPreis3 = benzinPreis * benzinBerechnung3;
		String BenzinPreis3 = String.format("%.2f",benzinPreis3);
		double oelPreis3 = oelPreis * oelBerechnung3;
		String OelPreis3 = String.format("%.2f",oelPreis3);
		
		System.out.println("\nAufgabe 5.3");
		System.out.println("bei 0,5 km kostet das Benzin = "+BenzinPreis1+" Euro");
		System.out.println("bei 0,5 km ist der Oelverbrauch = "+OelPreis1+" Euro");
		System.out.println("bei 5 km ist der Benzinverbrauch = "+BenzinPreis2+" Euro");
		System.out.println("bei 5 km ist der Oelverbrauch = "+OelPreis2+" Euro");
		System.out.println("bei 314.15 km ist der Benzinverbrauch = "+BenzinPreis3+" Euro");
		System.out.println("bei 314.15 km ist der Oelverbrauch = "+OelPreis3+" Euro");
	}	
}