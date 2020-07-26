public class PizzaBerechnung{
	public static void main(String[] args){
	double leerePizza = 6.50;
	double belageZusatz = 0.75;
	int belagAnzahl1 = 0;	
	int belagAnzahl2 = 3;
	int belagAnzahl3 = 12;
	
	
	if(belagAnzahl1 > 0){
	double pizzaPreisGesamt = (leerePizza*(belageZusatz*belagAnzahl1));	
	System.out.println("Bei "+belagAnzahl1+" Belaegen kostet die Pizza "+zweistellig(pizzaPreisGesamt)+" Euro");
	} else{
		double pizzaPreisGesamt = leerePizza;
		System.out.println("Bei "+belagAnzahl1+" Belaegen kostet die Pizza "+zweistellig(pizzaPreisGesamt)+" Euro");
	}
	
	double pizzaPreisGesamt2 = (leerePizza*(belageZusatz*belagAnzahl2));	
	System.out.println("Bei "+belagAnzahl2+" Belaegen kostet die Pizza "+zweistellig(pizzaPreisGesamt2)+" Euro");
	
	double pizzaPreisGesamt3 = (leerePizza*(belageZusatz*belagAnzahl3));	
	System.out.println("Bei "+belagAnzahl3+" Belaegen kostet die Pizza "+zweistellig(pizzaPreisGesamt3)+" Euro");	
	}	

	public static String zweistellig(double zahl){
		String umwandler = String.format("%.2f",zahl);
		return umwandler;
	}
}