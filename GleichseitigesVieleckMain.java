public class GleichseitigesVieleckMain {
    public static void insgesamtSeiten(GleichseitigesVieleck[] arr){
            for(int i = 0; i < arr.length; i++){
                arr[0].getAnzahlSeiten();
                // Hier weiter schreiben
            }
    }

    public static void main(String[] args) {

        GleichseitigesDreieck gDreieck = new GleichseitigesDreieck();

        System.out.println(gDreieck.getAnzahlSeiten());
        System.out.println(gDreieck.getSeitenLaenge(5));

        Quadrat gQuadrat = new Quadrat();

        System.out.println(gQuadrat.getAnzahlSeiten());
        System.out.println(gQuadrat.getSeitenLaenge(6));

        GleichseitigesVieleck[] arr = {gQuadrat,gDreieck};

        
        
    }
}
