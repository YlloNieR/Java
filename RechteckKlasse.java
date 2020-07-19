public class RechteckKlasse {
    public double h;
    public double b;
    public double A;
    public double U;

    public RechteckKlasse(double h, double b) {
        this.h = h;
        this.b = b;
        this.A = flaecheninhaltBerechnen();
        this.U = umfangBerechnen();
    }

    public String printInfo() {
        return "Das Rechteck hat eine Hoehe von " + kommastellenZweistellig(this.h) + " cm und eine Breite von "
                + kommastellenZweistellig(this.b) + " cm\nmit einer Flaeche von " + kommastellenZweistellig(this.A)
                + " cm und einem Umfang von " + kommastellenZweistellig(this.U) + " cm";
    }

    public String kommastellenZweistellig(double zahl) {
        return String.format("%.2f", zahl);
    }

    public double flaecheninhaltBerechnen() {
        return this.b * this.h;
    }

    public double umfangBerechnen() {
        return 2 * (this.b + this.h);
    }

    public double getHoehe() {
        return this.h;
    }

    public double getBreite() {
        return this.b;
    }

    public double getFlaeche() {
        return this.A;
    }

    public double getUmfang() {
        return this.U;
    }

    public void setHoehe(double h) {
        this.h = h;
        update();
    }

    public void setBreite(double b) {
        this.b = b;
        update();
    }

    public void update() {
        this.A = flaecheninhaltBerechnen();
        this.U = umfangBerechnen();
    }

}
