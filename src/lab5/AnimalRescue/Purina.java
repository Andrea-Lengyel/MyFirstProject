package lab5.AnimalRescue;

public class Purina extends Food {
    private int necessityFood;

    public int getNecessityFood() {
        return necessityFood;
    }

    public void setNecessityFood(int necessityFood) {
        this.necessityFood = necessityFood;
    }

    public void meatType() {
        System.out.println("Beef");
    }
    public void vitContent() {
        System.out.println("Vitamin D and Omega 6");
    }
}
