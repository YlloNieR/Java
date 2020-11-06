public class ZooMain {

    public static void main(String[] args){
        Affe gorilla = new Affe(3, "Bob", "Gorilla");
        Giraffe zehnM = new Giraffe(2, "Heidi", 10);

        System.out.println("Name: "+gorilla.name);
        System.out.println("Alter: "+gorilla.alter);
        System.out.println("Rasse: "+gorilla.rasse);
        gorilla.fuettern();
        gorilla.showVorfuehren();
        System.out.println();
        System.out.println("Name: "+zehnM.name);
        System.out.println("Alter: "+zehnM.alter);
        System.out.println("Groesse: "+zehnM.groesse+"m");
        zehnM.fuettern();
        zehnM.showVorfuehren();
        System.out.println("Es vergeht ein Jahr.");
        System.out.println("Name: "+gorilla.name);
        System.out.println("Alter: "+gorilla.altern(1));
        System.out.println("Name: "+zehnM.name);
        System.out.println("Alter: "+zehnM.altern(1));
    }
}