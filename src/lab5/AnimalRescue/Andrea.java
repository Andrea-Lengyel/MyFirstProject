package lab5.AnimalRescue;

public class Andrea extends Adopter {
    private String animalPreference;

    public String getAnimalPreference() {
        return animalPreference;
    }

    public void setAnimalPreference(String animalPreference) {
        this.animalPreference = animalPreference;
    }

    public void otherPets() {
        System.out.println("Cat");
    }

    public void volunteer() {
        System.out.println("Animal shelter");
    }
}
