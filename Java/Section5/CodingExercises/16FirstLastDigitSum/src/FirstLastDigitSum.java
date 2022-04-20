public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }
        else {
            int firstDigit = 0,lastDigit = 0;
            int sum = 0;

            lastDigit = number % 10;
            if (number < 10){
                return lastDigit * 2;
            }
            while (number >= 10){
//                System.out.println(number);
                number /= 10;
//                System.out.println(number);
                firstDigit = number % 10;
//                System.out.println(number);

            }
          return firstDigit + lastDigit;
        }

    }
}
