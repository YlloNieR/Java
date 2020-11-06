public class Mergesort {

    // erstelle ein Array mit den Werten 3,7,5,2,9,4,1,6,8
    public static int[] intArr = { 3, 7, 5, 2, 9, 4, 1, 6, 8 };

    public int[] sort(int l, int r) {

        if (l < r) {
            int q = (l + r) / 2;

            sort(l, q);
            sort(q + 1, r);
            merge(l, q, r);
        }
        return intArr;
    }

    private void merge(int l, int q, int r) {
        int[] arr = new int[intArr.length];
        int i, j;
        for (i = l; i <= q; i++) {
            arr[i] = intArr[i];
        }
        for (j = q + 1; j <= r; j++) {
            arr[r + q + 1 - j] = intArr[j];
        }
        i = l;
        j = r;
        for (int k = l; k <= r; k++) {
            if (arr[i] <= arr[j]) {
                intArr[k] = arr[i];
                i++;
            } else {
                intArr[k] = arr[j];
                j--;
            }
        }
    }

    public static void main(String[] args) {
        // Beginn Einleitung
        System.out.print("\nMerge Sort\n");
        System.out.print("Ausgangswerte:\n");
        for (int i = 0; i < intArr.length; i++) {
            if (i < intArr.length - 1) {
                System.out.print(intArr[i] + ", ");
            } else {
                System.out.print(intArr[i] + "\n");
            }
        }
        System.out.print("\nSortierte Werte:\n");
        // Ende Einleitung

        // Beginn Methodenaufrufe
        Mergesort ms = new Mergesort();

        // in Klasse Mergsort nehme Methode sort
        // mit folgenden Argumenten 0 und Arraylänge (9-1)
        int[] arr = ms.sort(0, intArr.length - 1);

        // Ausgabe der Arrayliste mit For Schleife
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i] + "\n");
            }
        }
        // Ende Methodenaufrufe
    }
}