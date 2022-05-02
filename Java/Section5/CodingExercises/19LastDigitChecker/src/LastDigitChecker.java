public class LastDigitChecker {
    public static boolean hasSameLastDigit(int number1, int number2, int number3){
        if ((number1 >= 10 && number1 <= 1000) && (number2 >= 10 && number2 <= 1000) && (number3 >= 10 && number3 <= 1000)){
            int lastDigit1 = 0;
            int lastDigit2 = 0;
            int lastDigit3 = 0;
//            while (number1 > 0 || number2 > 0 || number3 > 0){
                lastDigit1 = number1 % 10;
                lastDigit2 = number2 % 10;
                lastDigit3 = number3 % 10;
                if (lastDigit1 == lastDigit2 || lastDigit2 == lastDigit3 || lastDigit1 == lastDigit3){
                    return true;
                }
//                else {
//                    number1 = number1 / 10;
//                    number2 = number2 / 10;
//                    number3 = number3 / 10;
//
//                    if (lastDigit1 == number2 || lastDigit2 == number1 || lastDigit3 == number1 || lastDigit3 == number2 || lastDigit1 == number3 || lastDigit2 == number3){
//                        return true;
//                    }
//
//                }
//            }
        }
        return false;
    }

    public static boolean isValid(int number){
        if (number>=10&&number<=1000){
            return true;
        }
        return false;
    }
}
