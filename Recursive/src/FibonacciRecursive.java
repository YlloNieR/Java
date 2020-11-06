import java.util.Scanner;

public class FibonacciRecursive {
    
    public int n;

    public int fibonacci(int n) {        
        if (n == 1 || n == 2) {
            return 1;
        } else {                        
            return (fibonacci(n - 1)+fibonacci(n - 2));
        }
    }    

    public static void main(String[] args){
        /*   +   +   +   +       */
        /*  0 1 1 2 3 5 8 13 21  */
        /*     +   +   +    +    */
        /*   3 2 1 0          n  */      

        FibonacciRecursive rf = new FibonacciRecursive();        

        Scanner s = new Scanner(System.in);
        int integer = s.nextInt();

        System.out.println(rf.fibonacci(integer));
        
        s.close();
    }
}
