import java.util.Scanner;

public class RekursivFakultaet {

    public int n;
    public int ergebnis = 1;

    public int fakultaet(int n) {
        if (n == 0) {
            return ergebnis;
        } else {
            ergebnis = ergebnis * n;
            return ( fakultaet(n - 1));
        }

    }    

    public static void main(String[] args) {
        /* Fakultaet: n */
        /* n! = n*(n-1)*(n-2)*(n-3)*...*1 */
        /* 5! = 5*4*3*2*1 = 120 */
        /* 4! = 4*3*2*1 = 24 */

        RekursivFakultaet rf = new RekursivFakultaet();        

        Scanner s = new Scanner(System.in);
        int integer = s.nextInt();

        System.out.println(rf.fakultaet(integer));
        
        s.close();
    }
}
