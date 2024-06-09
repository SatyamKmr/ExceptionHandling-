package Singleton2;

public class Singleton {

	// static variable single_instance of type singleton
	private static Singleton single_instance=null;
	
	// Declare a variable of string
	public String s;
	
	private Singleton()
	{
		s="Hello i am a string part of singleton";
	}
	
	// Static method to create instance of singleton class
	public static Singleton Singleton()
	{
		if(single_instance == null)
		{
			single_instance=new Singleton();
		}
		return single_instance;
	}
	
}
