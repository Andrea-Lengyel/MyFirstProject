package lab5.AnimalRescue;

public class Alexander extends Adopter {
    private String preferredGender;
    private int agePreference;

    public String getPreferredGender() {
        return preferredGender;
    }

    public void setPreferredGender(String preferredGender) {
        this.preferredGender = preferredGender;
    }

    public int getAgePreference() {
        return agePreference;
    }

    public void setAgePreference(int agePreference) {
        this.agePreference = agePreference;
    }

    public void otherPets() {
        System.out.println("Turtle");
    }
    public void volunteer() {
        System.out.println("Animal Clinic technician");
    }
}
