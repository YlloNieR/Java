
public class KreisKlasse {
    public double r;
    public double x;
    public double y;
    public double[] m;
    public double A;
    public double U;
    private Punkt m2;

    public KreisKlasse(double r, double x, double y) {
        this.r = r;
        this.x = x;
        this.y = y;
        this.m = new double[2]; // Mittelpunkt
        this.A = flaecheninhalt();
        this.U = umfang();
        this.m2 = new Punkt(x, y);
    }

    public double[] getMittelpunkt() {
        return this.m;
    }

    public double getRadius() {
        return this.r;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setM2(double x, double y) {
        this.m2 = new Punkt(x,y);
    }

    public void setRadius(double r) {
        this.r = r;
        update();
    }

    public void setX(double x) {
        this.x = x;
        update();
    }

    public void setY(double y) {
        this.y = y;
        update();
    }

    public void update() {
        this.A = flaecheninhalt();
        this.U = umfang();
    }

    public double[] setMittelpunkt(double x, double y) {
        this.m[0] = x;
        this.m[1] = y;
        return this.m;
    }

    public double umfang() {
        return 2 * this.r * (Math.PI);
    }

    public double flaecheninhalt() {
        return Math.sqrt(this.r) * (Math.PI);
    }

    public String zweiKommastelllen(double zahl) {
        return String.format("%.2f", zahl);
    }

    public String printInfo() {
        return "Der Kreis besitzt:\n" + "Radius = " + zweiKommastelllen(this.r) + " cm\n" + "Mittelpunkt = x("
                + (int) this.x + "," + (int) this.y + ")\n" + "A = " + zweiKommastelllen(this.A) + " cm\n" + "U = "
                + zweiKommastelllen(this.U) + " cm";
    }
}