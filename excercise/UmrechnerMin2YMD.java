import java.util.Scanner;

public class UmrechnerMin2YMD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Geben Sie die Minuten ein:");
        double min = s.nextDouble();

        double ausgabeS = min * 60;
        double ausgabeH = min / 60;
        double ausgabeD = ausgabeH / 24;
        double ausgabeM = ausgabeD / 30;
        double ausgabeY = ausgabeM / 12;

        System.out.println(" sind ");
        System.out.println(ausgabeS + " Sekunden");        
        System.out.println(ausgabeH + " Stunden");
        System.out.println(ausgabeD + " Tage");
        System.out.println(ausgabeM + " Monate");
        System.out.println(ausgabeY + " Jahre");       
        s.close();
    }
}