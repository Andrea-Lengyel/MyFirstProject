package lab5.AnimalRescue;

public class Adopter {
    //String name = "Lara";
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    //float Sum = 100.6f;
    private float Sum;

    public float getSum() {
        return Sum;
    }
    public void setSum(Float X){
        Sum = X;
    }
    public void housingSituation(){
        System.out.println("Rental");
    }
    public void otherPets(){
        System.out.println("No");
    }
    public void volunteer(){
        System.out.println("No");
    }
}
