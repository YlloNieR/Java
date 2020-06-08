public class Sortierer {
    public static void main(String[] args){
        int a = 21;
        int b = 4;
        int c = 3;
        
        System.out.println("");
        System.out.println("Von Klein >>>> Gross");

        if (a < b && b < c){
            System.out.println(a+" "+b+" "+c);            
        }
        else if(b < a && a < c){
            System.out.println(b+" "+a+" "+c);            
        }        
        else if(c < a && a < b){
            System.out.println(c+" "+a+" "+b);            
        }
        else if(a < c && c < b){
            System.out.println(a+" "+c+" "+b);            
        }
        else if(c < b && b < a){
            System.out.println(c+" "+b+" "+a);            
        }
        else if(b < c && c < a){
            System.out.println(b+" "+c+" "+a);            
        }        
    }    
}