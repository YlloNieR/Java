public class GSorter{
    
    public static void sorter(double a, double b, double c){        
        System.out.println("sorting...");
        double tmp;
            // 9,6 ; 3,4 ; 3,7  worst case
        if(a > c){
            tmp = c;
            c = a;
            a = tmp;
            // 3,7 ; 3,4 ; 9,6
        }

        if(b > c){
            tmp = c;
            c = b;
            b = tmp;
            // 3,7 ; 3,4 ; 9,6
        }

        if(a > b){
            tmp = b;
            b = a;
            a = tmp;
            // 3,4 ; 3,7 ; 9,6
        }

        System.out.println("VAR1 = "+a);
        System.out.println("VAR2 = "+b);
        System.out.println("VAR3 = "+c);


    }
    
    public static void main(String[] args){
        double a = 3.7;
        double b = 9.6;
        double c = 3.4;
        
        System.out.println("## Sorter ##");
        System.out.println("VAR1 = "+a);
        System.out.println("VAR2 = "+b);
        System.out.println("VAR3 = "+c);

        sorter(a, b, c);
    }
}