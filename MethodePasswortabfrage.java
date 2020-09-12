import java.util.Scanner;

public class MethodePasswortabfrage {

    public static Scanner s = new Scanner(System.in);

    public static String[] splitIntoarray(String input) {
        String[] arr = input.split("");
        /*for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/
        return arr;
    }

    public static void minAchtZeichen(String[] arr) {
        int counter = 8;
        if (counter <= arr.length) {
            System.out.println("Dein Passwort besitzt die Mindestanzahl an Zeichen");
        } else {
            System.out.println(
                    "Dein Passwort besitzt nicht die Mindestanzahl an Zeichen\nEs muessen mindest 8 Zeichen sein!");   
            wiederholen();           
        }
    }

    public static void nurZahlenoderBuchstaben(String[] arr) {
        for (int j = 0; j < arr.length; j++) {
            // A - Z a - z 0 - 9
            if (((int) arr[j].charAt(0) > 64 && (int) arr[j].charAt(0) < 91)
                    || ((int) arr[j].charAt(0) > 96 && (int) arr[j].charAt(0) < 123)
                    || ((int) arr[j].charAt(0) > 47 && (int) arr[j].charAt(0) < 58)) {
            } else {
                System.out.println("Dein Passwort enthaelt unzulaessige Zeichen!");  
                wiederholen();             
            }
        }
        System.out.println("Dein Passwort besteht nur aus Zahlen und Buchstaben");
    }

    public static void minZweiZahlenoderBuchstaben(String[] arr, String pw) {
        int countNum = 0;

        for (int k = 0; k < arr.length; k++) {
            if ((int) arr[k].charAt(0) > 47 && (int) arr[k].charAt(0) < 58) {
                countNum++;
            }
        }

        if (countNum > 2) {
            System.out.println("Dein Pw enthaelt alle Kriterien die es enthalen muss");
            System.out.println("Dein Passwort: " + pw);
            System.exit(0);
        } else {
            System.out.println("Dein Pw enthaelt zu wenig Zahlen!");  
            wiederholen();          
        }
    }

    public static void wiederholen(){
        while (true) {
            System.out.println("\nGeben Sie ein Passwort ein: ");
            String input = s.next();
            minAchtZeichen(splitIntoarray(input));
            nurZahlenoderBuchstaben(splitIntoarray(input));
            minZweiZahlenoderBuchstaben(splitIntoarray(input), input);
        }
    }

    public static void main(String[] args) {
        

        
        
        wiederholen();
                
    }
}
