public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }else {
            int meg = kiloBytes / 1024;
            int remain = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + meg + " MB and " + remain + " KB");

//            if (kiloBytes == 0){
//                System.out.println(kiloBytes + " KB = " + 0 + " MB and " + 0 + " KB");
//            }
//            else if(kiloBytes % 1024 == 0){
//                System.out.println(kiloBytes + " KB = " + meg + " MB");
//            }
//            else{
//                System.out.println(kiloBytes + " KB = " + meg + " MB and " + remain + " KB");
//            }
// my solution is better as is specifies if theres a value of zero it wont show
        }
    }
}
