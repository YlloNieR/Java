public class SummeDerZahlen2 {
    public static void main(String[] args) {
        int zahl = 27;
        int[] zerlegteZahl = zerlegen(zahl);
        System.out.print(zahl + " => ");
        for (int i = 0; i<zerlegteZahl.length;i++) {
            if(i<zerlegteZahl.length-1){
                System.out.print(zerlegteZahl[i]+" + ");
            }
            else {
                System.out.print(zerlegteZahl[i]);
            }
        }
        System.out.print(" = "+summeBilden(zerlegteZahl));
    }

    public static int summeBilden(int[] array){
        int summe = 0;
        for(int i = 0; i < array.length;i++){
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
