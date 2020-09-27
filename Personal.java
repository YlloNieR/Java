public class Personal extends Mensch {
    public String name;
    public int alter;
    public Dienstgrad dienstgrad;    
    
    public Personal(String name,int alter, Dienstgrad dienstgrad){
        super(name,alter);
        this.dienstgrad = dienstgrad;        
    }

    @Override
    public void haareSchneiden(){
        System.out.println("kurz,kuerzer,ganzweg");
    }
}
