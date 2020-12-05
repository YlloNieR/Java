import java.util.Scanner;

import java.util.Random;

public class IGuessingGame2 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Random randomNumber = new Random();
        int solution = randomNumber.nextInt(11);
        
        int countTries;
        //double solution = 4;


        System.out.println("##Guessing Game##");
        System.out.println("You got 5 tries!");
        System.out.print("guess the number (range 0-10):");
        int guess = s.nextInt();        
        for(countTries = 1;countTries<6;countTries++){
            if(guess == solution){
                System.out.println("!!!Congratulation!!!");
                System.out.println("You needed "+countTries+". tries!");
                System.out.println("Your guess is right!!!");
                System.exit(0);
            }
            System.out.println(countTries+". Try");
            System.out.println("!wrong number!");
            System.out.print("guess again (range 0-10):");
            guess = s.nextInt();
        }
        System.out.println("!wrong number!");
        System.out.println("You needed "+countTries+". tries and have no try left!");


    }
}