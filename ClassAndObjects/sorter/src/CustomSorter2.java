public class CustomSorter2{
	public static void main(String[] args){
	int a = 2, b = 1, c = 3;
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
	System.out.print(a+" < "+b+" < "+c);
	}
}