public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2){
        if ((number1 >= 10 && number1 <= 99) && (number2 >= 10 && number2 <= 99)){
            int lastDigit1 = 0;
            int lastDigit2 = 0;
            while (number1 > 0 || number2 > 0){
                lastDigit1 = number1 % 10;
                lastDigit2 = number2 % 10;
                if (lastDigit1 == lastDigit2){
                    return true;
                }else {
                    number1 = number1 / 10;
                    number2 = number2 / 10;
                    if (lastDigit1 == number2 || lastDigit2 == number1){
                        return true;
                    }

                }
            }

        }
        return false;
    }
}
