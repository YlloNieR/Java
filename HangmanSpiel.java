import java.util.Scanner;
import java.util.Arrays;

public class HangmanSpiel {
    private static String str = "hallo";
    private static char[] LOESUNGa = str.toCharArray(); // '_','a','_','_','_'
    private static final char[] LOESUNGb = str.toCharArray(); // 'h','a','l','l','o'
    private static char[] LOESUNGtmp1 = new char[LOESUNGa.length]; // '_','a','_','_','_'
    private static char[] LOESUNGtmp2 = new char[LOESUNGa.length]; // '_','_','_','_','_'

    private static int counter = 11;

    public static void main(String[] args) {

        char[] strichcode = umwandlung();
        for (int i = 0; i < strichcode.length; i++) {
            System.out.print(strichcode[i] + " ");
        }

        System.out.println();

        while (!Arrays.equals(LOESUNGa, LOESUNGb)) {
            char[] strichcodeAbgleich = abgleichen();
            for (int i = 0; i < strichcodeAbgleich.length; i++) {
                System.out.print(strichcodeAbgleich[i] + " ");
            }
            LOESUNGtmp2 = LOESUNGa;
            System.out.println("\nSie haben noch " + counter + " Versuche!");

        }

    }

    public static char[] umwandlung() {
        char[] strichcode = LOESUNGa;

        for (int i = 0; i < strichcode.length; i++) {
            strichcode[i] = '_';
        }
        return strichcode;
    }

    public static char einlesen() {
        Scanner s = new Scanner(System.in);
        System.out.println("Geben Sie einen Buchstaben ein!");
        char eingabe = s.next().charAt(0);
        return eingabe;
    }

    public static char[] abgleichen() {
        System.out.println();
        char eingabe = einlesen();
        char[] rueckgabe = LOESUNGb;
        boolean aenderung = false;
        for (int i = 0; i < LOESUNGa.length; i++) {
            LOESUNGtmp1[i] = LOESUNGa[i];
            LOESUNGtmp2[i] = LOESUNGa[i];
        }
        for (int i = 0; i < rueckgabe.length; i++) {
            char vergleich = rueckgabe[i];
            if (eingabe == vergleich) {
                aenderung = true;
                LOESUNGa[i] = eingabe;
                LOESUNGtmp1[i] = eingabe;
            }
        }
        if (!aenderung) {
            counter--;
            hangman();
        }
        return LOESUNGa;
    }

    public static void hangman() {
        int i = counter;
        switch (i) {

            case 10:
                System.out.println("\n |\n |\n |\n |\n |\n/ \\ \n");
                break;

            case 9:
                System.out.println("\n |+----+ \n |\n |\n |\n |\n/ \\   \n");
                break;
            case 8:
                System.out.println("\n |+----+\n |     |\n |\n |\n |\n/ \\   \n");
                break;
            case 7:
                System.out.println("\n |+----+\n |/    |\n |\n |\n |\n/ \\   \n");
                break;
            case 6:
                System.out.println("\n |+----+\n |/    |\n |     O\n |\n |\n/ \\   \n");
                break;
            case 5:
                System.out.println("\n |+----+\n |/    |\n |     O\n |     |\n |\n/ \\   \n");
                break;
            case 4:
                System.out.println("\n |+----+\n |/    |\n |     O\n |     |/\n |\n/ \\   \n");
                break;
            case 3:
                System.out.println("\n |+----+\n |/    |\n |     O\n |    \\|/\n |\n/ \\   \n");
                break;
            case 2:
                System.out.println("\n |+----+\n |/    |\n |     O\n |    \\|/\n |      \\\n/ \\   \n");
                break;
            case 1:
                System.out.println("\n |+----+\n |/    |\n |     O\n |    \\|/\n |    / \\\n/ \\   \n");
                break;
            case 0:
                System.out.println("\n |+----+\n |/    \n |    O\n |    \\|/\n |    / \\\n/ \\   \n");
                System.out.println("GAME OVER");
                System.exit(0);;

        }
    }

}
