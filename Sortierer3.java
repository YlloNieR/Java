import java.util.Scanner;

public class Sortierer3{
	
	public static int[] sortierer(int a,int b,int c){		
		int tmp;
		if(a > b){
			tmp = a;
			a = b;
			b = tmp;
		}
		if(a > c){
			tmp = a;
			a = c;
			c = tmp;
		}
		if(b > c){
			tmp = b;
			b = c;
			c = tmp;
		}	
		
		int[] arrayList = new int[3];
		arrayList[0] = a;
		arrayList[1] = b;
		arrayList[2] = c;
		return arrayList;
	}

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int s1 = s.nextInt(); 
		int s2 = s.nextInt(); 
		int s3 = s.nextInt(); 
		
		System.out.println(sortierer(s1,s2,s3));
	}
}