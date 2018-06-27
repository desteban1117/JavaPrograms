public class Main {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(0);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int megaBytesNumber = kiloBytes / 1024;
        int remainingKiloBytes = kiloBytes - (megaBytesNumber * 1024);
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }else {
            System.out.println(kiloBytes + " KB = " + megaBytesNumber + "MB and " + remainingKiloBytes + " KB");
        }
    }
}
