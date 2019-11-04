package lab5.AnimalRescue;

public class Activity {
    private String Activ;

    public String getActiv(){
        return Activ;
    }

    public void setActiv(String Name){
        Activ = Name;
    }

        public void interaction(){
            System.out.println("Other anilmals");
        }

        public void energyReleaseLevel(){
            System.out.println("None");
        }
}
