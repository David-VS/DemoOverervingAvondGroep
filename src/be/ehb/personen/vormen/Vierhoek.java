package be.ehb.personen.vormen;

public class Vierhoek extends Vorm{

    private int breedte, hoogte;

    public Vierhoek(int breedte, int hoogte) {
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    @Override
    public double berekenOppervlakte() {
        return breedte * hoogte;
    }
}
