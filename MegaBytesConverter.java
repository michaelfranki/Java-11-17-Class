package Chapter2.src;

//1 MB = 1024 KB
public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

    // calculates the megabytes and remaining kilobytes from the kilobytes
    // parameter.
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes >= 0) {
            int calculatedMegabytes = kiloBytes / 1024;;
            int remainingKilobytes = kiloBytes % 1024;;
            System.out.println(kiloBytes + " KB = " + calculatedMegabytes + " MB and " + remainingKilobytes + " KB");
        }
        else {
            System.out.println("Invalid Value");
        }

    }
}
