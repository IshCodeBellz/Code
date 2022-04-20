public class DigitSumChallenge {
    public static int sumDigits(int number){
        if (number >= 10 ){
            int remainderNo;
            int total = 0;

            // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
            while (number > 0){
                // extract the least significant digit
                remainderNo = number % 10;
                total += remainderNo;

                // drop least significant digit
                number /= 10; //same as number = number / 10
            }
            return total;
        }
        return -1;
    }
}
