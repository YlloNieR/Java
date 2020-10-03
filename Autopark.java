import java.util.concurrent.TimeUnit;

public class Autopark {
    public static void main(String[] args) throws InterruptedException {
        Auto kfz1 = new Auto();
        Auto kfz2 = new Auto();
        Auto kfz3 = new Auto();

        kfz1.farbe = Farben.Rot;
        kfz1.marke = "Porsche";
        kfz1.ps = 400;
        kfz1.verbrauch = 10;
        kfz1.baujahr = 2000;
        
        System.out.println("\nKFZ1 Stats\nFarbe: "+kfz1.farbe+"\nKilometer: "+kfz1.getKilometer()+"\nMarke: "+kfz1.marke+"\nPS: "+kfz1.ps+"\nVerbrauch: "+kfz1.verbrauch+"\nPreis: "+kfz1.getPreis()+"\nBaujahr: "+kfz1.baujahr+"\nTankgroesse: "+kfz1.getTank());
        System.out.println("\nKFZ2 Stats\nFarbe: "+kfz2.farbe+"\nKilometer: "+kfz2.getKilometer()+"\nMarke: "+kfz2.marke+"\nPS: "+kfz2.ps+"\nVerbrauch: "+kfz2.verbrauch+"\nPreis: "+kfz2.getPreis()+"\nBaujahr: "+kfz2.baujahr+"\nTankgroesse: "+kfz2.getTank());
        
        
        System.out.println("\nKFZ3 Marke:\n"+kfz3.marke);
        System.out.println("\nDer "+kfz3.marke+" macht");
        TimeUnit.SECONDS.sleep(1);
        System.out.println(kfz3.hupen());        
        System.out.println("\nDer "+kfz3.marke+" macht");
        TimeUnit.SECONDS.sleep(1);
        System.out.println(kfz3.hupen());


    }
}
