package lab2;

public class Main {

    public static void main(String[] args) {
     int x = 3;
     int y = 5;
     int result = sum(x,y);
        System.out.println(result);
     result = substract(x,y);
        System.out.println(result);
      float result2 = division(x,y);
        System.out.println(result2);
        result = multiply(x,y);
        System.out.println(result);
    }
        public static int sum(int first, int second) {
        int result = first + second;
        return result;
        }
        public static int substract(int first, int second) {
        int result = first - second;
        return result;
        }
        public static float division(float first, float second) {
        float div = first / second;
        return div;
        }
        public static int multiply(int first, int second) {
        int mult = first * second;
        return mult;
        }
}

