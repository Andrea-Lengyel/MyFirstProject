package lab5.AnimalRescue;

public class Dog extends Animal {

    public void sound(){
        System.out.println("woof!");
    }
    public void sleep (){
        System.out.println("zzzZZZzzz...");
    }

    private String collarColor;


    public String getCollarColor() {
        return collarColor;
    }

    public void setCollarColor(String collarColor) {
        this.collarColor = collarColor;
    }
}
