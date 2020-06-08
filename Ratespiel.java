import java.util.Scanner;
import java.util.Random;

public class Ratespiel {
    public static void main(String[] args){        
        Random generator = new Random();
        int a = generator.nextInt(10)+1;
        System.out.println("Cheat "+ a);
        Scanner scanner = new Scanner(System.in);
        int i = 5;
        while (i > 0){
            System.out.println("Rate die Zahl \nWas denkst du?");
            int rateWert = scanner.nextInt();
            if (rateWert == a){
                System.out.println("Dein Ratewert "+rateWert+" stimmt!");                
                return;
            }
            else{
                System.out.println("Dein Ratewert "+ rateWert +" stimmt leider nicht");
                if(rateWert < a){
                    System.out.println("Die gesuchte Zahl ist groesser als "+rateWert);                
                    System.out.println("Noch "+ (i-1) +" Versuche!\n"); 
                    i--;               
                }
                else {
                    System.out.println("Die gesuchte Zahl ist kleiner als "+rateWert);                
                    System.out.println("Noch "+ (i-1) +" Versuche!\n");     
                    i--;           
                }
            }
        }        
    }
}