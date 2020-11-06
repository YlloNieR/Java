public class Giraffe extends Tier {

    public int groesse;

    @Override
    public void showVorfuehren() {
        System.out.println(this.name + " springt auf der Nase");
    };

    public Giraffe(int alter, String name, int groesse) {
        super(alter, name);
        this.groesse = groesse;

    }

}
