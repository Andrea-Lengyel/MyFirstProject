package lab4.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {


            Dog Rex = new Dog ();
            Rex.setName("Rex");
            Rex.setColor("White");
            Rex.setBreed("Terrier");
            Rex.setWeight(8.6f);
            Rex.setAge(1.6f);
            Rex.setGender('m');
            Rex.setHealthLevel(9);
            Rex.setHungerSensationLevel(8);
            Rex.setStateOfMind(10);
            Rex.setFavouriteFood("Dog Snack");
            Rex.setFavouriteActivity("Fetch");

        System.out.println(Rex.getName());
        System.out.println(Rex.getColor());
        System.out.println(Rex.getBreed());
        System.out.println(Rex.getWeight());
        System.out.println(Rex.getAge());
        System.out.println(Rex.getGender());
        System.out.println(Rex.getHealthLevel());
        System.out.println(Rex.getHungerSensationLevel());
        System.out.println(Rex.getStateOfMind());
        System.out.println(Rex.getFavouriteFood());
        System.out.println(Rex.getFavouriteActivity());
        Rex.bark();
        Rex.setCollarColor("red");
        System.out.println(Rex.getCollarColor());


            Cat Pufy = new Cat ();
            Pufy.setName("Pufy");
            Pufy.setColor("Cappucino");
            Pufy.setBreed("Birmanese");
            Pufy.setWeight(3.9f);
            Pufy.setAge(18.7f);
            Pufy.setGender('f');
            Pufy.setHealthLevel(5);
            Pufy.setHungerSensationLevel(9);
            Pufy.setStateOfMind(6);
            Pufy.setFavouriteFood("Gourmet");
            Pufy.setFavouriteActivity("Sleep");

        System.out.println(Pufy.getName());
        System.out.println(Pufy.getColor());
        System.out.println(Pufy.getBreed());
        System.out.println(Pufy.getWeight());
        System.out.println(Pufy.getAge());
        System.out.println(Pufy.getGender());
        System.out.println(Pufy.getHealthLevel());
        System.out.println(Pufy.getHungerSensationLevel());
        System.out.println(Pufy.getStateOfMind());
        System.out.println(Pufy.getFavouriteFood());
        System.out.println(Pufy.getFavouriteActivity());
        Pufy.sound();
        Pufy.setPurr(true);

        Lizard Doby = new Lizard ();
        Doby.setName("Doby");
        Doby.setColor("Green");
        Doby.setBreed("Gecko");
        Doby.setWeight(0.2f);
        Doby.setAge(1.1f);
        Doby.setGender('f');
        Pufy.setHealthLevel(10);
        Pufy.setHungerSensationLevel(9);
        Pufy.setStateOfMind(10);
        Pufy.setFavouriteFood("Cricket");
        Pufy.setFavouriteActivity("Crawl");

        System.out.println(Doby.getName());
        System.out.println(Doby.getColor());
        System.out.println(Doby.getBreed());;
        System.out.println(Doby.getWeight());
        System.out.println(Doby.getAge());
        System.out.println(Doby.getGender());
        System.out.println(Doby.getHealthLevel());
        System.out.println(Doby.getHungerSensationLevel());
        System.out.println(Doby.getStateOfMind());
        System.out.println(Doby.getFavouriteFood());
        System.out.println(Doby.getFavouriteActivity());
        Doby.setSize(1.6f);
        System.out.println(Doby.getSize());
        Doby.setNightVision(true);

        Andrea Adopt1 = new Andrea ();
        Adopt1.setName("Andrea");
        Adopt1.setSum(100.6f);
        Adopt1.setAnimalPreference("cat");

        System.out.println(Adopt1.getName());
        System.out.println(Adopt1.getSum());
        System.out.println(Adopt1.getAnimalPreference());

        Mircea Adopt2 = new Mircea ();
        Adopt2.setName("Mircea");
        Adopt2.setSum(120.5f);
        Adopt2.setPreferredSpecie("Gecko Dragon");
        Adopt2.setPreferredSize(60.5f);

        System.out.println(Adopt2.getName());
        System.out.println(Adopt2.getSum());
        System.out.println(Adopt2.getPreferredSpecie());
        System.out.println(Adopt2.getPreferredSize());

        Alexander Adopt3 = new Alexander ();
        Adopt3.setName("Alexander");
        Adopt3.setSum(230.7f);
        Adopt3.setPreferredAnimal("dog");
        Adopt3.setAgePreference(1);
        System.out.println(Adopt3.getName());
        System.out.println(Adopt3.getSum());
        System.out.println(Adopt3.getPreferredAnimal());
        System.out.println(Adopt3.getAgePreference());

        Purina Food1 = new Purina ();
        Food1.setFname("Purina Dog");
        Food1.setPrice(4.5f);
        Food1.setQuantity(7.9f);
        Food1.setAvailability(true);
        Food1.setNecessityFood(7);

        System.out.println(Food1.getFname());
        System.out.println(Food1.getPrice());
        System.out.println(Food1.getQuantity());
        System.out.println(Food1.getAvailability());
        System.out.println(Food1.getNecessityFood());

        Nuevo Food2 = new Nuevo ();
        Food2.setFname("Nuevo Kitten");
        Food2.setPrice(3.4f);
        Food2.setQuantity(3.3f);
        Food2.setAvailability(true);
        Food2.setMeatPercent(85.5f);
        Food2.setPreferredFood("Applaws");

        System.out.println(Food2.getFname());
        System.out.println(Food2.getPrice());
        System.out.println(Food2.getQuantity());
        System.out.println(Food2.getAvailability());
        System.out.println(Food2.getMeatPercent());
        System.out.println(Food2.getPreferredFood());

        OmnivoreMix Food3 = new OmnivoreMix ();
        Food3.setFname("Lizard Food");
        Food3.setPrice(1.6f);
        Food3.setQuantity(2.2f);
        Food3.setAvailability(true);
        Food3.setContent("Vegetable Mix");

        System.out.println(Food3.getFname());
        System.out.println(Food3.getPrice());
        System.out.println(Food3.getQuantity());
        System.out.println(Food3.getAvailability());
        System.out.println(Food3.getContent());

        Training Activity1 = new Training ();
        Activity1.setTrainingLevel(7);
        Activity1.setActiv("Training");
        System.out.println(Activity1.getActiv() + ' ' + Activity1.getTrainingLevel());

        Purring Activity2 = new Purring ();
        Activity2.setPurrLevel(10);
        Activity2.setActiv("Purr");
        System.out.println(Activity2.getActiv() + ' ' + Activity2.getPurrLevel());

        Crawl Activity3 = new Crawl ();
        Activity3.setCrawlSpeed(1.1f);
        Activity3.setActiv("Crawl");
        System.out.println(Activity3.getActiv() + ' ' + Activity3.getCrawlSpeed());

        Zsigmond_Z Vet1 = new Zsigmond_Z();
        Vet1.setDname("Zsigmond Zoltan");
        Vet1.setSpec("General veterinarian");
        Vet1.setClinicalExam(true);
        Vet1.setDoctorRating(10);
        Vet1.setAnimalSpecialisation("Feline");

        System.out.println(Vet1.getDname());
        System.out.println(Vet1.getSpec());
        System.out.println(Vet1.getDoctorRating());
        System.out.println(Vet1.getAnimalSpecialisation());

        Manasses_S Vet2 = new Manasses_S();
        Vet2.setDname("Manasses Sandor");
        Vet2.setSpec("Immunology");
        Vet2.setAnimalcategory("Birds");

        System.out.println(Vet2.getDname());
        System.out.println(Vet2.getSpec());
        System.out.println(Vet2.getAnimalcategory());

        Sabin_S Vet3 = new Sabin_S();
        Vet3.setDname("Sabin Sabau");
        Vet3.setSpec("Pathology");
        Vet3.setVaccinationPrice(50);


        System.out.println(Vet3.getDname());
        System.out.println(Vet3.getSpec());
        System.out.println(Vet3.getVaccinationPrice());
    }
}
