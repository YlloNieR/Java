import java.util.Scanner;

public class NeueMailsAnzeigen {
    public static void main(String[] args) {
        NeueMailsAnzeigenMethode();

    }

    public static void NeueMailsAnzeigenMethode(){
    Scanner s = new Scanner(System.in);        
        int neueNachrichten = s.nextInt();
        
        System.out.println("\nWillkomen in Ihrem Mailaccount");

        if (neueNachrichten > 0){
            zeigeNeueNachrichten(neueNachrichten);
        }
        else{
            System.out.println("Sie haben keine neuen Nachrichten!\n");
        }
        s.close();
    }
    
/*     public static void zeigeNeueNachrichten(int neueNachrichten){
        for (int i = neueNachrichten; i > 0; i--){
            System.out.println(i+".Nachricht");
            System.out.println("Nachricht ausgeben\n");        
        }
    } */
    
    public static void zeigeNeueNachrichten(int neueNachrichten){
        while (neueNachrichten > 0){
            System.out.println(neueNachrichten+".Nachricht");
            System.out.println("Nachricht ausgeben\n");        
            neueNachrichten--;
        }
    } 
       

}