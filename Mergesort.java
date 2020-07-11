import java.util.*;

public class mergesort{
	
	//erstellen einer methode um den Array in 2 gruppen zu unterteilen
	public static int[] unterteilen(int[] a){
		if (a.length > 1) { //ist die länge unseres übertragenen Arrays länger als 1 ist, passiert folgendes
			int gruppeteilen = (int)(a.length/2); // nimmt die länge unseres Arrays und teilt es in der Mitte (typecasting int für ungerade längen)
			int[] gruppe1 = new int[gruppeteilen]; // erstellung eines neuen Arrays mit der länge der davor geteilten Mitte
			
			//erstellen einer for-schleife um unser Array gruppe1 mit der ersten häflfte unseres Ausgangsarrays zu füllen
			for (int i = 0; i < gruppeteilen; ++i){ //solange i kleiner als unsere geteilte mitte (zeile 8) ist
				gruppe1[i] = a[i];					//fülle unseren neuen Array mit den werten unseres Ausgangsarrays
			}
			int[] gruppe2 = new int[a.length - gruppeteilen]; // erstellen eines zweites Arrays in der größe der restlichen länge unseres Ausgangsarrays
			for (int j = gruppeteilen; j < a.length; ++j) { // erstellen einer for-schleife um gruppe2 mit den restlichen werten unseres Ausgangsarrays zu füllen
				gruppe2[j-gruppeteilen] = a[j];	// hier gruppe2[j-gruppeteilen] da wir in gruppe2 bei index 0 anfangen müssen
			}
			gruppe1 = unterteilen(gruppe1); // gruppe1 wird wieder zum anfang der Methode unterteilen getragen und der Vorgang beginnt erneut
			gruppe2 = unterteilen(gruppe2);
			return verschmelzen(gruppe1, gruppe2);			// unsere unterteilten Arrays werden nun in die Methode verschmelzen getragen
		}
		else {
			return a;
		}
	}
	
	
	public static int[] verschmelzen(int[] gruppe1, int[] gruppe2){
		int[] gesamt = new int[gruppe1.length + gruppe2.length]; // erstellen eines Arrays mit der länge von grp1 und 2
		int temp1 = 0;
		int temp2 = 0;
		int tempergebnis = 0;
		while (temp1 < gruppe1.length && temp2 < gruppe2.length){ //prüfen: solange gruppe1 und gruppe2 nicht leer ist
			if (gruppe1[temp1] < gruppe2[temp2]) { // wenn der Index in gruppe1 kleiner als der in gruppe2 ist passiert folgendes
				gesamt[tempergebnis] = gruppe1[temp1]; // der Indexwert von gruppe1 wird in dem neuen Array gesamt gespeichert
				temp1 += 1; // temp1 wird um 1 erhöht
			}
			else { // wenn der Index in gruppe2 kleiner als der in gruppe1 ist passiert folgendes
				gesamt[tempergebnis] = gruppe2[temp2]; // der Indexwert von gruppe2 wird in dem neuen Array gesamt gespeichert
				temp2 += 1; //temp2 wird um eins erhöht
			}
			tempergebnis += 1; //tempergebnis wird um 1 erhöht
		}
		while (temp1 < gruppe1.length){
			gesamt[tempergebnis] = gruppe1[temp1];
			temp1 += 1;
			tempergebnis +=1;
		}
		while (temp2 < gruppe2.length){
			gesamt[tempergebnis] = gruppe2[temp2];
			temp2 += 1;
			tempergebnis += 1;
		}	
		return gesamt;
	}
		
		
	
	
	
	
	
	
	public static void main(String[] args) {
		//erstellen eines Arrays
		int[] zahlen = {3, 7, 5, 2, 9, 4, 1, 6, 8};
		System.out.println("Das hier ist unsere eingegebene Zahlenfolge \n"+Arrays.toString(zahlen));
		System.out.println("\nDas hier ist unsere erste unterteilte Gruppe: \n[3, 7, 5, 2]");
		System.out.println("\nDiese Unterteilung geht weiter wie folt: \n[3,7] \n[5,2] \n[3] \n[7] \n[5] \n[2]");
		System.out.println("\nDas hier ist unsere zweite unterteilte Gruppe: \n[9, 4, 1, 6, 8]");
		System.out.println("\nDiese Unterteilung geht weiter wie folt: \n[9,4] \n[1, 6, 8] \n[9] \n[4] \n[1] \n[6, 8] \n[6] \n[8]");
		
		int[] sortieren = unterteilen(zahlen); // zahlen wird in die methode unterteilen getragen
		System.out.println("\nDas hier ist unsere Zahlenfolge sortiert \n"+Arrays.toString(sortieren));
	}
}