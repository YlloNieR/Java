public class ArrayFindeSpezifischerWert {
    public static void main(String[] args) {
        int[] zahlen = { 9, 8, 7, 6, 4, 3, 5, 1 };

        int suche = 3;
        boolean wahr = false;
        int stelle = 0;

        // Zahlen
        System.out.println("input:");
        for (int j = 0; j < zahlen.length; j++) {
            if (j != zahlen.length - 1) {
                System.out.print(zahlen[j] + ", ");
            } else {
                System.out.print(zahlen[j]);
            }
        }

        for (int i = 0; i < zahlen.length - 1; i++) {
            if (suche == zahlen[i]) {
                stelle = i;
                wahr = true;
            }
        }

        if (wahr == true) {
            System.out.print("\nDie Zahl " + suche + " ist vorhanden, an der Stelle " + stelle);
        } else {
            System.out.print("\nDie Zahl " + suche + " ist nicht vorhanden!");
        }

    }
}
