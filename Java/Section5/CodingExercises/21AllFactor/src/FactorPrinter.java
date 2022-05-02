public class FactorPrinter {
    public static void printFactors(int number){
        if (number > 0){
            String iString = null;
            for (int i = 1; i <= number; i++){
                if (number%i==0){
                    iString = String.valueOf(i);
                    System.out.println(iString);
                }
            }
            System.out.println("");
        }
        else{
            System.out.println("Invalid Value");
        }
    }
}
