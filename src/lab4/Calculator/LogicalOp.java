package lab4.Calculator;

public class LogicalOp {
    //Loops for
    //Ex. 1
    public void num100 (int N){
      for (int i = N; i <= 100; i++){
          System.out.println(i);
        }
    }
    //Ex. 2
    public void numMin (int N){
        for (int i = N; i >= -100; i--){
            System.out.println(i);
        }
    }
    //Ex. 3
    public void numCount (int X, int Y){
        if (X > Y)
            for (int i = X; i >= Y; i--){
                System.out.println(i);
            }
        else for (int i = X; i <= Y; i++){
            System.out.println(i);
        }
    }
    //Ex. 4
    public void numCresc (int X, int Y){
        if (X < Y)
            for (int i = X; i <= Y; i++){
                System.out.println(i);
            }
        else for (int i = Y; i <= X; i++){
            System.out.println(i);
        }
    }
    //Ex. 5
    public void numPar(){
        for (int i = 2; i <= 100; i+=2){
            System.out.println(i);
        }
    }
    //Ex. 6
    public void numImpar(){
        for (int i = 1; i <= 100; i+=2){
            System.out.println(i);
        }
    }
    //Ex. 7
    public int numSum(int n){
        int sum  = 0;
        for (int i = n; i <= 100; i++){sum+=i;}
           return sum;
        }
    //Ex.8
    public float numAverage(float n){
        int sum = 0;
        for (float i = n; i <= 100; i++){sum+=i;}
        return sum/(101 - n);
    }
    //Ex. 9
    public void pattern(){
        for (int i = 7; i > 0; i--){
            for (int j = i; j > 0; j--){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    //Loops while
    //Ex. 1
    public void wnum(int n){
        int i = n;
        while (i <= 100){
            System.out.println(i);
            i++;
        }
    }
    //Ex. 2
    public void wnumMin(int n){
        int i = n;
        while (i >= -100){
            System.out.println(i);
            i--;
        }
    }
    //Ex. 3
    public void wnumCount(int x, int y){
        if (x > y){
            while (x!=y-1){
                System.out.println(x);
                x--;
            }
        }else{
            while (x!=y+1){
                System.out.println(x);
                x++;
            }
        }
    }
    //Ex. 4
    public void wnumCountCresc(int x, int y){
        if (x > y){
            while (x+1!=y){
                System.out.println(y);
                y++;
            }
        }else{
            while (x!=y+1){
                System.out.println(x);
                x++;
            }
        }
    }
    //Ex. 5
    public void wNumCountPar(){
      int i = 2;
      while (i <= 100){
          System.out.println(i);
          i+=2;
      }
    }
    //Ex. 6
    public void wNumCountImpar(){
        int i =1;
        while (i <= 100){
            System.out.println(i);
        i+=2;
        }
    }
    //Ex. 7
    public void wNumAdd(){
        int x = 111;
        int y = 1;  //count
        int Sum = 0;
        while (x <= 8899){
            Sum+= x;
            y++;
            x++;
        }
        System.out.println(Sum/y);
    }
    //Ex. 8
    public int getAverageFromNumber(int x, int y){
        int sum = 0;
        int count = 0;
        while (x <= y){
            if (x % 7 == 0){
              sum += x;
              count++;
            }
            x++;
        }
       return sum/count;
    }
    //Ex. 9
    public void wNumFibonacci(){
      int count =1;
        System.out.println(1);
        int i = 1;
        count++;
        while (count <= 20) {
            System.out.println(i);
            count++;
            i+=i;
        }
    }
    //Ex. 10
    public void cozaLoza(){
        int start = 1;
        int finish = 110;
        while (start <= finish){
            if (start % 3 == 0)
            System.out.print("Coza ");
            else if (start % 5 == 0)
            System.out.print("Loza ");
            else if (start % 7 == 0)
            System.out.print("Woza ");
            else if (start % 3 == 0 && start % 5 == 0)
                System.out.print("CozaLoza ");
            else if (start % 3 == 0 && start % 7 == 0)
                System.out.print("CozaWoza ");
            else if (start % 5 == 0 && start % 7 == 0)
                System.out.print("WozaLoza ");
            else if (start % 3 == 0 && start % 5 == 0 && start % 7 == 0)
                System.out.print("CozaLozaWoza ");
            else
                System.out.print(start + " ");
            if (start % 11 == 0)
                System.out.println();

            start++;
        }
    }
    }




