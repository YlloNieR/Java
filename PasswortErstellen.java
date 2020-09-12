import java.util.Random;

public class PasswortErstellen {
    public static String erstellePasswort(){
        Random r = new Random();
        int laenge = r.nextInt(10);
        String pw[] = new String[laenge];
        
        for(int i = 0; i<pw.length; i++){
            int zeichen = r.nextInt(93)+33;            
            pw[i] = String.valueOf((char)zeichen);         
        }
        
        for(int j = 0; j<pw.length; j++){
            System.out.print(pw[j]);
        }

        String pwd = pw.toString();
        return pwd;
    }

    public static String[] splitIntoarray(String input) {
        String[] arr = input.split("");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void minAchtZeichen(String[] arr) {
        int counter = 8;
        if (counter <= arr.length) {
            System.out.println("Dein Passwort besitzt die Mindestanzahl an Zeichen");
        } else {
            System.out.println(
                    "Dein Passwort besitzt nicht die Mindestanzahl an Zeichen\nEs muessen mindest 8 Zeichen sein!");   
            wiederholen(erstellePasswort());           
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
                wiederholen(erstellePasswort());             
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
            wiederholen(erstellePasswort());          
        }
    }

    public static void wiederholen(String pwd){
        while (true) {
            minAchtZeichen(splitIntoarray(pwd));
            //nurZahlenoderBuchstaben(splitIntoarray(pwd));
            //minZweiZahlenoderBuchstaben(splitIntoarray(pwd), pwd);
        }
    }

    public static void main(String[] args) {        
        String asd = erstellePasswort();
        wiederholen(asd);
    }
}
