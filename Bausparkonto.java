public class Bausparkonto {
    public static void main(String[] args){
        
        double Verzinsung = 3.5;
        int ZeitMTL = 5*12;
        int BetragMTL = 300;
        double Geld;
        
        int i = 0;
        while(i<ZeitMTL){
            if (i % 12 == 0){
                Geld = ((BetragMTL *i)/100)*(100+Verzinsung);
                String StringGeld = String.format("%.2f",Geld);
                System.out.println("Im "+i+". Monat ist es = "+StringGeld+" EURO mit Zins");
                i++;
            }
            else{
                Geld = (BetragMTL *i);
                String StringGeld = String.format("%.2f",Geld);
                System.out.println("Im "+i+". Monat ist es = "+StringGeld+" EURO");
                i++;
            }
        }
    }    
}