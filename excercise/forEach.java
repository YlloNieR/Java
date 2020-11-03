/*for each – Schleifen sind nützliche Kontrollstrukturen, die über jedes Element 
einer Liste (Set, Map, etc...) iterieren*/

public class forEach {
    public static void main(String[] args) {
        int[] zahlen = { 6, 5, 4, 3, 2, 1 };

        System.out.println("For output");
        // bisherige Möglichkeit:
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }

        System.out.println("For each output");
        // foreach:
        for (int zahl : zahlen) { // für jede Zahl von den Zahlen
            System.out.println(zahl);
        }

        System.out.println("For each output");
        // foreach:
        char[] buchstaben = { 'a', 'b', 'c' };
        int i = 0;
        int laenge = buchstaben.length;
        do {
            System.out.println(buchstaben[laenge - i - 1]);
            i++;
        } while (i < buchstaben.length);

    }
}