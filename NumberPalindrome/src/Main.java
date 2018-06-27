public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number = number * -1;
        }
        int reverse = 0;
        int remaining = number;
        while(remaining > 0) {
            reverse = reverse * 10 + (remaining % 10);
            remaining = remaining / 10;
         }

         if (reverse == number) {
            return true;
         }

        return false;
    }
}
