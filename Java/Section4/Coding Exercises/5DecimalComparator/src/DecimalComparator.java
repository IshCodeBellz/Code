public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double numberOne, double numberTwo){
        numberOne = numberOne * 1000;
        numberTwo = numberTwo * 1000;

        int a = (int) numberOne;
        int b = (int) numberTwo;

        if (a == b){
            System.out.println(a + " " + b);
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        System.out.println(a + " " + b);
        return false;
    }
}
