import java.util.Scanner;

public class ProgrammBMI {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Geben Sie ihr Gewicht in Kg ein:");
        int gewicht = s.nextInt();

        System.out.println("Geben Sie ihr Groesse in m ein:");
        double groesse = s.nextDouble();

        double bmi = gewicht / Math.pow(groesse, 2);

        System.out.println("Der BMI ist " + bmi);
        s.close();

    }
}