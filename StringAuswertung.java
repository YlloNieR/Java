public class StringAuswertung {
    public static void main(String[] args) {
        String input = "Es gibt 10 Arten von Menschen, die Einen verstehen Binär, die Anderen nicht";
        System.out.println(input);
        auswerten(wortZerlegen(input), input);
        
    }

    public static char[] wortZerlegen(String wort) {
        char[] zerlegtesWort = wort.toCharArray();
        return zerlegtesWort;
    }

    public static void auswerten(char[] buchstaben, String input){
        int i = 0;
        int j = 0;
        int anzahlSonderzeichen = 0;
        int anzahlLeerzeichen = 0;
        int anzahlZiffern = 0;
        int anzahlBuchstaben = 0;
        int laenge = buchstaben.length;
        do {
            j = input.codePointAt(i);            
            if (j >= 0 && j <= 31 || j >= 33 && j <= 47 || j >= 58 && j <= 64 || j >= 123 && j <= 126){
                anzahlSonderzeichen++;
            }
            if (j >= 48 && j <= 57){
                anzahlZiffern++;                
            }
            if (j >= 65 && j <= 90 || j >= 97 && j <= 122 ){
                anzahlBuchstaben++;            
            }
            if (j == 32 ){
                anzahlLeerzeichen++;            
            }
            i++;
        } while (i < laenge);
        System.out.println("Sonderzeichen: "+anzahlSonderzeichen);
        System.out.println("Leerzeichen: "+anzahlLeerzeichen);
        System.out.println("Ziffern: "+anzahlZiffern);      
        System.out.println("Buchstaben: "+anzahlBuchstaben);       
    }
    
}