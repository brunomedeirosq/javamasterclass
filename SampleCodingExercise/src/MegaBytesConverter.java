public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + kiloBytes/1024 + " MB and " + kiloBytes%1024 + " KB");
            // to check we can perform the following calculation: kiloBytes*1024 (int value remove decimal part is discarded) + kiloBytes%1024 = kiloBytes
        }
    }


}
