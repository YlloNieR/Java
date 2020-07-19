import java.util.Scanner;
import java.util.Arrays;

public class Allrounder {

	public static int option1Addieren(int a, int b) {
		int addition = a + b;
		return addition;
	}

	public static int[] option2sortierenVonKleinNachGross(int a, int b, int c) {
		// a b c 9 8 7
		if (a > b) {
			int tmp;
			tmp = b;
			b = a;
			a = tmp;
		}
		// a b c 8 9 7
		if (b > c) {
			int tmp;
			tmp = c;
			c = b;
			b = tmp;
		}
		// a b c 8 7 9
		if (a > b) {
			int tmp;
			tmp = b;
			b = a;
			a = tmp;
		}
		// a b c 7 8 9
		int[] zahlArray = new int[3];
		zahlArray[0] = a;
		zahlArray[1] = b;
		zahlArray[2] = c;

		return zahlArray;
	}

	public static int[] option3sortierenVonGrossNachKlein(int a, int b, int c) {
		// a b c 7 8 9
		if (a < b) {
			int tmp;
			tmp = b;
			b = a;
			a = tmp;
		}
		// a b c 8 7 9
		if (b < c) {
			int tmp;
			tmp = c;
			c = b;
			b = tmp;
		}
		// a b c 8 9 7
		if (a < b) {
			int tmp;
			tmp = b;
			b = a;
			a = tmp;
		}
		// a b c 9 8 7
		int[] zahlArray = new int[3];
		zahlArray[0] = a;
		zahlArray[1] = b;
		zahlArray[2] = c;

		return zahlArray;
	}

	public static double option4BenzinUndOelverbrauchBerechnen(int liter, double benzinpreis) {
		double benzinpreisberechnung = liter * benzinpreis;
		return benzinpreisberechnung;
	}

	public static int option5RestBerechnen(int a, int b) {
		int moduloBerechnung = a % b;
		return moduloBerechnung;
	}

	public static void main(String[] args) {
		/** Auswahl **/
		String Option1 = "1 - Addieren ";
		String Option2 = "2 - nach Groesse sortieren von Klein nach Gross ";
		String Option3 = "3 - nach Groesse sortieren von Gross nach Klein ";
		String Option4 = "4 - Benzin und Oelverbrauch berechnen ";
		String Option5 = "5 - Rest berechnen ";
		String NL = "\n";
		System.out.println("Was moechten Sie machen?");
		System.out.println(Option1 + NL + Option2 + NL + Option3 + NL + Option4 + NL + Option5);
		Scanner s = new Scanner(System.in);
		int Auswahl = s.nextInt();

		if (Auswahl == 1) {
			System.out.println(Option1 + "also:");
			System.out.println("Gib eine Zahl A ein:");
			int a = s.nextInt();
			System.out.println("Gib eine Zahl B ein:");
			int b = s.nextInt();
			System.out.println("Zahl " + a + " + " + "Zahl " + b + " = ");
			System.out.println(option1Addieren(a, b));

		} else if (Auswahl == 2) {
			System.out.println(Option2 + "also:");
			System.out.println("Gib eine Zahl A ein:");
			int a = s.nextInt();
			System.out.println("Gib eine Zahl B ein:");
			int b = s.nextInt();
			System.out.println("Gib eine Zahl C ein:");
			int c = s.nextInt();
			System.out.println("Werte Unsortiert");
			System.out.println(a + " " + b + " " + c);
			System.out.println("Sortiert von Klein nach Gross");
			System.out.println(Arrays.toString(option2sortierenVonKleinNachGross(a, b, c)));
		} else if (Auswahl == 3) {
			System.out.println(Option3 + "also:");
			System.out.println("Gib eine Zahl A ein:");
			int a = s.nextInt();
			System.out.println("Gib eine Zahl B ein:");
			int b = s.nextInt();
			System.out.println("Gib eine Zahl C ein:");
			int c = s.nextInt();
			System.out.println("Werte Unsortiert");
			System.out.println(a + " " + b + " " + c);
			System.out.println("Sortiert von Gross nach Klein");
			System.out.println(Arrays.toString(option3sortierenVonGrossNachKlein(a, b, c)));
		} else if (Auswahl == 4) {
			System.out.println(Option4 + "also:");
			System.out.println("Wieviel Liter hast du getankt?");
			int liter = s.nextInt();
			System.out.println("Gib an wie teuer das Benzin pro Liter war (z.B. 3.02 Euro):");
			double benzinpreis = s.nextInt();
			System.out.println("Gib deine gefahrenen Km ein:");
			int km = s.nextInt();
			System.out.println("Wieviel verbrauchst du auf 100km?");
			double aufHundert = s.nextInt();
			double verbrauchBerechnung = km * (aufHundert / 100);
			double benzinpreisberechnung = option4BenzinUndOelverbrauchBerechnen(liter, benzinpreis);
			String benzinpreisberechnungString = String.format("%.2f", benzinpreisberechnung);
			System.out.println("\nAuswertung");
			System.out.println("gefahrene KM: " + km + " km");
			System.out.println("Mein Verbrauch: " + aufHundert + " /100 km");
			System.out.println("Benzinkosten: " + benzinpreisberechnungString + " Euro");
			System.out.println("Benzinverbrauch: " + verbrauchBerechnung + " Liter");
		} else if (Auswahl == 5) {
			System.out.println(Option5 + "also:");
			System.out.println("Gib eine Zahl A ein:");
			int a = s.nextInt();
			System.out.println("Gib eine Zahl B ein:");
			int b = s.nextInt();
			System.out.println("Zahl " + a + " / " + "Zahl " + b + " = ");
			System.out.println((a / b) + " Rest " + option5RestBerechnen(a, b));
		}

	}
}