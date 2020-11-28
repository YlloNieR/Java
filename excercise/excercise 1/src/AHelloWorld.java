import java.util.Scanner;

public class AHelloWorld {

    public static void main(String[] args) {

        // 1. part of exercise
        String str = "name";
        System.out.println("Hello, World!");
        System.out.print("Hello, " + str);

        System.out.println();

        // 2. part of exercise
        Scanner input = new Scanner(System.in);
        System.out.println("Hallo, wie ist Ihr Name?");
        String name = input.next();
        System.out.println("Hallo " + name);

        int zahl1 = 5;
        System.out.println("Hier sollte 5 stehen: \n" + zahl1);

        int zahl2 = 7;
        System.out.println("Hier steht 7:\n" + zahl2);

        int zahl3 = 12;
        System.out.println("Hier steht 12:\n" + zahl3);

        int ergebnis = zahl1 - zahl2;
        System.out.println("Hier steht das Ergebnis von zahl1 - zahl2 (-2):\n" + ergebnis);

        // Schreiben Sie hier eine Kommazahl mit den Wert 1.5
        float zahl4float = 1.5f;
        double zahl4 = 1.5;
        System.out.println("Hier steht eine Kommazahl(float) 1.5:\n" + zahl4);
        System.out.println("Hier steht eine Kommazahl(zahl4) 1.5:\n" + zahl4float);
        System.out.println("Hier wird der Kommazahl der Rest abgeschnitten:\n" + (int) zahl4);
        
        char c = 'F';
        System.out.println("Hier steht ein F [in " + ((Object)c).getClass().getName() +"]\n" + c);

        String motivation = new String(" 5 lines to go ;) ");
        System.out.println("\n" + motivation + "\n");

        boolean wahrheitswert = ergebnis < zahl3;
        System.out.println("Ist das Ergebnis kleiner als zahl3?:\n" + wahrheitswert);

        System.out.println("Gut gemacht!");

        input.close();
    }
}
