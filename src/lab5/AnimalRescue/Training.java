package lab5.AnimalRescue;

public class Training extends Activity {
    private int trainingLevel;

    public int getTrainingLevel() {
        return trainingLevel;
    }

    public void setTrainingLevel(int trainingLevel) {
        this.trainingLevel = trainingLevel;
    }

    public void energyReleaseLevel() {
        System.out.println("Maximum");
    }

    public void interaction() {
        System.out.println("With trainer and other animals");
    }
}
