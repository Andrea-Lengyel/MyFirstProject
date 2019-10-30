package lab5.Calculator;

public class Calculator {

    public int sum(int first, int second) {
        int rez = first + second;
        return rez;
    }
    public int sum (int first, int second, int third){
        int rez = first + second + third;
        return rez;
    }
    public double sum (int first, double second){
        double rez = first + second;
        return rez;
    }
    public int sum (double first, int second){
        int rez = (int) first + second;
        return rez;
    }
    public int substract(int first, int second) {
        int rez = first - second;
        return rez;
    }
    public int substract (int first, int second, int third){
        int rez = first - second - third;
        return rez;
    }
    public double substract (double first, int second){
        double rez = first - second;
        return rez;
    }
    public float division(int first, int second) {
        float div = (float) first / second;
        return div;
    }
    public float division (double first, double second, double third){
        float div = (float) (first/second/third);
        return div;
    }
    public double division (double first, int second){
        double div = first/second;
        return div;
    }
    public int multiply(int first, int second) {
        int mult = first * second;
        return mult;
    }
    public int multiply (int first, int second, int third){
        int mult = first * second * third;
        return mult;
    }
    public double multiply (double first, double second){
        double mult = first * second;
        return mult;
    }
}
