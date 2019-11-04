package lab5.AnimalRescue;

public class Nuevo extends Food {
    private float meatPercent;


    public float getMeatPercent() {
        return meatPercent;
    }

    public void setMeatPercent(float meatPercent) {
        this.meatPercent = meatPercent;
    }
    private String preferredFood;

    public String getPreferredFood() {
        return preferredFood;
    }

    public void setPreferredFood(String preferredFood) {
        this.preferredFood = preferredFood;
    }

    public void meatType() {
        System.out.println("Fish");
    }

    public void vitContent() {
        System.out.println("Omega 3");
    }
}
