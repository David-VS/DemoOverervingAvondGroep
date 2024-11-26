package be.ehb.personen;

import java.time.LocalDate;

public class Student extends Persoon implements KanVakVolgen, KanExamenAfleggen{

    private String specialisatie;

    public Student(String voornaam, String achternaam, LocalDate geboortedatum, String specialisatie){
        super(voornaam, achternaam, geboortedatum);
        this.specialisatie = specialisatie;
    }

    @Override
    public String toString() {
        return super.toString() + " studeert " + this.specialisatie;
    }

    @Override
    public void legExamenAf() {
        System.out.println("stress, hopelijk slagen");
    }

    @Override
    public boolean kanVolgen(String Vak) {
        if(Vak.equals("Programming"))
            return true;
        else
            return false;
    }
}
