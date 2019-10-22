package lab2.AnimalRescue;

public class Dog {
//    String color = "Brown";
//    String breed = "German Shepard";
//    float weight = 33.5f;
//    float age = 2.5f;
//    char gender = 'm';
//    String name = "Rex/a";
    public void bark(){
        System.out.println("woof!");
    }
    public void run(){
        System.out.println("Running...");
    }
    public void sleep (){
        System.out.println("zzzZZZzzz...");
    }
    private String color;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    private String breed;
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    private float weight;
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    private float age;
    public float getAge() {
        return age;
    }
    public void setAge(float age) {
        this.age = age;
    }
    private char gender;
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    private String name;
    public String getName() {
        return name;
    }
}
