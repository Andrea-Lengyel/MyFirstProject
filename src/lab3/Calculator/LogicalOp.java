package lab3.Calculator;

public class LogicalOp {
    //Ex. 3
    public int verifyGreaterNumber(int first, int second){
        if (first > second){
            return first;
        }else if (first < second) {
            return second;
        }else {
            return first;
        }
    }
    //Ex. 4
    public String Text (String t1) {
        if (t1.equals("FastTrackIT")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }
    //Ex. 5
    public String verifyTextAndNumber(String text, int number) {
        if (text.equals("FastTrack") && number <= 3){
            return (text + " " + number);
    } else if(!text.equals("FastTrack") && number >= 4){
            return (number + " " + text);
        }
        return "";
    }

    //Ex. 6
     public String Weather (int Snow) {
            if (Snow > 8 || Snow == 6){
                return ("The amount of snow this winter was (cm): " + Snow);
            }else{return ("The forecast snow is (cm): " + Snow);}
        }

     //Ex. 7
    public String Comp (float Num){
        if (Num > 3 && Num != 4){
            return ("The number is greater than 3 and not equal to 4");
        }else if (Num == 4) {return ("The number is equal to 4");
        }else if (Num < 3) {return ("The number is lower than 3");}
        return "";
    }

    //Ex. 9
    public boolean isNumberEven (int x){
        if (x%2 == 0) {return true;}
        return false;
    }

    //Ex. 10
    public boolean isEligibleToVote (int y){
        if (y >= 18){return true;}
        return false;
    }

    //Ex. 11
    public int Greater (int a, int b, int c){
        if (a >= b && a >= c){return a;}
        else if (b >= a && b >= c){return b;}
        return c;
    }
    }

