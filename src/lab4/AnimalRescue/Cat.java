package lab4.AnimalRescue;

public class Cat extends Animal{
    private boolean purr;

    public void sound(){
        System.out.println("Meow");
    }

    public boolean isPurr() {
        return purr;
    }

    public void setPurr(boolean purr) {
        this.purr = purr;
    }
}
