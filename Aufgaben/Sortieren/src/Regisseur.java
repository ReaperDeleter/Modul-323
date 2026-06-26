public class Regisseur {

    private String name;
    private String land;

    public Regisseur(String name, String land) {
        this.name = name;
        this.land = land;
    }

    public String getName() {
        return name;
    }

    public String getLand() {
        return land;
    }

    @Override
    public String toString() {
        return name + " (" + land + ")";
    }
}