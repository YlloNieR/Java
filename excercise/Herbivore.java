public class Herbivore extends Dinosaurier {

    public Herbivore(String name, int lebenspunkte, int staerke) {
        super(name, lebenspunkte, staerke);
    }

    public void attack(Herbivore angreifer, Herbivore verteidiger) {
        if (angreifer.staerke == verteidiger.staerke) {
            System.out.println("Da der Dinosaurier " + angreifer.name + " & der Dinosaurier " + verteidiger.name
                    + " gleich stark sind. Fuehrt der Kampf zu keiner Verletzung!");
        }
        if (angreifer.staerke > verteidiger.staerke) {
            System.out.println("Der Dinosaurier " + angreifer.name + "mit einer Staerke von " + angreifer.staerke
                    + "greift den Dinosaurier " + verteidiger.name + "an, welcher ein Leben von "
                    + verteidiger.lebenspunkte + " besitzt.");

            verteidiger.lebenspunkte = verteidiger.lebenspunkte - 1;
            System.out.println("Nach dem Angriff hat der Dinosaurier " + verteidiger.name + " nur noch "
                    + verteidiger.lebenspunkte + " Lebenspunkte");
            if (verteidiger.lebenspunkte <= 0) {
                angreifer.lebenspunkte = verteidiger.staerke + angreifer.lebenspunkte;
                System.out.println("Da der Dinosaurier " + verteidiger.name
                        + " gestorben ist, erhaelt der Gewinner seine Staerke.\nDer Dinosaurier " + angreifer.name
                        + " hat nun " + angreifer.lebenspunkte + " Lebenspunkte.");
            }
        }
        if (verteidiger.staerke > angreifer.staerke) {
            System.out.println("Der Dinosaurier " + verteidiger.name + "mit einer Staerke von " + verteidiger.staerke
                    + "greift den Dinosaurier " + angreifer.name + "an, welcher ein Leben von " + angreifer.lebenspunkte
                    + " besitzt.");

            angreifer.lebenspunkte = angreifer.lebenspunkte - 1;
            System.out.println("Nach dem Angriff hat der Dinosaurier " + angreifer.name + " nur noch "
                    + angreifer.lebenspunkte + " Lebenspunkte");
            if (angreifer.lebenspunkte <= 0) {
                verteidiger.lebenspunkte = angreifer.staerke + verteidiger.lebenspunkte;
                System.out.println("Da der Dinosaurier " + angreifer.name
                        + " gestorben ist, erhaelt der Gewinner seine Staerke.\nDer Dinosaurier " + verteidiger.name
                        + " hat nun " + verteidiger.lebenspunkte + " Lebenspunkte.");
            }
        }

    };
}