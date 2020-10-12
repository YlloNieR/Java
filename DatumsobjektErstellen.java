import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.TimeZone;

public class DatumsobjektErstellen {

    public static void main(String[] args){
        Calendar muenchen = Calendar.getInstance();
        muenchen.setTimeZone(TimeZone.getTimeZone("Europe/Berlin"));
        Calendar newYork = Calendar.getInstance();
        newYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));

        System.out.println("aktuelle Zeit in Muenchen: "+muenchen.get(Calendar.HOUR_OF_DAY)+":"+muenchen.get(Calendar.MINUTE)+" Uhr");
        System.out.println("aktuelle Zeit in New York: "+newYork.get(Calendar.HOUR_OF_DAY)+":"+newYork.get(Calendar.MINUTE)+" Uhr");

        System.out.println("Heute ist der: "+ muenchen.get(Calendar.DATE)+"."+ muenchen.get(Calendar.MONTH)+"."+ muenchen.get(Calendar.YEAR));
        muenchen.add(Calendar.DATE, 10);
        System.out.println("In 10 Tagen ist: "+ muenchen.get(Calendar.DATE)+"."+ muenchen.get(Calendar.MONTH)+"."+ muenchen.get(Calendar.YEAR));
        muenchen.add(Calendar.DATE, -20);

        System.out.println("Vor 10 TAgen war: "+ muenchen.get(Calendar.DATE)+"."+ muenchen.get(Calendar.MONTH)+"."+ muenchen.get(Calendar.YEAR));

        String datumStr = "2020-11-12";
        LocalDate date = LocalDate.parse(datumStr);
        System.out.println("Der String "+datumStr+" ist umgewandelt "+date.getDayOfMonth()+"."+date.getMonthValue()+"."+date.getYear());

        Scanner s = new Scanner(System.in);
        System.out.println("Bitte gebe erstes Datum ein z.B. 2020-11-12:");
        String dateEins = s.nextLine();
        System.out.println("Bitte gebe zweites Datum ein:");
        String dateZwei = s.nextLine();
        LocalDate a = LocalDate.parse(dateEins);
        LocalDate b = LocalDate.parse(dateZwei);
        long diff = ChronoUnit.DAYS.between(a,b);
        System.out.println(diff);
        s.close();




    }

}
