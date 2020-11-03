import java.util.Scanner;

public class ErmitteleSchaltjahr {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Geben Sie eine Jahreszahl ein:");
        int jahr = s.nextInt();

        if (jahr % 4 == 0) {
            System.out.println("durch 4 teilbar");
            if (jahr % 100 == 0) {
                System.out.println("durch 100 teilbar");
                if (jahr % 400 == 0) {
                    System.out.println("durch 400 teilbar");
                    System.out.println(jahr + " ist ein Schaltjahr!");
                } else {
                    System.out.println(jahr + " ist kein Schaltjahr!");
                }
            } else {
                System.out.println(jahr + " ist kein Schaltjahr!");
            }
        } else {
            System.out.println(jahr + " ist kein Schaltjahr!");
        }

        s.close();
    }
}