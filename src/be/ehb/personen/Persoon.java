package be.ehb.personen;

import java.time.LocalDate;

public class Persoon {

    private String voornaam;
    private String achternaam;
    private LocalDate geboortedatum;

    public Persoon() {
        this.voornaam = "";
        this.achternaam = "";
        this.geboortedatum = LocalDate.now();
    }

    public Persoon(String voornaam, String achternaam, LocalDate geboortedatum) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geboortedatum = geboortedatum;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    @Override
    public String toString() {
        return this.voornaam + " " + this.achternaam;
    }
}
