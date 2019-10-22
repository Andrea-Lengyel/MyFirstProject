package lab4.AnimalRescue;

public class Dog extends Animal {

    public void bark(){
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
