//import java.util.Scanner;

public class Aufgaben{
	public static void main(String[] args){
		
		//Aufgabe 1
		/*
		for(int i = 1;i <= 10;i++){
			System.out.println(i);
		}
		*/
		
		//Aufgabe 2
		/*
		int x = 0;
		for(int i = 0;i <= 10;i++){	
			x += i;
			System.out.println("Nr. = "+i+" = "+x);
		}
		*/
		
		//Aufgabe 3	
		/*		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		for(int i = 1;i <= 10;i++){				
			System.out.println(i+" * "+x+" = "+(i*x));
		}
		*/
		
		//Aufgabe 4
		/*
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int x2 = x;
		for(int i = x-1;i >= 1;i--){				
			x *= i;			
		}
		System.out.println("Die Fakultaet von "+x2+" = "+x);
		*/
		
		//Aufgabe 5
		/*
		Scanner s = new Scanner(System.in);
		System.out.println("Geben Sie den Basiswert ein:");
		int basis = s.nextInt();
		System.out.println("Geben Sie den Exponent ein:");
		int exponent = s.nextInt();
		int potenz = 1; // Multiplikation Neutralelement
		int basisUrsprung = basis;
		for(int i = exponent;i >= 1;i--){				
			potenz *= basis;			
		}
		System.out.println(basisUrsprung+" hoch "+exponent+" = "+potenz);
		*/
		
		// Arrays - Datentyp
		/*
		int[] zahlenArray1 = new int[5]; // Dieses Array besitzt 5 Einträge
		zahlenArray1[0] = 1;
		zahlenArray1[1] = 5.0;
				
		double[] zahlenArray2 = new double[3]; // Dieses Array besitzt 3 Einträge
			
		int[][] matrix = //mehrdimesionales Array  Row ZEILEN [] Column SPALTEN []
		*/
		char[] alphabet = new char[26];
		//char[] alphabet = {'a';'b';'c';'d';'e';'f';'g';'h';'i';'j';'k';'l';'m';'n';'o';'p';'q';'r';'s';'t';'u';'v';'w';'x';'y';'z'};
		
	
		int index = 0;
		
		for(char c = 'a'; c <= 'z';c++){
			alphabet[index++] = c;
			System.out.println(c);
		}
		
		// Arrays Fall 1
		/*
		int [] zahlen = new int[4];
		int c = 7;
		int laenge = zahlen.length; // Länge = 4
		
		for(int i = 0; i < zahlen.length;i++){
			zahlen[i] = c;
			c++;
			System.out.println(i+" - "+c);
		}
		*/
		
		// Methode
	}
}







































