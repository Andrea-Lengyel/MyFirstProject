package lab2.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
//        Dog Rex = new Dog();
//
//        System.out.println(Rex.name);
//        Rex.bark();

        Animal Dog = new Animal ();
            Dog.name = "Rex";
            Dog.color = "Brown";
            Dog.breed = "Jack Russel";
            Dog.weight = 8.5f;
            Dog.age = 1.5f;
            Dog.gender = 'm';
            Dog.healthLevel = 10;
            Dog.hungerSensationLevel = 7;
            Dog.stateOfMind = 10;
            Dog.FavouriteFood = "Scooby Snack";
            Dog.FavouriteActivity = "Fetching";

            System.out.println(Dog.name);
            System.out.println(Dog.color);
            System.out.println(Dog.breed);
            System.out.println(Dog.weight);
            System.out.println(Dog.age);
            System.out.println(Dog.gender);
            System.out.println(Dog.healthLevel);
            System.out.println(Dog.hungerSensationLevel);
            System.out.println(Dog.stateOfMind);
            System.out.println(Dog.FavouriteFood);
            System.out.println(Dog.FavouriteActivity);


        Animal Cat = new Animal ();
            Cat.color = "Grey";
            Cat.weight = 4.5f;
            Cat.age = 18.5f;
            Cat.healthLevel = 4;
            Cat.hungerSensationLevel = 10;
            Cat.stateOfMind = 5;

            System.out.println(Cat.color);
            System.out.println(Cat.weight);
            System.out.println(Cat.age);
            System.out.println(Cat.healthLevel);
            System.out.println(Cat.hungerSensationLevel);
            System.out.println(Cat.stateOfMind);


        Animal Mouse = new Animal ();
            Mouse.name = "Jerry";
            Mouse.color = "White";
            Mouse.breed = "White domestic";
            Mouse.weight = 0.25f;
            Mouse.age = 1.2f;
            Mouse.healthLevel = 10;
            Mouse.hungerSensationLevel = 10;
            Mouse.stateOfMind = 9;
            Mouse.FavouriteFood = "Cheese";
            Mouse.FavouriteActivity = "Running in wheel";

            System.out.println(Mouse.name);
            System.out.println(Mouse.color);
            System.out.println(Mouse.breed);
            System.out.println(Mouse.weight);
            System.out.println(Mouse.age);
            System.out.println(Mouse.healthLevel);
            System.out.println(Mouse.hungerSensationLevel);
            System.out.println(Mouse.stateOfMind);
            System.out.println(Mouse.FavouriteFood);
            System.out.println(Mouse.FavouriteActivity);

        Adopter Adopt1 = new Adopter ();
            Adopt1.name = "Gary";

        System.out.println(Adopt1.name);

        Adopter Adopt2 = new Adopter ();
            Adopt2.Sum = 435.5f;
        System.out.println(Adopt2.Sum);

        Adopter Adopt3 = new Adopter ();
            Adopt3.name = "Tina";
            Adopt3.Sum = 445.5f;
        System.out.println(Adopt3.name);
        System.out.println(Adopt3.Sum);

        Food Food1 = new Food ();
            Food1.name = "Scooby Snack";
            Food1.price = 4.8f;
            Food1.quantity = 7.7f;

        System.out.println(Food1.name);
        System.out.println(Food1.price);
        System.out.println(Food1.quantity);

        Food Food2 = new Food ();
            Food2.quantity = 10.7f;

        System.out.println(Food2.quantity);

        Food Food3 = new Food ();
            Food3.name = "Cheese";
            Food3.price = 1.45f;
            Food3.quantity = 2.7f;

        System.out.println(Food3.name);
        System.out.println(Food3.price);
        System.out.println(Food3.quantity);

        Activity Activity1 = new Activity ();

        Activity Activity2 = new Activity ();
            Activity2.name = "Meow";

        System.out.println(Activity2.name);

        Activity Activity3 = new Activity ();
            Activity3.name = "Run";

        System.out.println(Activity3.name);

        Veterinarian Vet1 = new Veterinarian();

        Veterinarian Vet2 = new Veterinarian();
            Vet2.name = "Clara Mason";
            Vet2.specialization = "Veterinary immunology";

        System.out.println(Vet2.name);
        System.out.println(Vet2.specialization);

        Veterinarian Vet3 = new Veterinarian();
            Vet3.name = "Sarah Jones";
            Vet2.specialization = "Clinical pathology";

        System.out.println(Vet3.name);
        System.out.println(Vet3.specialization);

    }
}
