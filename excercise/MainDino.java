public class MainDino {
    public static void main(String[] args) {
        Carnivore t_rex = new Carnivore("T-Rex", 100, 200);
        Carnivore spinosaurus = new Carnivore("Spinosaurus", 90, 100);
        Herbivore ankylosaurus = new Herbivore("Ankylosaurus", 200, 100);
        Herbivore argentinosaurus = new Herbivore("Argentinosaurus", 900, 100);

        System.out.println("\nAlle Dinos:");
        System.out.println(t_rex + "\n");           // hier steht trex.toString
        System.out.println(spinosaurus + "\n");     // hier steht spinosaurus.toString
        System.out.println(ankylosaurus.toString() + "\n");
        System.out.println(argentinosaurus.toString() + "\n");

        System.out.println("");
        t_rex.attack(t_rex, spinosaurus);
        System.out.println("");
        ankylosaurus.attack(ankylosaurus, argentinosaurus);
        System.out.println("");
        t_rex.attack(t_rex, ankylosaurus);
    }
}
