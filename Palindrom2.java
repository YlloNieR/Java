import java.util.Scanner;

public class Palindrom2 {
    public static void main(String[] args){
        System.out.println("____\\\\");
        Scanner s = new Scanner(System.in);
        String word = s.next();
        //char[] wort = {'h','a','n','n','a','h'};
        if(palindromTest(word.toUpperCase().toCharArray())){
            System.out.println("Das Wort "+word+" ist ein Palindrom");
        }
        else{
            System.out.println("Das Wort "+word+" ist kein Palindrom");
        }
        s.close();
    }
    public static boolean palindromTest(char[] buchstaben){
        for (int i = 0; i<buchstaben.length;i++){
            if(buchstaben[i] != buchstaben[buchstaben.length-i-1]){
                return false;
            }
        }
        return true;
    }
}
