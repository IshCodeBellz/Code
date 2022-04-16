public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim",500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player" + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet >=0 && (inches >=0 && inches <=12)){
            double feetConv = feet * 12 * 2.54;
            double inchesConv = inches * 2.54;
            double cmTotal = feetConv + inchesConv;
            System.out.println(cmTotal);
            return cmTotal;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >=0){
            double inchesConvToCm = inches * 2.54;
            double feet = inchesConvToCm % 2.54 * 12;
            System.out.println(feet + " feet " + inches + " inches");
            return new feet, inches;
        }
        return -1;
    }
}