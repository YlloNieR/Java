public class DreieckeBerechnenKlasse {

    double A1;
    double A2;
    double Alpha;
    double Beta;
    double Gamma;
    double a;
    double b;
    double c;
    double g;
    double h;
    double ha;
    double hb;
    double hc;
    double U;

    public DreieckeBerechnenKlasse(double a, double b, double c, double g, double h) {

        if (a == 0) {
            this.b = b;
            this.c = c;
            this.a = berechnenA();
        } else {
            this.a = a;
        }

        if (b == 0) {
            this.a = a;
            this.c = c;
            this.b = berechnenB();
        } else {
            this.b = b;
        }

        if (c == 0) {
            this.a = a;
            this.b = b;
            this.c = berechnenC();
        } else {
            this.c = c;
        }

        this.g = g;
        this.h = h;

        this.Alpha = winkelAlpha();
        this.Beta = winkelBeta();
        this.Gamma = winkelGamma();

        this.ha = berechnenHa();
        this.hb = berechnenHb();
        this.hc = berechnenHc();

        this.A1 = flaecheninhaltBerechnenMitgh();
        this.A2 = flaecheninhaltBerechnenMitabc();
        this.U = umfangDreieck();
    }

    public double berechnenA() {
        a = Math.sqrt(Math.pow(this.c, 2) - Math.pow(this.b, 2));
        return a;
    }

    public double berechnenB() {
        b = Math.sqrt(Math.pow(this.c, 2) - Math.pow(this.a, 2));
        return b;
    }

    public double berechnenC() {
        c = Math.sqrt(Math.pow(this.a, 2) + (Math.pow(this.b, 2)));
        return c;
    }

    public double berechnenHa() {
        this.ha = this.b * Math.sin(Math.toRadians(this.Gamma));
        return this.ha;
    }

    public double berechnenHb() {
        this.hb = this.c * Math.sin(Math.toRadians(this.Alpha));
        return this.hb;
    }

    public double berechnenHc() {
        this.hc = this.a * Math.sin(Math.toRadians(this.Beta));
        return this.hc;
    }

    public double flaecheninhaltBerechnenMitgh() {
        return (0.5 * this.g * this.h);
    }

    public double flaecheninhaltBerechnenMitabc() {
        return (this.c * this.hc) / 2;
    }

    public double umfangDreieck() {
        return this.a + this.b + this.c;
    }

    public double winkelAlpha() {
        return Math.toDegrees(Math.asin(this.a / this.c));
    }

    public double winkelBeta() {
        return Math.toDegrees(Math.asin(this.b / this.c));
    }

    public double winkelGamma() {
        return 180 - this.Alpha - this.Beta;
    }

    public double getA1() {
        return this.A1;
    }

    public double getA2() {
        return this.A2;
    }

    public double getAlpha() {
        return this.Alpha;
    }

    public double getBeta() {
        return this.Beta;
    }

    public double getGamma() {
        return this.Gamma;
    }

    public double geta() {
        return this.a;
    }

    public double getb() {
        return this.b;
    }

    public double getc() {
        return this.c;
    }

    public double getg() {
        return this.g;
    }

    public double geth() {
        return this.h;
    }

    public double gethc() {
        return this.hc;
    }

    public double getU() {
        return this.U;
    }

    public void seta(double a) {
        this.a = a;
        update();
    }

    public void setb(double b) {
        this.b = b;
        update();
    }

    public void setc(double c) {
        this.c = c;
        update();
    }

    public void setg(double g) {
        this.g = g;
        update();
    }

    public void seth(double h) {
        this.h = h;
        update();
    }

    public void update() {
        this.A1 = flaecheninhaltBerechnenMitgh();
        this.A2 = flaecheninhaltBerechnenMitabc();
        this.ha = berechnenHa();
        this.hb = berechnenHb();
        this.hc = berechnenHc();
        this.Alpha = winkelAlpha();
        this.U = umfangDreieck();
    }

    public String kommastellenZweistellig(double zahl) {
        return String.format("%.2f", zahl);
    }

    public String printInfo1() {
        return "Das Dreieck hat folgende Werte \n" + "Kathete a = " + kommastellenZweistellig(this.a) + " cm\n"
                + "Kathete b = " + kommastellenZweistellig(this.b) + " cm\n" + "Hypothenuse c = "
                + kommastellenZweistellig(this.c) + " cm\n" + "Hoehe a = " + kommastellenZweistellig(this.ha) + " cm\n"
                + "Hoehe b = " + kommastellenZweistellig(this.hb) + " cm\n" + "Hoehe c = "
                + kommastellenZweistellig(this.hc) + " cm\n" + "\nberechnet wurde folgendes:\n" + "Winkel Alpha = "
                + kommastellenZweistellig(this.Alpha) + " grad\n" + "Winkel Beta = "
                + kommastellenZweistellig(this.Beta) + " grad\n" + "Winkel Gamma = "
                + kommastellenZweistellig(this.Gamma) + " grad\n" + "Flaecheninhalt mit a,b & c = "
                + kommastellenZweistellig(this.A2) + " qcm\n" + "Umfang = " + kommastellenZweistellig(this.U) + " cm\n";
    }

    public String printInfo2() {
        return "Das Dreieck hat folgende Werte \n" + "Grundseite = " + kommastellenZweistellig(this.g) + " cm\n"
                + "Hoehe = " + kommastellenZweistellig(this.h) + " cm\n" + "Flaecheninhalt mit g & h = "
                + kommastellenZweistellig(this.A1) + " qcm\n";
    }
}
