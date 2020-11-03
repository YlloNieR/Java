import java.util.Scanner;

public class DreieckeBerechnenMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println(printInfoHinweis());
        int x = s.nextInt();

        if (x == 1) {
            System.out.println(Option1());
            System.out.println(printInfoEingabea());
            double a = s.nextDouble();

            System.out.println(printInfoEingabeb());
            double b = s.nextDouble();

            System.out.println(printInfoEingabec());
            double c = s.nextDouble();
            DreieckeBerechnenKlasse neuesDreieck = new DreieckeBerechnenKlasse(a, b, c, 0, 0);                      
            System.out.println(neuesDreieck.printInfo1());

        } else if (x == 2) {
            System.out.println(Option2());
            System.out.println(printInfoEingabeg());
            double g = s.nextDouble();
            System.out.println(printInfoEingabeh());
            double h = s.nextDouble();
            DreieckeBerechnenKlasse neuesDreieck = new DreieckeBerechnenKlasse(0, 0, 0, g, h);
            System.out.println(neuesDreieck.printInfo2());
        }
        else{
            System.out.println("Du hast keine gueltige Auswahl getroffen [1 oder 2]");
        }
        s.close();
    }

    public static String Option1() {
        return "\nDu hast also die Seiten a, b & c gegeben, \nfalls Seiten fehlen und es sich um ein rechtwinkliges Dreieck handelt gib 0 an.";
    }

    public static String Option2() {
        return "\nDu hast also die Seiten g & h gegeben";
    }

    public static String printInfoHinweis() {
        return "Option1 - Du hast a, b & c gegeben\nOption2 - Du hast g & h gegeben?";
    }

    public static String printInfoEingabea() {
        return "Wie lang ist die Kathete a? ";
    }

    public static String printInfoEingabeb() {
        return "Wie lang ist die Kathete b? ";
    }

    public static String printInfoEingabec() {
        return "Wie lang ist die Hypothenuse c? ";
    }

    public static String printInfoEingabeg() {
        return "Wie hoch ist die Grundseite? ";
    }

    public static String printInfoEingabeh() {
        return "Wie hoch ist das Dreieck? ";
    }

}