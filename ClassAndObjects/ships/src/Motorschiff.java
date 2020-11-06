public class Motorschiff extends Schiff {

    public int motorleistung;

    public Motorschiff(int tonnage, int motorleistung) {
        super(tonnage);
        this.motorleistung = motorleistung;
    }

    @Override
    public String antriebAusgeben() {
        return "Motor " + this.motorleistung;
    }

    public static void main(String[] args) {
        Motorschiff motorschiff = new Motorschiff(2,4);
        motorschiff.beladung(2);
        System.out.println(motorschiff.antriebAusgeben());
    }

}
