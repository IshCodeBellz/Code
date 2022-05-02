public class LargestPrime {
    public static int getLargestPrime(int number){
        if (number < 0){
            return -1;
        } else if (number == 0 || number == 1) {
            return -1;
        }

        int highestPrime = 0;
        int highestHighestPrime = 0;
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                highestPrime = i;
            }
        }
//        for (int j = highestPrime - 1; j < highestPrime; j--){
//            if (highestPrime % j == 0){
//                highestHighestPrime = j;
//                return highestHighestPrime;
//            }
//        }

        return highestPrime;
    }
}
