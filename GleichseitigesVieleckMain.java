public class GleichseitigesVieleckMain {
    public static void insgesamtSeiten(GleichseitigesVieleck[] arr) {
        int summeQuadrat = 0;
        int summeDreieck = 0;

        for (int i = 0; i < arr[0].getAnzahlSeiten(); i++) {
            summeQuadrat = summeQuadrat + arr[0].getSeitenLaenge(5);
        }
        System.out.println("Summe Qudrat "+summeQuadrat);
        for (int i = 0; i < arr[1].getAnzahlSeiten(); i++) {
            summeDreieck = summeDreieck + arr[1].getSeitenLaenge(6);
        }
        System.out.println("Summe Dreieck "+summeDreieck);
    }

    public static int getUmfang(int seitenanzahl, int seitenlaenge) {
        return seitenanzahl * seitenlaenge;
    }

    public static double getInnenWinkel(int seitenanzahl) {
        return ((seitenanzahl-2)*(Math.PI/seitenanzahl));
    }

    public static void main(String[] args) {
        /*
        GleichseitigesDreieck gDreieck = new GleichseitigesDreieck();

        System.out.println(gDreieck.getAnzahlSeiten());
        System.out.println(gDreieck.getSeitenLaenge(5));

        Quadrat gQuadrat = new Quadrat();

        System.out.println(gQuadrat.getAnzahlSeiten());
        System.out.println(gQuadrat.getSeitenLaenge(6));

        GleichseitigesVieleck[] arr = { gQuadrat, gDreieck };
        insgesamtSeiten(arr);

        // 1.6
        Quadrat gQuadrat2 = new Quadrat();
        GleichseitigesDreieck gDreieck2 = new GleichseitigesDreieck();

        System.out.println("Quadrat 2:" + "\nSeitenanzahl: " + gQuadrat2.getAnzahlSeiten() + "\nSeitenlaenge: " + gQuadrat2.getSeitenLaenge(3) + "\nUmfang: " + getUmfang(gQuadrat2.getAnzahlSeiten(), gQuadrat2.getSeitenLaenge(3))+ "\nInnenwinkel: " + getInnenWinkel(gQuadrat2.getAnzahlSeiten()));
        System.out.println("Dreieck 2:" + "\nSeitenanzahl: " + gDreieck2.getAnzahlSeiten() + "\nSeitenlaenge: " + gDreieck2.getSeitenLaenge(3) + "\nUmfang: " + getUmfang(gDreieck2.getAnzahlSeiten(), gDreieck2.getSeitenLaenge(5))+ "\nInnenwinkel: " + getInnenWinkel(gDreieck2.getAnzahlSeiten()));
        */

        // 1.7 fehlt noch
        Quadrat gQuadrat3 = new Quadrat(5);
        GleichseitigesDreieck gDreieck3 = new GleichseitigesDreieck(4);

        System.out.println("Quadrat 3:" + "\nSeitenanzahl: " + gQuadrat3.getAnzahlSeiten() + "\nSeitenlaenge: " + gQuadrat3.getSeitenLaenge(5) + "\nUmfang: " + getUmfang(gQuadrat3.getAnzahlSeiten(), gQuadrat3.getSeitenLaenge(5))+ "\nInnenwinkel: " + getInnenWinkel(gQuadrat3.getAnzahlSeiten()));
        System.out.println("Dreieck 3:" + "\nSeitenanzahl: " + gDreieck3.getAnzahlSeiten() + "\nSeitenlaenge: " + gDreieck3.getSeitenLaenge(4) + "\nUmfang: " + getUmfang(gDreieck3.getAnzahlSeiten(), gDreieck3.getSeitenLaenge(4))+ "\nInnenwinkel: " + getInnenWinkel(gDreieck3.getAnzahlSeiten()));
    }
}
