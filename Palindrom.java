import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Geben Sie das angebliche Palindrom ein.");

        String input = s.next();
        String lowStr = input.toLowerCase();
        
        System.out.println(input+" ein Palindrom? -> "+isPalindrome(lowStr));
    }

    public static boolean isPalindrome(String lowStr) {
        int n = lowStr.length();
        for (int i = 0; i < n / 2; i++)
            if (lowStr.charAt(i) != lowStr.charAt(n - i - 1)) {
                return false;
            }
        return true;
    }
}
