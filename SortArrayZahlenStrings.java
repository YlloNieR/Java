public class SortArrayZahlenStrings {

    public static int char2ascii(char buchstabe){    
        return Character.codePointAt(new char[] {buchstabe},0);
    }



    public static void main(String[] args) {

        int[] zahlen = { 9, 8, 7, 6, 4, 3, 5, 1 };
        char[] stringsZeichen = { 'a', 'f', 'r', 't', 'z', 'u', 'i', 'o' };

        int tmp = 0;        

        // Zahlen
        System.out.println("input:");
        for (int j = 0; j < zahlen.length; j++) {
            if (j != zahlen.length - 1) {
                System.out.print(zahlen[j] + ", ");
            } else {
                System.out.print(zahlen[j]);
            }
        }

        // Methode
        for (int k = 0; k < zahlen.length - 1; k++) {
            for (int i = 0; i < zahlen.length - 1; i++) {
                if (zahlen[i] > zahlen[i + 1]) {
                    tmp = zahlen[i];
                    zahlen[i] = zahlen[i + 1];
                    zahlen[i + 1] = tmp;
                }
            }
        }

        System.out.println("\noutput:");

        for (int j = 0; j < zahlen.length; j++) {
            if (j != zahlen.length - 1) {
                System.out.print(zahlen[j] + ", ");
            } else {
                System.out.print(zahlen[j]);
            }
        }

        // Strings
        System.out.println("\ninput:");
        for (int j = 0; j < stringsZeichen.length; j++) {
            if (j != stringsZeichen.length - 1) {
                System.out.print(stringsZeichen[j] + ", ");
            } else {
                System.out.print(stringsZeichen[j]);
            }
        }

        System.out.println("\ninput2:");
        for (int j = 0; j < stringsZeichen.length; j++) {
            if (j != stringsZeichen.length - 1) {
                System.out.print(char2ascii(stringsZeichen[j])+", ");
            } else {
                System.out.print(char2ascii(stringsZeichen[j]));
            }
        }

        // Methode
        for (int k = 0; k < stringsZeichen.length - 1; k++) {
            for (int i = 0; i < stringsZeichen.length - 1; i++) {
                if (char2ascii(stringsZeichen[i]) > char2ascii(stringsZeichen[i + 1])) {
                    tmp = char2ascii(stringsZeichen[i]);
                    stringsZeichen[i] = stringsZeichen[i + 1];
                    stringsZeichen[i + 1] = (char)tmp;
                }
            }
        }

        System.out.println("\noutput:");

        for (int j = 0; j < stringsZeichen.length; j++) {
            if (j != stringsZeichen.length - 1) {
                System.out.print(stringsZeichen[j] + ", ");
            } else {
                System.out.print(stringsZeichen[j]);
            }
        }
    
    }

}
