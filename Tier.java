public class Tier{
    public int alter;
    public String name;

    public Tier(int alter, String name){
        this.alter = alter;
        this.name = name;
    }

    public void fuettern(){
        System.out.println(this.name+" freut sich ueber das Leckerli");
    }

    public int altern(int alter){
        alter = this.alter + alter;
        return alter;
    }

    public void showVorfuehren(){
        System.out.println(this.name+" springt auf einem Bein");
    }
}
