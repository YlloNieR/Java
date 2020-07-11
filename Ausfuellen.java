import java.util.Scanner;

public class Ausfuellen {
	public static void main(String[] args){							// main = Verhalten/Methode führt zur Ausgabe
		Scanner input = new Scanner(System.in);						
		System.out.println("Hallo, wie ist Ihr Name?");				// Klasse System Verhalten/Methode println() 1x mal ausgeführt
		String name = input.next();									// Klasse Scanner Verhalten/Methode next() 
		System.out.println("Hallo "+name);							// Klasse System Verhalten/Methode println() 2x mal ausgeführt
		
		int zahl1 = 5; // Hier müssen Sie die Kommentarzeichen entfernen
		
		System.out.println("Hier sollte 5 stehen: \n"+zahl1);
		
		int zahl2 = 2; // Hier müssen Sie der Variable einen Wert zuweisen
		
		System.out.println("Hier steht 7:\n"+zahl2);
		
		int zahl3 = 12; // Hier müssen Sie eine Varialbe zahl3 deklarieren, und den Wert 12 zuweisen
		
		System.out.println("Hier steht 12:\n"+zahl3);
		
		int ergebnis = zahl1-zahl2-2; // Lassen Sie hier das Ergebnis berechnen
		
		System.out.println("Hier steht das Ergebnis von zahl1 - zahl2 (-2):\n"+ergebnis);
		
		double zahl4 = 1.5;// Schreiben Sie hier eine Kommazahl mit den Wert 1.5
		
		System.out.println("Hier steht eine Kommazahl 1.5:\n"+zahl4);
		
		System.out.println("Hier wird der Kommazahl der Rest abgeschnitten:\n"+(int)zahl4);
		
		char c = 'F'; // Schreiben Sie hier ein F
		
		System.out.println("Hier steht ein F [in chat]\n"+c);
		
		String motivation = new String("Weiter so"); // geben Sie hier eine motivierende Nachricht ein
		
		System.out.println("\n"+motivation+"\n");
		
		boolean wahrheitswert = true; //vergleichen Sie hier, ob ergebnis kleiner als zahl3 ist
		
		if (zahl3 > ergebnis){
			System.out.println("Ist das Ergebnis kleiner als zahl3?:\n"+wahrheitswert);
		}
		else {
			System.out.println("not true");
		}
		System.out.println("Gut gemacht!");
	}
}