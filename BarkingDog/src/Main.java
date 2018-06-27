public class Main {

    public static void main(String[] args) {
        System.out.println(bark(true, 1));
        System.out.println(bark(false, 2));
        System.out.println(bark(true, 8));
        System.out.println(bark(true, -1));
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if ((hourOfDay < 8 && barking == true) || (hourOfDay > 22 && barking == true)) {
            return true;
        }else {
            return false;
        }
    }
}
