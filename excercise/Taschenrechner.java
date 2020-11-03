import java.util.Scanner;

public class Taschenrechner {

    public static double tmp = 0;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Geben Sie Zahl a ein: ");
        double zahl1 = s.nextInt();
        System.out.println("Geben Sie eine Operation ein (+,-,*,/,p,r) ");
        char operation = s.next().charAt(0);
        System.out.println("Geben Sie Zahl b ein: ");
        double zahl2 = s.nextInt();
        boolean quit = false;

        switch (operation) {
            case '+':
                System.out.println(zahl1 + " + " + zahl2 + " = " + addition(zahl1, zahl2));
                tmp = addition(zahl1, zahl2);
                break;

            case '-':
                System.out.println(zahl1 + " - " + zahl2 + " = " + subtraktion(zahl1, zahl2));
                tmp = subtraktion(zahl1, zahl2);
                break;

            case '*':
                System.out.println(zahl1 + " * " + zahl2 + " = " + multiplikation(zahl1, zahl2));
                tmp = multiplikation(zahl1, zahl2);
                break;

            case '/':
                System.out.println(zahl1 + " / " + zahl2 + " = " + division(zahl1, zahl2));
                tmp = division(zahl1, zahl2);
                break;

            case 'p':
                System.out.println(zahl1 + " hoch " + zahl2 + " = " + potenzieren(zahl1, zahl2));
                tmp = potenzieren(zahl1, zahl2);
                break;

            case 'r':
                System.out.println("Die " + (int) zahl2 + "." + " Wurzel von " + zahl1 + " = " + wurzel(zahl1, zahl2));
                tmp = wurzel(zahl1, zahl2);
                break;

            default:
                System.out.println("Die Eingabe ist kein gueltiger Operator!");
                break;
        }

        while (quit == false) {
            System.out.println("Geben Sie eine Operation ein (+,-,*,/,p,r) oder beenden Sie mit Eingabe q");
            char operation2 = s.next().charAt(0);
            if(operation2 == 'q'){
                System.out.println("Auf Wiedersehen!");
                System.exit(0);
            }
            System.out.println("Geben Sie eine weitere Zahl ein: ");
            double zahl3 = s.nextInt();           

            switch (operation2) {
                case '+':
                    System.out.println(tmp + " + " + zahl3 + " = " + addition(tmp, zahl3));
                    break;

                case '-':
                    System.out.println(tmp + " - " + zahl3 + " = " + subtraktion(tmp, zahl3));
                    break;

                case '*':
                    System.out.println(tmp + " * " + zahl3 + " = " + multiplikation(tmp, zahl3));
                    break;

                case '/':
                    System.out.println(tmp + " / " + zahl3 + " = " + division(tmp, zahl3));                    
                    break;

                case 'p':
                    System.out.println(tmp + " hoch " + zahl3 + " = " + potenzieren(tmp, zahl3));                    
                    break;

                case 'r':
                    System.out.println("Die " + (int) zahl3 + "." + " Wurzel von " + tmp + " = " + wurzel(tmp, zahl3));                    
                    break;

                case 'q':
                    System.out.println("Auf Wiedersehen!");
                    quit = true;
                    break;

                default:
                    System.out.println("Die Eingabe ist kein gueltiger Operator!");
                    break;
            }
        }
        s.close();
    }

    public static double addition(double zahl1, double zahl2) {
        double ergebnis = zahl1 + zahl2;
        tmp = ergebnis;
        return ergebnis;
    }

    public static double subtraktion(double zahl1, double zahl2) {
        double ergebnis = zahl1 - zahl2;
        tmp = ergebnis;
        return ergebnis;
    }

    public static double multiplikation(double zahl1, double zahl2) {
        double ergebnis = zahl1 * zahl2;
        tmp = ergebnis;
        return ergebnis;
    }

    public static double division(double zahl1, double zahl2) {
        double ergebnis = zahl1 / zahl2;
        tmp = ergebnis;
        return ergebnis;
    }

    public static double potenzieren(double zahl1, double zahl2) {
        double ergebnis = Math.pow(zahl1, zahl2);
        tmp = ergebnis;
        return ergebnis;
    }

    public static double wurzel(double zahl1, double zahl2) {
        double ergebnis = Math.pow(zahl1, 1.0 / zahl2);
        tmp = ergebnis;
        return ergebnis;
    }

}