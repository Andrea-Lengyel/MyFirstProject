package lab5.Calculator;

public class LogicalOp {
    //Ex. 2
    public int[] getArrayHundred(){
        int[] myArray = new int[100];
        myArray[0] = 1;
        myArray[1] = 2;
        for (int i = 1; i <= 100; i++){
            myArray[i-1] = i;
        }
        return myArray;
    }
    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++)
        System.out.println("Pe pozitia " + (i) + " avem valoarea " + array[i]);
    }
    public float averageArray(int[] anArray){
        int count = 0;
        float sum = 0;
        for (int i = 0; i < anArray.length; i++){
            sum = sum + anArray[i];
        }
        return sum/anArray.length;
    }
    //Ex.3
    public int[] myArrayPar (){
        int[] anArray = new int[50];
        int sum = 0;
        for (int i = 0; i < 100/2; i++){
          sum +=2;
          anArray[i] = sum;
        }
        return anArray;
    }
    //Ex. 4
    public int mediaArray(int[] Array){
        int sum = 0;
        for (int i = 0; i < Array.length; i++){
           sum+= Array[i];
        }
        return sum/Array.length;
    }
    //Ex. 5
    public boolean strArray (String[] WordArray, String word){
        for (int i = 0; i < WordArray.length; i++){
            if (WordArray[i] == word)
                return true;
        }
        return false;
    }
    //Ex. 6
    public int returnPos (int[] Array, int x){
        for (int i = 0; i < Array.length; i++){
            if (Array[i] == x)
                return i;
        }
        return -1;
    }

    //Ex. 7
    public void returnChar (){
        char[] charArray = {'-','-','-','-','-','-','-','-','-','-'};
        for (int i = 0; i < charArray.length; i++){
            for (int j = 0; j < charArray.length; j++){
                System.out.print(charArray[j]);
            }
            System.out.println();
        }
    }
    }