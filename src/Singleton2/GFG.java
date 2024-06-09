package Singleton2;

public class GFG {

	public static void main(String[] args) {
		
		// Instantiating Singleton class with variable x
		Singleton x=Singleton.Singleton();
		// Instantiating Singleton class with variable 
		Singleton y=Singleton.Singleton();
		// Instantiating Singleton class with variable x
		Singleton z=Singleton.Singleton();
		
		// Print and display commands
		System.out.println("String from x is"+y.s);
		System.out.println("String from x is"+x.s);
		System.out.println("String from x is"+z.s);
		
		x.s=(x.s).toUpperCase();
		
		// Print and display commands
		System.out.println("String from x is"+y.s);
		System.out.println("String from x is"+x.s);
		System.out.println("String from x is"+z.s);
		
	}
}
