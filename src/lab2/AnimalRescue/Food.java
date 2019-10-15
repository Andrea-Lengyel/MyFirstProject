package lab2.AnimalRescue;

public class Food {
    //String name = "Applaws";
    private String Fname;
    public String getFname(){
        return Fname;
    }
    public void setFname (String Name){
        Fname = Name;
    }
    //float price = 3.7f;
    private float Price;
    public float getPrice(){
        return Price;
    }
    public void setPrice(float price) {
        Price = price;
    }
    //float quantity = 0.5f;
    private float Quantity;
    public float getQuantity(){
        return Quantity;
    }
    public void setQuantity(float quantity) {
        Quantity = quantity;
    }
    //boolean Availability = true;
    private boolean Availability;
    public boolean getAvailability(){
        return Availability;
    }
    public void setAvailability(boolean availability){
   Availability = availability;
    }
}
