public class Dinosaurier {
    protected String name;
    protected int lebenspunkte;
    protected final int staerke; // final Wert ist nicht mehr veränderbar

    public Dinosaurier(String name, int lebenspunkte, int staerke) {
        this.name = name;
        this.lebenspunkte = lebenspunkte;
        this.staerke = staerke;
    }

    public String toString() {
        return "Name: " + this.name + "\nLebenspunkte: " + this.lebenspunkte + "\nStaerke: " + this.staerke + "\n"
                + this.getClass();      
    }

    public void getLebenspunkte() {
        System.out.println("Lebenspunkte: " + this.lebenspunkte);
    }

    public void getStaerke() {
        System.out.println("Staerke: " + this.staerke);
    }   

    public void isAlive() {
        if (this.lebenspunkte > 0) {
            System.out.println("Er hat den Angriff ueberlebt!");
        } else {
            System.out.println("R.I.P. Dino");
        }
    }

    public void attack(Carnivore angreifer, Herbivore verteidiger) {
        System.out.println("Der Dinosaurier " + angreifer.name);
        System.out.println("ist ein Fleischfresser & greift den Pflanzenfresser Dinosaurier " + verteidiger.name
                + " an. Aus diesem Kampf wird leider nichts.");

        verteidiger.lebenspunkte = verteidiger.lebenspunkte - angreifer.staerke;
        System.out.println("Nach dem Angriff hat der Dinosaurier " + verteidiger.name + " nur noch "
                + verteidiger.lebenspunkte + " Lebenspunkte");
    }

}