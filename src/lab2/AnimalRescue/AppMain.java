package lab2.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
//        Dog Rex = new Dog();
//
//        System.out.println(Rex.name);
//        Rex.bark();

        Animal Dog = new Animal ();
            //Dog.name = "Rex";
            Dog.setName("Rex");
            //Dog.color = "Brown";
            Dog.setColor("White");
            //Dog.breed = "Jack Russel";
            Dog.setBreed("Terrier");
            //Dog.weight = 8.5f;
            Dog.setWeight(8.6f);
            //Dog.age = 1.5f;
            Dog.setAge(1.6f);
            //Dog.gender = 'm';
            Dog.setGender('m');
            //Dog.healthLevel = 10;
            Dog.setHealthLevel(9);
            //Dog.hungerSensationLevel = 7;
            Dog.setHungerSensationLevel(8);
            //Dog.stateOfMind = 10;
            Dog.setStateOfMind(10);
            //Dog.FavouriteFood = "Scooby Snack";
            Dog.setFavouriteFood("Doggie Snack");
            //Dog.FavouriteActivity = "Fetching";
            Dog.setFavouriteActivity("Fetch");

            //System.out.println(Dog.name);
        System.out.println(Dog.getName());
            //System.out.println(Dog.color);
        System.out.println(Dog.getColor());
            //System.out.println(Dog.breed);
        System.out.println(Dog.getBreed());
            //System.out.println(Dog.weight);
        System.out.println(Dog.getWeight());
            //System.out.println(Dog.age);
        System.out.println(Dog.getAge());
            //System.out.println(Dog.gender);
        System.out.println(Dog.getGender());
            //System.out.println(Dog.healthLevel);
        System.out.println(Dog.getHealthLevel());
            //System.out.println(Dog.hungerSensationLevel);
        System.out.println(Dog.getHungerSensationLevel());
            //System.out.println(Dog.stateOfMind);
        System.out.println(Dog.getStateOfMind());
            //System.out.println(Dog.FavouriteFood);
        System.out.println(Dog.getFavouriteFood());
            //System.out.println(Dog.FavouriteActivity);
        System.out.println(Dog.getFavouriteActivity());


        Animal Cat = new Animal ();
            Cat.setName("Pufy");
            //Cat.color = "Grey";
            Cat.setColor("Cappucino");
            Cat.setBreed("Birmanese");
            //Cat.weight = 4.5f;
            Cat.setWeight(3.9f);
            //Cat.age = 18.5f;
            Cat.setAge(18.7f);
            Cat.setGender('f');
            //Cat.healthLevel = 4;
            Cat.setHealthLevel(5);
            //Cat.hungerSensationLevel = 10;
            Cat.setHungerSensationLevel(9);
            //Cat.stateOfMind = 5;
            Cat.setStateOfMind(6);
            Cat.setFavouriteFood("Gourmet");
            Cat.setFavouriteActivity("Sleep");

        System.out.println(Cat.getName());
            //System.out.println(Cat.color);
        System.out.println(Cat.getColor());
        System.out.println(Cat.getBreed());
            //System.out.println(Cat.weight);
        System.out.println(Cat.getWeight());
            //System.out.println(Cat.age);
        System.out.println(Cat.getAge());
        System.out.println(Cat.getGender());
            //System.out.println(Cat.healthLevel);
        System.out.println(Cat.getHealthLevel());
            //System.out.println(Cat.hungerSensationLevel);
        System.out.println(Cat.getHungerSensationLevel());
            //System.out.println(Cat.stateOfMind);
        System.out.println(Cat.getStateOfMind());
        System.out.println(Cat.getFavouriteFood());
        System.out.println(Cat.getFavouriteActivity());

        Adopter Adopt1 = new Adopter ();
            //Adopt1.name = "Gary";
        Adopt1.setName("Mara");
        Adopt1.setSum(100.6f);

        System.out.println(Adopt1.getName());
        System.out.println(Adopt1.getSum());

        Adopter Adopt2 = new Adopter ();
        Adopt2.setName("Michael");

            //Adopt2.Sum = 435.5f;
        Adopt2.setSum(120.5f);
        System.out.println(Adopt2.getName());
        //System.out.println(Adopt2.Sum);
        System.out.println(Adopt2.getSum());

        Adopter Adopt3 = new Adopter ();
            //Adopt3.name = "Tina";
        Adopt3.setName("Minnie");
            //Adopt3.Sum = 445.5f;
        Adopt3.setSum(230.7f);
        //System.out.println(Adopt3.name);
        System.out.println(Adopt3.getName());
        //System.out.println(Adopt3.Sum);
        System.out.println(Adopt3.getSum());

        Food Food1 = new Food ();
            //Food1.name = "Scooby Snack";
        Food1.setFname("Doggie Snack");
            //Food1.price = 4.8f;
        Food1.setPrice(4.5f);
            //Food1.quantity = 7.7f;
        Food1.setQuantity(7.9f);
        Food1.setAvailability(true);

        //System.out.println(Food1.name);
        System.out.println(Food1.getFname());
        //System.out.println(Food1.price);
        System.out.println(Food1.getPrice());
        //System.out.println(Food1.quantity);
        System.out.println(Food1.getQuantity());
        System.out.println(Food1.getAvailability());

        Food Food2 = new Food ();
        Food2.setFname("Applaws");
        Food2.setPrice(3.4f);
            //Food2.quantity = 10.7f;
        Food2.setQuantity(3.3f);
        Food2.setAvailability(true);

        System.out.println(Food2.getFname());
        System.out.println(Food2.getPrice());
        //System.out.println(Food2.quantity);
        System.out.println(Food2.getQuantity());
        System.out.println(Food2.getAvailability());


        Activity Activity1 = new Activity ();
        Activity1.setActiv("Fetch");
        System.out.println(Activity1.getActiv());

        Activity Activity2 = new Activity ();
//            Activity2.name = "Meow";
        Activity2.setActiv("Meow");
        System.out.println(Activity2.getActiv());

        Activity Activity3 = new Activity ();
            //Activity3.name = "Run";
        Activity3.setActiv("Run");

        System.out.println(Activity3.getActiv());

        Veterinarian Vet1 = new Veterinarian();
        Vet1.setDname("Zsigmond Z");
        Vet1.setSpec("General veterinarian");

        System.out.println(Vet1.getDname());
        System.out.println(Vet1.getSpec());

        Veterinarian Vet2 = new Veterinarian();
            //Vet2.name = "Clara Mason";
        Vet2.setDname("Manasses S");
            //Vet2.specialization = "Veterinary immunology";
        Vet2.setSpec("Immunology");

        //System.out.println(Vet2.name);
        System.out.println(Vet2.getDname());
       //System.out.println(Vet2.specialization);
        System.out.println(Vet2.getSpec());


    }
}
