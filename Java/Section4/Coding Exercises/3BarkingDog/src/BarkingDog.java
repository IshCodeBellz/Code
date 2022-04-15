public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if (hourOfDay > -1 && hourOfDay < 24){
            if (barking && hourOfDay < 8 || hourOfDay > 22){
                System.out.println(true);
                return true;
            }
            else {
                System.out.println(false);
                return false;
            }
        }
        System.out.println(false);
        return false;
    }

}
