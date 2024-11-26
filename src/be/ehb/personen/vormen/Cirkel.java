package be.ehb.personen.vormen;

public class Cirkel extends Vorm{

    private int straal;

    public Cirkel(int straal) {
        this.straal = straal;
    }


    @Override
    public double berekenOppervlakte() {
        return Math.PI * this.straal * this.straal;
    }
}
