package Singleton;

public class GFG {

	public static void main(String[] args) {
		
		// Instantiating singleton class with valriable x
		Singleton x=Singleton.getInstance();
		
		// Instantiating singleton class with valriable x
		Singleton y=Singleton.getInstance();
		
		// Instantiating singleton class with valriable x
		Singleton z=Singleton.getInstance();
		
		// Condition check
		if(x==y && y==x)
			System.out.println("Three objects point to the same location on the heap");
		else
			System.out.println("Three object don't point same object");
	}
}
