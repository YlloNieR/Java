import java.util.Scanner;
import java.util.Random;

public class HGuessingGame{
        
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Random randomNumber = new Random();
        int solution = randomNumber.nextInt(11);
        
        int countTries = 1;
        //double solution = 4;


        System.out.println("##Guessing Game##");
        System.out.print("guess the number (range 0-10):");
        int guess = s.nextInt();        
        while(guess != solution){
            System.out.println(countTries+". Try");
            System.out.println("!wrong number!");
            countTries++;
            System.out.print("guess again (range 0-10):");
            guess = s.nextInt();
        }
        System.out.println("!!!Congratulation!!!");
        System.out.println("You needed "+countTries+". tries!");
        System.out.println("Your guess is right!!!");


    }
}