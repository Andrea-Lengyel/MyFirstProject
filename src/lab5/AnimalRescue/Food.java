package lab5.AnimalRescue;

public class Food {
    //String name = "Applaws";
    private String name;
    public String getFname(){
        return name;
    }
    public void setFname (String Name){
        this.name = name;
    }
    //float price = 3.7f;
    private float price;
    public float getPrice(){
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    //float quantity = 0.5f;
    private float quantity;
    public float getQuantity(){
        return quantity;
    }
    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }
    //boolean Availability = true;
    private boolean availability;
    public boolean getAvailability(){
        return availability;
    }
    public void setAvailability(boolean availability){
        this.availability = availability;
    }

    public void meatType(){
        System.out.println("Poultry");
    }
    public void vitContent (){
        System.out.println("Vitamin A");
    }
    public void specificIngredient(){
        System.out.println("Ash");
    }

}
