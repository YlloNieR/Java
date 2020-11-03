import java.util.Scanner;

public class UmrechnerCalFahr {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        

        System.out.println("Option 1 = Eingabe in Celsius umrechnen\nOption 2 = Eingabe in Fahrenheit umrechnen");
        int option = s.nextInt();

        if(option == 1){
            System.out.println("Option 1");
            double eingabe = s.nextDouble();
            double ausgabe = (eingabe * 1.8) + (32);            
            System.out.println(eingabe + " Grad C entspricht " + ausgabe + " Grad F");
        }
        else{
            System.out.println("Option 2");
            double eingabe = s.nextDouble();
            double ausgabe = (eingabe - 32) / (1.8);
            System.out.println(eingabe + " Grad F entspricht " + ausgabe + " Grad C");
        }
        s.close();
    }
}