public class BubbleSortWhile {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int[] liste = { 3, 5, 7, 1, 4 };
        int n = liste.length;

        while (i < n - 1) {
            while (j < n - 1) {
                if (liste[j] > liste[j + 1]) {
                    int tmp = liste[j];
                    liste[j] = liste[j + 1];
                    liste[j + 1] = tmp;
                }
                j++;
            }
            j = 0;
            i++;
        }
        for (int z = 0; z < n; z++)
            System.out.println(liste[z]);
    }
}
