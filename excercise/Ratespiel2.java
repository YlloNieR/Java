import java.util.Scanner;
import java.util.Random;

public class Ratespiel2{
	
	public static void main(String[] args){
		//int rateZahl = 7;
		
		Random randomNumber = new Random();
		//int rateZahl = randomNumber.nextInt(6)+5; // 5...10
		int rateZahl = randomNumber.nextInt(11)+1; // 1...10		
		System.out.println("Ratespiel  \n");
		System.out.println("Die gesuchte Zahl liegt zwischen 1 und 10?\n");
		System.out.println("Cheat = "+rateZahl);
		Scanner input = new Scanner(System.in);		
		
		
		int i = 0;
		while(i < 5){
			int eingabe = input.nextInt();
			if(rateZahl == eingabe){
				System.out.println("Deine Zahl "+eingabe+" ist richtig \n GLUECKWUNSCH!\n");
				i++;
				System.out.println("Du hast "+i+" von 5 Versuchen benoetigt!");
				input.close();
				System.exit(0);
			}	
			else {	
				System.out.println("Ihre Zahl "+eingabe+" ist leider falsch \nVersuchen Sie es nochmal!\n");			
				if(i == 4){
					System.out.println("Du hast alle 5 Versuche verbraucht.");
					input.close();
					System.exit(0);
				}
				else if(eingabe<rateZahl){
					System.out.println("Ihre Zahl "+eingabe+" ist kleiner als die gesuchte Zahl\n");
					i++;
					System.out.println("Du hast noch "+(5-i)+" von 5 Versuchen");
				}
				else{
					System.out.println("Ihre Zahl "+eingabe+" ist groesser als die gesuchte Zahl\n");			
					i++;
					System.out.println("Du hast noch "+(5-i)+" von 5 Versuchen");
				}
			}
		}
		
	}
}