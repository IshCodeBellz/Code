import java.util.ArrayList;
import java.util.List;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if (first >= 10 && second >= 10 ){

//            List<Integer> arrFirst = new ArrayList<Integer>();
//            List<Integer> arrSecond = new ArrayList<Integer>();

            int greatestCommon = 0;

            for (int i = 1 ; i <= first; i++){
                if(first % i == 0 && second % i == 0){
                    greatestCommon = i;
//                    arrFirst.add(i);
                }
            }

//            for (int i = 1 ; i <= second; i++){
//                if(second % i == 0){
//                    arrSecond.add(i);
//                }
//            }
//            System.out.println(arrFirst);
//            System.out.println(arrSecond);
            return greatestCommon;
        }
        return -1;
    }
}
