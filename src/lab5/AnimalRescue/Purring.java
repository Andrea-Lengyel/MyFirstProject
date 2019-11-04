package lab5.AnimalRescue;

public class Purring extends Activity {
    private int purrLevel;

    public int getPurrLevel() {
        return purrLevel;
    }

    public void setPurrLevel(int purrLevel) {
        this.purrLevel = purrLevel;
    }

    public void interaction() {
        System.out.println("With owner");
    }

    public void energyReleaseLevel() {
        System.out.println("Maximum");
    }
}
