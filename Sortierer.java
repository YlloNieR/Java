public class Sortierer{
	public static void main(String[] args){
	int a = 2, b = 1, c = 3;	
	if(a < b & b < c){
		System.out.print("a"+" ,"+"b"+" ,"+"c");
	}
	else if(a < c & c < b){
		System.out.print("a"+" ,"+"c"+" ,"+"b");
	}		
	else if(b < a & a < c){
		System.out.print("b"+" ,"+"a"+" ,"+"c");
	}
	else if(b < c & c < a){
		System.out.print("b"+" ,"+"c"+" ,"+"a");
	}	
	else if(c < a & a < b){
		System.out.print("c"+" ,"+"a"+" ,"+"b");
	}
	else if(c < b & b < a){
		System.out.print("c"+" ,"+"b"+" ,"+"a");
	}	
	}
}