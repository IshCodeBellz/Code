public class SpeedConverter {

    public static long toMilesPerHour (double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }else {
            long calc = Math.round(kilometersPerHour / 1.609);
            return calc;
        }
    }

    public static void printConversion(double kilometersPerHour){
        if (toMilesPerHour(kilometersPerHour) < 0){
            System.out.println("Invalid Value");
        }else{
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h" );
        }

    }
}
