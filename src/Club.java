package src;

public class Club extends Topic {
    private String auxMaterial;

    public Club() {}

    public Club(String auxMaterial) {
        this.auxMaterial = auxMaterial;
    }

    public Club(String auxMaterial, String name, String schedule) {
        super(name, schedule);
        this.auxMaterial = auxMaterial;
    }

    public String getAuxMaterial() {
        return auxMaterial;
    }

    public void setAuxMaterial(String auxMaterial) {
        this.auxMaterial = auxMaterial;
    }
}
