import java.util.Date;
import java.util.Scanner;

public class SoldatMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("neuer Soldat - 1\nAusgabe - 2");
        int option = s.nextInt();
        if (option == 1) {
            System.out.println("Geben Sie den Dienstgrad ein:");
            Dienstgrad dienstgrad = Dienstgrad.values()[s.nextInt()];

            System.out.println("Geben Sie die Einheit ein:");
            String einheit = s.next();

            System.out.println("Geben Sie die PK ein:");
            String pk = s.next();

            System.out.println("Geben Sie den Namen ein:");
            String name = s.next();

            System.out.println("Geben Sie das Geschlecht ein:");
            Geschlecht geschlecht = Geschlecht.values()[s.nextInt()];

            System.out.println("Geben Sie die Personalnummer ein:");
            int personalnummer = s.nextInt();

            System.out.println("Geben Geburtsjahr ein:");
            int year = s.nextInt();
            System.out.println("Geben Geburtsmonat ein:");
            int month = s.nextInt();
            System.out.println("Geben Geburtstag ein:");
            int day = s.nextInt();
            Date geburtsdatum = new Date(year, month, day);

            Soldat neuerSoldat = new Soldat(dienstgrad, einheit, pk, name, geschlecht, personalnummer, geburtsdatum);

            System.out.println("\n" + neuerSoldat.getDienstgrad());
            System.out.println("Einheit: " + neuerSoldat.getEinheit());
            System.out.println("Pk: " + neuerSoldat.getPk());
            System.out.println("Name: " + neuerSoldat.getName());
            System.out.println("Geschlecht: " + neuerSoldat.getGeschlecht());
            System.out.println("Personalnummer: " + neuerSoldat.getPersonalnummer());
            System.out.println("Geburtsdatum: " + neuerSoldat.getGeburtsdatum().getDate());
        } else {
            Dienstgrad dienstgrad = Dienstgrad.values()[8];
            String einheit = "PzGr3 2.Kp";
            String pk = "06234887 D 2322341";
            String name = "Mustermann";
            Geschlecht geschlecht = Geschlecht.values()[2];
            int personalnummer = 11295356;
            int day = 3;
            int month = 3;
            int year = 1937;
            Date geburtsdatum = new Date(year, month, day);

            Soldat neuerSoldat2 = new Soldat(dienstgrad, einheit, pk, name, geschlecht, personalnummer, geburtsdatum);

            System.out.println("\n" + neuerSoldat2.getDienstgrad());
            System.out.println("Einheit: " + neuerSoldat2.getEinheit());
            System.out.println("Pk: " + neuerSoldat2.getPk());
            System.out.println("Name: " + neuerSoldat2.getName());
            System.out.println("Geschlecht: " + neuerSoldat2.getGeschlecht());
            System.out.println("Personalnummer: " + neuerSoldat2.getPersonalnummer());
            System.out.println("Geburtsdatum: " + neuerSoldat2.getGeburtsdatum().getDate() + "."
                    + neuerSoldat2.getGeburtsdatum().getMonth() + "." + neuerSoldat2.getGeburtsdatum().getYear());

            System.out.println("Was macht der Soldat?");
            neuerSoldat2.marschieren(geschlecht);
            neuerSoldat2.kommunizieren(geschlecht);
            neuerSoldat2.schiessen(geschlecht);
            neuerSoldat2.tarnen(geschlecht);

        }

        s.close();

    }
}
