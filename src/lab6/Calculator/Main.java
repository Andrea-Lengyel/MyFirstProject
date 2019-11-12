package lab6.Calculator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(1);
        myList.add(3);
        myList.add(0);
        myList.add(7);
        myList.add(6);
        myList.add(5);

        System.out.println(myList);

        LogicalOp op = new LogicalOp();

        op.addToList(myList, 4, 2);

//        System.out.println(myList.get(100));

     ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(5);
        arrList.add(15);
        arrList.add(25);
        arrList.add(35);
        for (Integer number: arrList){
            System.out.println(number);
        }
        op.printFromPosition(myList, 3);

        op.printListValuesReverse(myList);

        ArrayList<String> strList = new ArrayList<>();
        strList.add("Pufy");
        strList.add("Pucky");
        strList.add("Missy");
        strList.add("Hera");
        op.addStringToList(strList, 2, "Sosetel");

        op.parameterToList(myList, 4);

        op.printListPosition(myList);

        System.out.println(op.returnMaxValueList(myList));
    }


}
