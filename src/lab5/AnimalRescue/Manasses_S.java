package lab5.AnimalRescue;

public class Manasses_S extends Veterinarian {
    private String animalcategory;

    public String getAnimalcategory() {
        return animalcategory;
    }

    public void setAnimalcategory(String animalcategory) {
        this.animalcategory = animalcategory;
    }

    public void emergencyAvailability() {
        System.out.println("Yes");
    }

    public void clinicAddress() {
        System.out.println("Donath Street No. 7");
    }
}
