package lab3.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int a = 3;
        int b = 5;
        System.out.println(calc.sum(a,b));
        System.out.println(calc.substract(a,b));
        System.out.println(calc.division(a,b));
        System.out.println(calc.multiply(a,b));

        //Ex.3: Given two numbers see which one is the greatest and print it.
        int x = 7;
        int y = 4;
        if (x > y){
            System.out.println("Greater: " + x);
        }else if (y > x) {
            System.out.println("Greater: " + y);
        }else if (x == y){
            System.out.println("Numbers are equal");
        }
        LogicalOp op = new LogicalOp();
        op.verifyGreaterNumber(x, y);
        System.out.println(op.verifyGreaterNumber(x, y));

     //Ex. 4
        String text1 = "FastTrackIT";
        String text2 = "Fast";
        System.out.println(op.Text(text1));
        System.out.println(op.Text(text2));

    //Ex. 5
        String text = "FastTrackIT";
        int number = 9;
        String result = op.verifyTextAndNumber (text, number);
        System.out.println(result);

      //Ex. 6

        System.out.println(op.Weather(7));

      //Ex. 7

        System.out.println(op.Comp(3.2f));

      //Ex. 9
        System.out.println(op.isNumberEven(8));

      //Ex. 10
        System.out.println(op.isEligibleToVote(19));

      //Ex. 11
        System.out.println(op.Greater(3, 9, 13));
    }

}
