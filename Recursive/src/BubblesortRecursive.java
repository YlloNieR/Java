public class BubblesortRecursive {
    public static int[] array = {0, 5, 1, 4, 2, 4, 3, 8};

    public static void main(String[] args) {
        //iterativ:
        System.out.print("iterativ: ");
        int[] array2 = {0, 5, 1, 4, 2, 4, 3, 8};
        for (int i = array2.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array2[j] > array2[j + 1]) {
                    int tmp = array2[j];
                    array2[j] = array2[j + 1];
                    array2[j + 1] = tmp;
                }
            }
        }
        for (int i : array2) {
            System.out.print(i + " ");
        }
        System.out.print("\nrekursiv: ");
        //rekursiv:
        bubbleSort(array.length);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int iteration) {
        //rekursive Methode:
        if (iteration <= 0) {
            return;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
            }
        }
        bubbleSort(iteration - 1);
    }
}
