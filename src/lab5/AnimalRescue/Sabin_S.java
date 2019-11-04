package lab5.AnimalRescue;

public class Sabin_S extends Veterinarian {
    private int vaccinationPrice;

    public int getVaccinationPrice() {
        return vaccinationPrice;
    }

    public void setVaccinationPrice(int vaccinationPrice) {
        this.vaccinationPrice = vaccinationPrice;
    }

    public void clinicAddress() {
        System.out.println("Borhanci Street No. 55");
    }
}
