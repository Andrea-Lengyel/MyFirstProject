package lab5.AnimalRescue;

public class Veterinarian {
    //String name = "Tim Lukas";
    private String name;
    public String getDname(){
        return name;
    }
    public void setDname(String name){
        this.name = name;
    }
    //String specialization = "Animal welfare";
    private String spec;
    public String getSpec(){
        return spec;
    }
    public void setSpec (String spec){
        this.spec = spec;
    }

    public void emergencyAvailability(){
        System.out.println("No");
    }
    public void clinicAddress(){
        System.out.println("T. Mosoiu Street No. 12 (downtown)");
    }
}
