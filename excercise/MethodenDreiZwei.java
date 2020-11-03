import java.util.Scanner;

public class MethodenDreiZwei {
    public static void kleinsteZahl(int a, int b, int c){        
        if(a < b && a < c){
            System.out.println(a + " = die kleinste Zahl");
        }
        if(b < c && b < a){
            System.out.println(b + " = die kleinste Zahl");
        }
        if(c < a && c < b){
            System.out.println(c + " = die kleinste Zahl");
        }
    }

    public static void durchschnittZahlen(int a, int b, int c){
        double durchnschnit = (a+b+c)/3;
        System.out.println("Der Durchschnitt der Zahlen betraegt = "+durchnschnit);
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("erste Zahl A: ");
        int a = s.nextInt();
        System.out.println("zweite Zahl B: ");
        int b = s.nextInt();
        System.out.println("dritte Zahl C: ");
        int c = s.nextInt();

        kleinsteZahl(a,b,c);
        durchschnittZahlen(a,b,c);
        s.close();
    }    
}
