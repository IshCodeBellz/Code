public class Main {
    public static void main(String[] args) {
        int count = 1;
        while (count != 6){
            System.out.println("Count value is "+ count);
            count++;
        }

//        System.out.println("----------");
//
//        for (int i = 1; i < 7; i++){
//            System.out.println("Count value is "+ i);
//        }
        System.out.println("----------");
//        for (count = 1; count !=6; count++){
//            System.out.println("Count value is "+ count);
//        }
        count =1;
        while (true){
            if(count == 6){
                break;
            }
            System.out.println("Count value is "+ count);
            count++;
        }

//        count = 6;
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//
//            if (count > 100) {
//                break;
//            }
//        } while(count != 6);

        int number = 4;
        int finishNumber = 20;
        int count2 = 0;
        int total = 0;

        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            total+=number;
            System.out.println("Even number " + number);
            count2++;
            if (count2 >= 5){
                break;
            }
        }
        System.out.println("Total number of even numbers found =  " + count2);
        System.out.println("Total of all even numbers =  " + total);

    }

    public static boolean isEvenNumber(int number){
        if (number % 2 == 0){
            return true;
        }
        return false;
    }
}
