public class Schiff {
    protected int tonnage; 
    protected int beladung;

    public Schiff(int tonnage){
        this.tonnage = tonnage;       
    }
    
    
    public void beladung(int ladung){
        int beladungNeu = ladung+beladung;
        System.out.println("Die Ladung betraegt: "+beladungNeu);
    }
    
    

    public String antriebAusgeben(){
        return "Segel";
    }
}