import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int value = 1;
        if (value ==1){
            System.out.println("Value was 1");
        } else if (value ==2) {
            System.out.println("Value was 2");
        }else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 6;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3,4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1,2,3,4 or 5");
                break;
        }

        char switchSelect = 'A';

        switch (switchSelect){
            case 'A':
                System.out.println("Char was A");
                break;
            case 'B':
                System.out.println("Char was B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Char was "+switchSelect);
                break;
            default:
                System.out.println("Char was not A,B,C,D or E");
                break;
        }

        String month = "November";

        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "november":
                System.out.println("Nov");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}