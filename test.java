import java.util.Scanner;

public class test {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(str);
        if(str.equals("a")){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    
}
