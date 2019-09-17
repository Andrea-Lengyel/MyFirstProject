public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Tipuri de date
        String rasa = "Ciobanesc german";
        String culoare = "maro";
        byte varsta = 2;
        float greutate = 23.5f;
        char gen = 'f';
        int nivelInteligenta = 1231231231;
        long nivelEnergie = 435678876546754123L;
        double nivelNevoieAtentie = 18239182381238935484569486734356893d;

        System.out.println("Despre catelul meu: ");
        System.out.println(rasa);
        System.out.println(nivelNevoieAtentie);
        System.out.println(varsta + greutate);
        System.out.println(culoare + greutate);
        System.out.println(culoare + varsta + greutate);
        System.out.println(culoare + (varsta + greutate));
        System.out.println("culoarea este " + culoare + " si greutatea " + (varsta + greutate));
        System.out.println("culoarea este " + culoare + ", varsta este " + varsta + " si greutatea este " + greutate);
        System.out.println("culoarea este " +
                culoare + ", \nvarsta este " +
                varsta +
                " si greutatea este " +
                greutate);

        int x = 2;
        int y = 3;
        int sum = x + y;
        float average = sum/2f;

        x+=y; // x = x + y;
        x-=y; // x = x - y;
        x+=2; // x = x + 2;

        x+=x+=x++ + ++x;

        System.out.println(average);
        System.out.println("Numbers: " + x + "," + y);
    }
}

