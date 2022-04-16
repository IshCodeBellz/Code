public class EqualSumChecker {
    public static boolean hasEqualSum (int inpOne, int inpTwo, int inpThree){
        if(inpOne + inpTwo == inpThree){
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }
}
