package lab5.AnimalRescue;

public class Zsigmond_Z extends Veterinarian {
    private boolean clinicalExam;

    public boolean isClinicalExam() {
        return clinicalExam;
    }

    public void setClinicalExam(boolean clinicalExam) {
        this.clinicalExam = clinicalExam;
    }
    private int doctorRating;

    public int getDoctorRating() {
        return doctorRating;
    }

    public void setDoctorRating(int doctorRating) {
        this.doctorRating = doctorRating;
    }
    private String animalSpecialisation;

    public String getAnimalSpecialisation() {
        return animalSpecialisation;
    }

    public void setAnimalSpecialisation(String animalSpecialisation) {
        this.animalSpecialisation = animalSpecialisation;
    }

    public void emergencyAvailability() {
        System.out.println("Yes");
    }
}
