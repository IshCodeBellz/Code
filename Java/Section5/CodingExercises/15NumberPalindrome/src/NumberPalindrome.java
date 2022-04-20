public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int originalNumber = number;
        int lastDigit;
        int reversed = 0;
        boolean switchTF = true;

        do {
            lastDigit = number % 10;
            System.out.println(lastDigit);
            reversed = (reversed * 10) + lastDigit;
            System.out.println(reversed);
            number = number / 10;
            System.out.println(number);
            if (number == 0){
                switchTF = false;
            }
        }while (switchTF);
        return reversed == originalNumber ;
    }
}
