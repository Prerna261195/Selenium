package package1;

public class Prerna {                           //

	public Prerna()
	{
		this(10, 20, 30);
	System.out.println("Default");
	}
	
	
	public Prerna(int a)
	{
		this();
		System.out.println("One parametarized constructor");
		
	}
	
	
	public Prerna(int b, int c)
	{
		this(10);
		System.out.println("Two parametarized constructor");
	
	}
	
	
	public Prerna(int a, int b, int c)
	{
		
		System.out.println("Three parametarized constructor");
	}
	
	
	public Prerna(int a, int b, int c, int d)
	{
		this(30, 50);
		System.out.println("Four parametarized constructor");
	}
	
	
	
	public static void main(String[] args)                      //four, default, two, one, three
	{
		
		Prerna pr1=new Prerna(70, 80, 90, 100);
	}
}
