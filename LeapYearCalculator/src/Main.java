public class Main {

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(20017));
        System.out.println(isLeapYear(2000));

    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return  false;
        }else if (year%400 == 0 || (year%4 == 0 && year%100 > 0)) {
            return true;
        }else {
            return false;
        }

    }
}
