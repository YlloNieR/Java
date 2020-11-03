public class BerechneDurchschnittArray {
    public static void main(String[] args) {
        int[] zahlen = { 9, 8, 7, 6, 4, 3, 5, 1 };

        int tmp = 0;
        double durchschnitt = 0;
        int max = 0;
        int min = 0;

        // Zahlen
        System.out.println("input:");
        for (int j = 0; j < zahlen.length; j++) {
            if (j != zahlen.length - 1) {
                System.out.print(zahlen[j] + ", ");
            } else {
                System.out.print(zahlen[j]);
            }
        }

        // Methode sorten
        for (int k = 0; k < zahlen.length - 1; k++) {
            for (int i = 0; i < zahlen.length - 1; i++) {
                if (zahlen[i] > zahlen[i + 1]) {
                    tmp = zahlen[i];
                    zahlen[i] = zahlen[i + 1];
                    zahlen[i + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < zahlen.length; i++) {
            if(i > 1 & i < zahlen.length-1){
                tmp = tmp + zahlen[i];
                durchschnitt++;
            }            
        }
        min = zahlen[0];
        max = zahlen[zahlen.length-1];
        durchschnitt = tmp/durchschnitt;
        System.out.println("\noutput:\n"+durchschnitt);
        System.out.println("\nmin:"+min);
        System.out.println("\nmin:"+max);
    }

}
