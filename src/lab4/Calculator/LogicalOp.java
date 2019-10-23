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
    //Ex. 3
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

    }



