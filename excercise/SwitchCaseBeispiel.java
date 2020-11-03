import java.util.Scanner;

public class SwitchCaseBeispiel {
    public static void main(String[] args) {
        String montag = "Montag";
        String dienstag = "Dienstag";
        String mittwoch = "Mittwoch";
        String donnerstag = "Donnerstag";
        String freitag = "Freitag";
        String samstag = "Samstag";
        String sonntag = "Sonntag";

        Scanner s = new Scanner(System.in);
        System.out.println("Geben Sie eine Nummer < 8 & > 0 ein!");
        int i = s.nextInt();

        switch (i) {

            case 1:
                System.out.println(montag);
                break;

            case 2:
                System.out.println(dienstag);
                break;

            case 3:
                System.out.println(mittwoch);
                break;

            case 4:
                System.out.println(donnerstag);
                break;

            case 5:
                System.out.println(freitag);
                break;

            case 6:
                System.out.println(samstag);
                break;

            case 7:
                System.out.println(sonntag);
                break;
            
            default:
                System.out.println("Die eingegebene Zahl ist nicht < 8 & > 0!!!");
                break;
        }
        s.close();
    }
}