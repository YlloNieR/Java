public class Bank {
    public static void main(String[] args){
        Bankkonto konto1 = new Bankkonto(101,"Susi");
        Bankkonto konto2 = new Bankkonto(501,"Hans",0.75);
        Bankkonto konto3 = new Bankkonto();
        konto1.kontoauszug();
        konto2.kontoauszug();
        konto3.kontoauszug();
        konto1.setInhaber("Stefan");
        System.out.println(konto1.getInhaber());
        konto1.einzahlen(200);
        System.out.println(konto1.getGuthaben());
        System.out.println("Guthaben + Zinssatz = "+konto1.zinsen(4.5));
    }
}
