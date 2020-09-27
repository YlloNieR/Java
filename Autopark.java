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
        
        System.out.println(kfz1.farbe+" "+kfz1.marke+" "+kfz1.ps+" "+kfz1.verbrauch+" "+kfz1.baujahr);
        System.out.println(kfz2.farbe+" "+kfz2.marke+" "+kfz2.ps+" "+kfz2.verbrauch+" "+kfz2.baujahr);
        
        
        System.out.println(kfz3.marke);
        System.out.println(kfz3.hupen());
        TimeUnit.SECONDS.sleep(2);
        System.out.println(kfz3.hupen());


    }
}
