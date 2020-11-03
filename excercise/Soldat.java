import java.util.Date;

public class Soldat {
    public Dienstgrad dienstgrad;
    public String einheit;
    public String pk;
    public String name;
    public Geschlecht geschlecht;
    public int personalnummer;
    public Date geburtsdatum;

    // Konstruktor
    public Soldat(Dienstgrad dienstgrad, String einheit, String pk, String name, Geschlecht geschlecht,
            int personalnummer, Date geburtsdatum) {
        this.dienstgrad = dienstgrad;
        this.einheit = einheit;
        this.pk = pk;
        this.name = name;
        this.geschlecht = geschlecht;
        this.personalnummer = personalnummer;
        this.geburtsdatum = geburtsdatum;
    }

    public Dienstgrad getDienstgrad() {
        return this.dienstgrad;
    }

    public String getEinheit() {
        return this.einheit;
    }

    public String getPk() {
        return this.pk;
    }

    public String getName() {
        return this.name;
    }

    public Geschlecht getGeschlecht() {
        return this.geschlecht;
    }

    public int getPersonalnummer() {
        return this.personalnummer;
    }

    public Date getGeburtsdatum() {
        return this.geburtsdatum;
    }

    public void setDienstgrad(Dienstgrad dienstgradNeu) {
        this.dienstgrad = dienstgradNeu;
    }

    public void setEinheit(String einheitNeu) {
        this.einheit = einheitNeu;
    }

    public void setPk(String pkNeu) {
        this.pk = pkNeu;
    }

    public void setName(String nameNeu) {
        this.name = nameNeu;
    }

    public void setGeschlecht(Geschlecht geschlechtNeu) {
        this.geschlecht = geschlechtNeu;
    }

    public void setPersonalnummer(int personalnummerNeu) {
        this.personalnummer = personalnummerNeu;
    }

    public void setGeburtsdatum(Date geburtsdatumNeu) {
        this.geburtsdatum = geburtsdatumNeu;
    }

    public void marschieren(Geschlecht geschlecht) {
        if (geschlecht == Geschlecht.maenlich) {
            System.out.println("Herr " + this.name + " marschiert...");
        }
        if (geschlecht == Geschlecht.weiblich) {
            System.out.println("Frau " + this.name + " marschiert...");
        }
        if (geschlecht == Geschlecht.divers) {
            System.out.println("Es " + this.name + " marschiert...");
        }
    }

    public void schiessen(Geschlecht geschlecht) {
        if (geschlecht == Geschlecht.maenlich) {
            System.out.println("Herr " + this.name + " schiesst...");
        }
        if (geschlecht == Geschlecht.weiblich) {
            System.out.println("Frau " + this.name + " schiesst...");
        }
        if (geschlecht == Geschlecht.divers) {
            System.out.println("Es " + this.name + " schiesst...");
        }
    }

    public void kommunizieren(Geschlecht geschlecht) {
        if (geschlecht == Geschlecht.maenlich) {
            System.out.println("Herr " + this.name + " kommuniziert...");
        }
        if (geschlecht == Geschlecht.weiblich) {
            System.out.println("Frau " + this.name + " kommuniziert...");
        }
        if (geschlecht == Geschlecht.divers) {
            System.out.println("Es " + this.name + " kommuniziert...");
        }
    }

    public void tarnen(Geschlecht geschlecht) {
        if (geschlecht == Geschlecht.maenlich) {
            System.out.println("Herr " + this.name + " ist da und ist wieder weg...");
        }
        if (geschlecht == Geschlecht.weiblich) {
            System.out.println("Frau " + this.name + " ist da und ist wieder weg...");
        }
        if (geschlecht == Geschlecht.divers) {
            System.out.println("Es " + this.name + " ist da und ist wieder weg...");
        }
    }

}
