import java.util.Scanner;

public class Erdenmensch {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String geschlecht = s.next();

        String name = s.next();

        if(Character.toLowerCase(geschlecht.charAt(0))=='m'){
            System.out.println("Hallo Herr "+name);
        }
        else {
            System.out.println("Hallo Frau "+name);
        }
    }
    
}