package lab5.AnimalRescue;

public class Lizard extends Animal {
    private float size;

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }
    private boolean nightVision;

    public boolean isNightVision() {
        return nightVision;
    }

    public void setNightVision(boolean nightVision) {
        this.nightVision = nightVision;
    }

    public void sound(){
        System.out.println("shhh");
    }
}
