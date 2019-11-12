package lab6.Calculator;

import java.util.List;

public class LogicalOp {
    //Ex.1
    public void printList(List<Integer> listName){
        for (int i =0; i < listName.size(); i++);
        for (int i: listName){
            System.out.println(i);
        }
    }

    //Ex. 2
    public void addToList(List<Integer> list, int number, int poz){
        list.add(poz, number);
    }

    //Ex. 3
    public void printFromPosition(List<Integer> myList, int position){
        for (int i = position; i < myList.size() && i >= 0; i++){
            System.out.println(myList.get(i));
        }
    }

    //Ex. 4
    public void printListValuesReverse(List<Integer> myList){
     for (int i = myList.size()-1; i >= 0; i--){
         System.out.println(myList.get(i));
     }
    }

    //Ex. 5
    public void addStringToList(List<String> myList, int position, String x){
        myList.add(position, x);
    }

    //Ex. 6
    public void parameterToList(List<Integer> list, int number){
        list.add(1, number);
    }

    //Ex. 7
    public void printListPosition(List<Integer> listName){
        for (int i = 0; i < listName.size(); i++){
            System.out.println("On position " + i + " the value is " + listName.get(i));
        }
    }

    //Ex. 8
    public int returnMaxValueList(List<Integer> myList){
      int x = myList.get(0);
      for (int i = 0; i < myList.size(); i++){
          if (x < myList.get(i))
              x = myList.get(i);
      }return x;
    }
}
