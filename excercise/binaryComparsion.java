public class binaryComparsion{
	
	public static void main(String args[]){
		int a = 2;
		int b = 3;
		int c = 2020;
		int d = 27;
		int e = 10;
		int f = 16;
		int g = 10;
		
		int rechnung1 = (a+b);
		int rechnung2 = (a&b);
		int rechnung3 = (f&g);
		int rechnung4 = (a&b-f&g);
		int rechnung5 = (23&12-16&10);
		
		System.out.println("a = "+a+" = "+"\t"+Integer.toBinaryString(a));
		System.out.println("b = "+b+" = "+"\t"+Integer.toBinaryString(b));
		System.out.println("c = "+c+" = "+"\t"+Integer.toBinaryString(c));
		System.out.println("d = "+d+" = "+"\t"+Integer.toBinaryString(d));
		System.out.println("e = "+e+" = "+"\t"+Integer.toBinaryString(e));
		System.out.println("f = "+f+" = "+"\t"+Integer.toBinaryString(f));

		System.out.println("rechnung 1\n a + b ="+"\t"+Integer.toBinaryString(rechnung1));
		System.out.println("rechnung 2\n a & b ="+"\t"+Integer.toBinaryString(rechnung2));
		System.out.println("rechnung 3\n f & g = "+"\t"+Integer.toBinaryString(rechnung3));
		System.out.println("rechnung 4\n a & b - f & g = "+"\t"+Integer.toBinaryString(rechnung4));
		System.out.println("rechnung 5\n 23 & 12- 16 & 10 = "+"\t"+Integer.toBinaryString(rechnung5));
	}
}
