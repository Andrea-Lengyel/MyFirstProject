package lab4.Calculator;
public class Main {
    public static void main(String[] args) {
        LogicalOp Loop = new LogicalOp();
      Loop.num100(37);
      Loop.numMin(7);
      Loop.numCount(3, 7);
      Loop.numCresc(7, 2);
      Loop.numPar();
      Loop.numImpar();
      int rez = Loop.numSum(77);
        System.out.println(rez);
      float avg = Loop.numAverage(77);
        System.out.println(avg);
      Loop.pattern();
    Loop.wnum(88);
    Loop.wnumMin(10);
    Loop.wnumCount(7, 5);
    Loop.wnumCountCresc(2,7);

    }


}
