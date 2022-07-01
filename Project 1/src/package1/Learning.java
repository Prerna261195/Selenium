package package1;

public class Learning {
	
	
	
	public void Method1()
	{
		this.Method4();
	System.out.println("Default method");
	}
	
 
	
	public void Method2()
	{
		this.Method1();
		System.out.println("one parametarized method");
	}
	
	
	public void Method3()
	{
		this.Method2();
		System.out.println("Two parametarized method");
		
	}
	
	
	public void Method4()
	{
		System.out.println("Three parametarized method");
	}
	
	
	
	public void Method5()
	{
		this.Method3();
		System.out.println("Four parametarized method");
	}
	
	
	public static void main(String[] args) {
		Learning pr=new Learning();
		pr.Method5();
		
		
	}
}
