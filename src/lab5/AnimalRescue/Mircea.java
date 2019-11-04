package lab5.AnimalRescue;

public class Mircea extends Adopter {
    private float preferredSize;
    private String preferredSpecie;

    public float getPreferredSize() {
        return preferredSize;
    }

    public void setPreferredSize(float preferredSize) {
        this.preferredSize = preferredSize;
    }

    public String getPreferredSpecie() {
        return preferredSpecie;
    }

    public void setPreferredSpecie(String preferredSpecie) {
        this.preferredSpecie = preferredSpecie;
    }

    public void housingSituation() {
        System.out.println("House owner");
    }
    public void otherPets() {
        System.out.println("Tarantula");
    }
}
