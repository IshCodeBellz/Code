public class NumberToWords {
    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        } else if (number == 0) {
            return 1;
        }
        int length = 0;
        long temp = 1;
        while (temp <= number) {
            length++;
            temp *= 10;
        }
        return length;
    }

    public static int reverse(int number){
        int reversed = 0;

        while(number != 0){
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number /= 10;
        }
        return reversed;
    }

    public static void numberToWords(int number){
        number = reverse(number);
        if (number > 0){
            int lastDigit = 0;
            while (number != 0){
                lastDigit = number % 10;

                if (lastDigit == 0){
                    System.out.println("Zero");
                }
                else if (lastDigit == 1){
                    System.out.println("One");
                }
                else if (lastDigit == 2){
                    System.out.println("Two");
                }
                else if (lastDigit == 3){
                    System.out.println("Three");
                }
                else if (lastDigit == 4){
                    System.out.println("Four");
                }
                else if (lastDigit == 5){
                    System.out.println("Five");
                }
                else if (lastDigit == 6){
                    System.out.println("Six");
                }
                else if (lastDigit == 7){
                    System.out.println("Seven");
                }
                else if (lastDigit == 8){
                    System.out.println("Eight");
                }
                else {
                    System.out.println("Nine");
                }
                number /= 10;
            }
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
