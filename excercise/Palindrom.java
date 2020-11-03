import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Geben Sie das angebliche Palindrom ein.");

        String input = s.next();
        String lowStr = input.toLowerCase();
        
        System.out.println("Ist "+input+" ein Palindrom? -> "+antwort(isPalindrome(lowStr)));
        s.close();
    }

    public static String antwort(boolean isPalindrome){
        boolean wahrOderFalsch = isPalindrome;
        if(wahrOderFalsch == true){
            return "Ja das stimmt!";
        }
        else{
            return "Nein das ist Falsch!";
        }
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
