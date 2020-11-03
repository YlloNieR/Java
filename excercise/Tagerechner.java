public class Tagerechner{
	public static void main(String[] args){
		// Aufgabe 2.1
		int heute = 23 ;
		int monat = 10;
		int omasGeb = 27;
		int omasGebMonat = 10;
		
		int verbleibendeTage = omasGeb - heute;
		int verbleibenMonate = omasGebMonat - monat;
		System.out.println("Aufgabe 2.3\nMeine Oma hat in "+verbleibendeTage+" und "+verbleibenMonate+" Monate"+" Geburtstag!\n");
		
		
		// Aufgabe 2.2
		int heute2 = 22 ;
		int monat2 = 6;
		int meinGeb = 6;
		int meinGebMonat = 8;
		int tageMonat = 28;
		
		int verbleibendeTage2 = ((tageMonat-heute2)+(meinGeb)+(tageMonat*(meinGebMonat-monat2)));
		System.out.println("Aufgabe 2.2\nMein Geburtstag ist in "+verbleibendeTage2+" Tagen!\n");

		
		// Aufgabe 2.3
		int jahr = 356;
		int verlbeibendeTage3 = jahr+verbleibendeTage2;
		System.out.println("Aufgabe 2.3\nBis zu meinem Geburtstag nächstes Jahr sind es noch "+verlbeibendeTage3+" Tage!\n");

	}
}