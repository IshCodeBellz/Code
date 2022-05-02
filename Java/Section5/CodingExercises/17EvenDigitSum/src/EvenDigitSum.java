public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if (number >= 0) {
            int total = 0;
            int remainingNumber;
            int currentNumber;
            while (number > 0) {
                remainingNumber = number % 10;
                if (remainingNumber % 2 == 0) {
                    total += remainingNumber;
                }
                number /= 10;
            }
            return total;
        }
        return -1;
    }

}
