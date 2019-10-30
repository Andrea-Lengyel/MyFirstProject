package lab5.Calculator;

public class Main {
    public static void main(String[] args){
        LogicalOp op = new LogicalOp();
        int[] newArray = op.getArrayHundred();
        int[] anotherOne = {1,2,3,4,5};
//        float[] x = new float[3];
//        x[0] = 1;

        int[] finalArray = op.removeNumberFromArray( 5, anotherOne);

        op.printArray(newArray);
        System.out.println(op.averageArray(newArray));

    //Ex. 1 Polimorfism
        Calculator calc = new Calculator();
        System.out.println(calc.sum(3,5));
        System.out.println(calc.sum(3,5, 7));
        System.out.println(calc.sum(3,10.5));
        System.out.println(calc.sum(10.5, 3));

        System.out.println(calc.substract(5,3));
        System.out.println(calc.substract(5,3,1));
        System.out.println(calc.substract(10.5, 3));

        System.out.println(calc.division(3,2));
        System.out.println(calc.division(5.5,2.5, 1.2));
        System.out.println(calc.division(5.5, 2));

        System.out.println(calc.multiply(3,5));
        System.out.println(calc.multiply(3,5,2));
        System.out.println(calc.multiply(2.5,2.5));

        //Ex. 3
        int[] anArray = op.myArrayPar();
        op.printArray(anArray);

        //Ex. 4
        int[] myArray = {1,2,3,4,5};
        System.out.println(op.mediaArray(myArray));

        //Ex. 5
        String[] wordArray = {"Pucky", "Puffy", "Missy", "Hera"};
        String word = "Puffy";
        System.out.println(op.strArray(wordArray, word));

        //Ex. 6
        int[] numArray = {1, 2, 3, 4, 5};
        int num = 3;
        System.out.println(op.returnPos(numArray, num));

        //Ex. 7
        op.returnChar();

        //Ex. 8

    }

}
