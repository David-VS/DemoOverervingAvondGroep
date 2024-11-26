package be.ehb.personen.oefeningen;

public class Hond extends Huisdier{

    private int stamboekNR;

    public Hond(double gewicht,
                int leeftijd,
                String naam,
                int stamboekNR) {
        super(gewicht, leeftijd, naam);
        this.stamboekNR = stamboekNR;
    }

    public int getStamboekNR() {
        return stamboekNR;
    }

    public void setStamboekNR(int stamboekNR) {
        this.stamboekNR = stamboekNR;
    }

    @Override
    public String toString() {
        return "Hond{" + super.toString() +
                " stamboekNR=" + stamboekNR +
                '}';
    }
}
