public class Segelschiff extends Schiff{

    public Segelschiff(int tonnage){
        super(tonnage);
    }    
    
    public static void main(String[] args){
        Schiff segel = new Schiff(2);        
        
        segel.beladung(2);
        System.out.println(segel.antriebAusgeben());        
    }



}
