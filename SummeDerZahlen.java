import java.util.Scanner;

public class SummeDerZahlen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Aus welchen Zahlen moechtest du die Quwersumme bilden?");
        int zahl = s.nextInt();
        System.out.println("\nWaehle\nOption1 Modulo Verfahren \nOption2 Char Verfahren");
        int auswahl = s.nextInt();

        if (auswahl == 1) {
            int[] zerlegteZahl = zerlegen(zahl);
            System.out.print(zahl + " => ");
            for (int i = 0; i < zerlegteZahl.length; i++) {
                if (i < zerlegteZahl.length - 1) {
                    System.out.print(zerlegteZahl[i] + " + ");
                } else {
                    System.out.print(zerlegteZahl[i]);
                }
            }
            System.out.print(" = " + summeBilden(zerlegteZahl));
        } else {
            String temp = Integer.toString(zahl);
            int[] arrList = new int[temp.length()];

            for (int i = 0; i < temp.length(); i++) {
                arrList[i] = temp.charAt(i) - '0';
            }

            int quersumme = 0;
            int i = 0;

            while (i < temp.length()) {
                quersumme += arrList[i];
                i++;
                if (i == temp.length()) {
                    System.out.println("Quersumme = "+quersumme);

                }
            }

        }

    }

    public static int summeBilden(int[] array) {
        int summe = 0;
        for (int i = 0; i < array.length; i++) {
            summe += array[i];
        }
        return summe;
    }

    public static int[] zerlegen(int zahl) {
        int[] array = new int[5];
        int i = 0;
        while (zahl / 10 != 0) {
            array[i] = zahl % 10;
            i++;
            zahl /= 10;
        }
        array[i] = zahl % 10;
        return array;
    }
}