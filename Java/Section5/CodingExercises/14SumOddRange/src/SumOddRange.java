public class SumOddRange {
    public static boolean isOdd(int number){
        if (number > 0){
            if (number % 2 == 1){
                return true;
            }
            return false;
        }
        return false;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if (start > 0 && (end >= start && end > 0)){
            for (int i = start; i <= end; i++){
                boolean odd = isOdd(i);
                if (odd){
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }
}
