import java.util.Scanner;
import java.util.Random;

public class Ratespiel1{
	
	public static void main(String[] args){
		//int rateZahl = 7;
		
		Random randomNumber = new Random();
		//int rateZahl = randomNumber.nextInt(6)+5; // 5...10
		int rateZahl = randomNumber.nextInt(11)+1; // 1...10		
		System.out.println("Ratespiel  \n");
		System.out.println("Die gesuchte Zahl liegt zwischen 1 und 10?\n");
		System.out.println("Cheat = "+rateZahl);
		Scanner input = new Scanner(System.in);		
		
		for(int i = 4;i >= 0;i--){
			int eingabe = input.nextInt();
			if(rateZahl == eingabe){
				System.out.println("Deine Zahl "+eingabe+" ist richtig \n GLUECKWUNSCH!\n");				
				System.out.println("Du hast "+i+" von 5 Versuchen benoetigt!");
				input.close();
				System.exit(0);
			}	
			else {	
				System.out.println("Deine Zahl "+eingabe+" ist leider falsch \nVersuchen Sie es nochmal!\n");			
				if(i == 0){
					System.out.println("Sei haben keine Versuche mehr!");					
					input.close();
					System.exit(0);
				}
				else if(eingabe<rateZahl){
					System.out.println("Deine Zahl "+eingabe+" ist kleiner als die gesuchte Zahl\n");					
					System.out.println("Du hast noch "+i+" von 5 Versuchen");					

				}
				else{
					System.out.println("Deine Zahl "+eingabe+" ist groesser als die gesuchte Zahl\n");					
					System.out.println("Du hast noch "+i+" von 5 Versuchen");
				}
			}
		}
		
	}
}