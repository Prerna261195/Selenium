package package1;

public class Paris 
{

	public Paris()           // Constructor
	
	{
		System.out.println( "Default constructor" );
	}
	
   public Paris(int a)           // Constructor
	
	{
		System.out.println( "one parameterized constructor" );
	}
    
   public Paris(float a, int b)           // Constructor
	
	{
		System.out.println( "two parameterized constructor" );
	}

   public static void main(String[] args) 
   {
	 
	   Paris p1=new Paris();  //creation of obj to call constructor
	   Paris p2=new Paris(10);
	   Paris p3=new Paris(3.5F, 20);
	   
	   
	
   }
   
}
