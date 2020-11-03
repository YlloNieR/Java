import java.util.Scanner;

public class Bubblesort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Gib die erste Zahl ein: ");
        int ersteZahl = input.nextInt();
        System.out.print("Gib die zweite Zahl ein: ");
        int zweiteZahl = input.nextInt();
        System.out.print("Gib die dritte Zahl ein: ");
        int dritteZahl = input.nextInt();

        int[] zahlenArray = new int[3];
        zahlenArray[0]  = ersteZahl;
        zahlenArray[1]  = zweiteZahl;
        zahlenArray[2]  = dritteZahl;

        /*int[] zahlenArray = {7,2,1,3,5};*/

        System.out.println("unsortiert: ");

        for (int i = 0;i<zahlenArray.length;i++) {
            System.out.print(zahlenArray[i] + " ");
        }

        System.out.println("\nsortiert: ");

        int[] ergebnisArray = sort(zahlenArray);
        for (int i = 0;i<ergebnisArray.length;i++){
            System.out.print(ergebnisArray[i]+" ");
        }
        input.close();
    }

    public static int[] sort(int[] array){
        for(int i = array.length-1;i>0;i--) {
            for (int j = 0; j < i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        return array;
    }
}