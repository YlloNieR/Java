import java.util.Scanner;

public class Sortierer5{

	public static void main (String[] args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		int[] sortierliste = sortierung(a,b,c);
		printArray(sortierliste);
		
	}
		
	public static void printArray(int[] array){
		for(int i=0;i<array.length;i++){
			if(i<array.length-1){
				System.out.print(array[i]+" < ");					
			}
			else{
				System.out.print(array[i]+"\n");
			}
		}
	}
	
	
	public static int[] sortierung(int a,int b, int c){
		// a b c 9 8 7
		if(a > b){
			int tmp;
			tmp = b;
			b = a;
			a = tmp;
		}
		// a b c 8 9 7
		if(b > c){
			int tmp;
			tmp = c;
			c = b;
			b = tmp;
		}
		// a b c 8 7 9
		if(a > b){
			int tmp;
			tmp = b;
			b = a;
			a = tmp;
		}
		// a b c 7 8 9
		int[] zahlArray = new int[3];
		zahlArray[0] = a;
		zahlArray[1] = b;
		zahlArray[2] = c;
		
		return zahlArray;
	}
			
}
	
