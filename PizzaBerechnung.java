public class PizzaBerechnung{
	public static void main(String[] args){
	double leerePizza = 6.50;
	double belageZusatz = 0.75;
	int belagAnzahl1 = 0;	
	int belagAnzahl2 = 3;
	int belagAnzahl3 = 12;
	
	if(belagAnzahl1 > 0){
	double pizzaPreisGesamt = (leerePizza*(belageZusatz*belagAnzahl1));
	String PizzaPreisGesamt = String.format("%.2f",pizzaPreisGesamt);
	} else{
		double pizzaPreisGesamt = leerePizza;
		String PizzaPreisGesamt = String.format("%.2f",pizzaPreisGesamt);
		System.out.println("Bei "+belagAnzahl1+" Belaegen kostet die Pizza "+PizzaPreisGesamt+" Euro");
	}
	
	double pizzaPreisGesamt2 = (leerePizza*(belageZusatz*belagAnzahl2));
	String PizzaPreisGesamt2 = String.format("%.2f",pizzaPreisGesamt2);
	System.out.println("Bei "+belagAnzahl2+" Belaegen kostet die Pizza "+PizzaPreisGesamt2+" Euro");
	
	double pizzaPreisGesamt3 = (leerePizza*(belageZusatz*belagAnzahl3));
	String PizzaPreisGesamt3 = String.format("%.2f",pizzaPreisGesamt3);
	System.out.println("Bei "+belagAnzahl3+" Belaegen kostet die Pizza "+PizzaPreisGesamt3+" Euro");	
	}	
}