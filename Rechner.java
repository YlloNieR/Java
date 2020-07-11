public class Rechner{
	public static void main (String[] args){
		// Modulo
		System.out.println("Aufgabe 3. Modulo\n");
		for(int i=0; i<10; i++){
			if(i%2 == 0){
				System.out.println(i+" ist eine gerade Zahl");
			}
			else{
				System.out.println(i);
			}
			
		}
		
		// Addition
		System.out.println("Aufgabe 3. Addition\n");
		int Summand1 = 2;
		int Summand2 = 4;
		int Summe = Summand1 + Summand2;
		
		System.out.println("Summand1 + Summand2 = "+Summe);		
		
		// Subtraktion
		System.out.println("Aufgabe 3. Subtraktion\n");		
		int Minuend = 2;
		int Subtrahend = 4;
		int Differenz = Minuend - Subtrahend;
		
		System.out.println("Minuend - Subtrahend = "+Differenz);					
		System.out.println("Aufgabe 3. Mutltiplikation\n");
		
		// Multiplikation
		int Faktor1 = 2;
		int Faktor2 = 4;
		int Produkt = Faktor1 * Faktor2;
				
		System.out.println("Faktor1 * Faktor2 = "+Produkt);		
		
		// Division
		System.out.println("Aufgabe 3. Division\n");
		int Dividend = 2;
		int Divisor = 4;
		double Quotient = (double)Dividend / Divisor;
		
		System.out.println("Dividend / Divisor = "+Produkt);		

	}	
}