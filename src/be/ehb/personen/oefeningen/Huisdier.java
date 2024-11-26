package be.ehb.personen.oefeningen;

public class Huisdier {

    private double gewicht;
    private int leeftijd;
    private String naam;

    public Huisdier(double gewicht,
                    int leeftijd,
                    String naam) {
        this.gewicht = gewicht;
        this.leeftijd = leeftijd;
        this.naam = naam;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Huisdier{" +
                "gewicht=" + gewicht +
                ", leeftijd=" + leeftijd +
                ", naam='" + naam + '\'' +
                '}';
    }
}
