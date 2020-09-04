public class StringBackward{
    public static void main(String[] args){
        String input = "Das ist eine Eingabe"; 
        System.out.println("folgendes Wort wird rueckwaerts ausgegeben:");
        System.out.println(input);
        System.out.println();
        System.out.println("rueckwaerts:");
        System.out.println(makeBackward(wortZerlegen(input)));
    }

    public static char[] wortZerlegen(String wort){
        char[] zerlegtesWort = wort.toCharArray();
        //System.out.println(wort);
        return zerlegtesWort;
    }

    public static char[] makeBackward(char[] buchstaben){
        //char[] tmpreverse = new char[buchstaben.length];        
        int i = 0;
        int laenge = buchstaben.length;
        char[] tmp = new char[laenge];
        do {
            tmp[i] = buchstaben[laenge - i - 1];
            i++;
        } while (i < buchstaben.length);
        //System.out.println(tmp);
        return tmp;
    }
}