public class AusfuellUebung {
	public static void main(String[] args){
		
		int integer1 = 2;
		
		System.out.println("In "+integer1+" steht 2 :\n"+integer1);
		
        // erstellen Sie eine Variable integer2, in der Sie den Wert 3 speichern
        int integer2 = 3;
		
		System.out.println("In \"integer2\" steht 3:\n"+integer2);
		
        // Hier mÃ¼ssen Sie eine Variable ergebnisSubtraktion einfÃ¼hren und integer1 von integer2 abziehen
        int ergebnisSubtraktion = integer2 - integer1;
		
		System.out.println("Das Ergebnis der Subtraktion ist 1:\n"+ergebnisSubtraktion);
		
        // addieren Sie integer1 und integer2 miteinander, und speichern Sie das Ergebnis in integer1
        integer1 = integer1 + integer2;		
		System.out.println("in "+ integer1 +" steht jetzt 5:\n"+integer1);
		
        //Erstellen Sie eine Variable ergebnisDivision, als Wert soll integer1 geteilt durch integer2 gespeichert werden. 
        //Achten Sie auf den Datentyp! Hier mÃ¼ssen Sie ein typ casting vornehmen.
        double ergebnisDivision = ((double) integer1) / integer2;		
        //String StringergebnisDivision = String.format("%.7f",ergebnisDivision);
        
		System.out.println("Die Division ergibt 1.66....:\n"+ergebnisDivision);
		
        // erschaffen Sie eine Variable double1, in der Sie den Wert 2.0 speichern
        double double1 = 2.0;
        String Stringdouble1 = String.format("%.0f",double1);

		System.out.println("In "+double1 +" steht 2.0:\n"+double1);
		
		// FÃ¼hren Sie eine Variable moduloDivision ein, in der Sie das Ergebnis der ganzzahligen Division von integer1 und double1 speichern.
        //Auch hier mÃ¼ssen Sie wieder auf den Datentyp achten
        double moduloDivision = integer1 % double1;
        

        String StringmoduloDivision = String.format("%.0f",moduloDivision);

		System.out.println("Bei der Modulodivision kommt heraus 1.0:\n"+moduloDivision);
        //was wird hier berechnet?
        double rechner = Math.floor(integer1/double1);
        String StringModulo = String.format("%.0f",rechner);
       


        System.out.println("hier wird folgendes berechnet \n"+integer1+" / "+Stringdouble1+" = "+StringModulo+" Rest "+StringmoduloDivision);
        
        //Erstellen Sie eine Variable string1, in der Sie "Hallo" speichern
        String string1 = "Hallo";
        
        //Erstellen Sie einen String string2, in dem Sie ein Leerzeichen speichern
        String string2 = " ";
		// Die letzte Variable string3 fÃ¼llen Sie mit Ihrem Namen
		String string3 = "Olly";
        //Sie mÃ¼ssen die drei Strings nun miteinander verketten, dass die Nachricht "Hallo *name*" erscheint.
        String HalloName = string1+string2+string3;
        System.out.println(HalloName);
		
	}
}