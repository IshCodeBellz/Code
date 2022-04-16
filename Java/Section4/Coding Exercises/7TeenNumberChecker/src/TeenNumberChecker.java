public class TeenNumberChecker {
    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree){
        if((ageOne >= 13 && ageOne <= 19) || (ageTwo >= 13 && ageTwo <= 19) || (ageThree >= 13 && ageThree <= 19)){
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }
    public static boolean isTeen(int ageOne){
        if((ageOne >= 13 && ageOne <= 19)){
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }
}
