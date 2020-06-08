import java.lang.ProcessBuilder.Redirect.Type;

/**
 * firstSteps
 */
public class FirstSteps {

    public static void main(String[] args) {
        String a1 = "abc";                   //String Variable
        char a2 = 'c';                      //char wandelt Buchstabe in Asci Zahl um
        Integer b1 = 12;                    //Integer Variable
        int b2 = 13;
        Float c = 2.22f;                     //Float Variable
        System.out.println(a1 + "\n" + a2 + "\t" + b1 + "\t" + b2 + "\t" +c);              //print line, also print + Absatz

        String Integer = "Zahl ist Integer: 32 Bit = 32 mal 0 & 1 d.h. -2.147.483.648 => ZAHL =< 2.147.483.647";
        String Long = "Zahl ist Long: 64 Bit = 64 mal 0 & 1 d.h. -9.223.372.036.854.775.808 => ZAHL =< 9.223.372.036.854.775.807";
        String Double = "Zahl ist Double: ... mal 0 & 1 d.h. +/-4,9E-324 => ZAHL =< +/-1,7E+308";


        int zahl;
        zahl = 10;
        System.out.println("zahl ist " + zahl);    
        zahl = zahl + 5 * 3;
        System.out.println("zahl ist " + zahl);
        long zahl2;
        zahl2 = 230;

        double zahl3;
        zahl3 = 10.23828234828 / 222963696;

        char buchstabe1;
        buchstabe1 = 'b';
        char buchstabe2;
        buchstabe2 = 'b';


        if (zahl == (Integer)zahl) {
            System.out.println("\n" + zahl + "\n" + Integer);
        }
        if (zahl2 == (long)zahl2) {
            System.out.println("\n" + zahl2 + "\n" + Long);    
        }
        if (zahl3 == (double)zahl3) {
            System.out.println("\n" + zahl3 + "\n" + Double);    
        }
        if (buchstabe1 == (char)buchstabe1) {
            System.out.println("\n" + buchstabe1);    
            System.out.println("Char wandelt buchstabe in ASCII um:");    
            System.out.println(buchstabe2 + buchstabe1);    
        }
        
        
    }
}