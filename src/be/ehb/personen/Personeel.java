package be.ehb.personen;

import java.time.LocalDate;

public class Personeel extends Persoon{

    private int badgeNR;

    public Personeel(String voornaam, String achternaam, LocalDate geboortedatum, int badgeNR) {
        super(voornaam, achternaam, geboortedatum);
        this.badgeNR = badgeNR;
    }
}
