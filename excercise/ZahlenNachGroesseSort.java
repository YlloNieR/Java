import java.util.Scanner;

public class ZahlenNachGroesseSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Geben Sie die erste Zahl ein:");
        double a = s.nextDouble();

        System.out.println("Geben Sie die zweite Zahl ein:");
        double b = s.nextDouble();

        System.out.println("Geben Sie die dritte Zahl ein:");
        double c = s.nextDouble();

        double tmp = 0;

        // 3 1 2
        if (a > c) {
            tmp = c;
            c = a;
            a = tmp;
        }

        // 1 3 2
        if (b > c) {
            tmp = c;
            c = b;
            b = tmp;
        }

        // 1 2 3
        if (a > c) {
            tmp = c;
            c = a;
            a = tmp;
        }

        System.out.println("Die groesste Zahl ist: " + c);
        System.out.println("Die groesste Zahl ist: " + a + ", " + b + ", " + c);
        double tmp2 = c;
        while (true) {
            System.out.println("Geben Sie weitere Zahlen ein:");
            double weitere = s.nextDouble();            
            if (weitere > tmp2) {                
                tmp2 = weitere;
                System.out.println("Die groesste Zahl ist nun: "+ weitere);
            }
            else{                
                System.out.println(weitere + " ist nicht groesser.");
            }
        }
    }
}