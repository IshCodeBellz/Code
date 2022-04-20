public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++){
            if(i % 3 == 0 && i % 5 ==0){
                count ++;
                sum += i;
                System.out.println("Found number is: "+ i);
                if(count == 5){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
//            System.out.println(i);
        }
        System.out.println("The end sum is: "+ sum);

    }
}