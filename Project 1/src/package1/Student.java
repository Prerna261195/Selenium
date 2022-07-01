package package1;

public class Student 
{

	int Age;      // variable declare
	
	public void display1()   //method
	{
		System.out.println("Welcome to all of you!!!");
	}
	
	int Rollno;   // variable declare
	
	public void display2()   //method
	{
		System.out.println("Automation is very easy.");
	}
	
	 public static void main(String[] args)
	{
		Student s=new Student();
		s.display1();   // object calling method prerna
		s.display2();
		s.Age=50;
		System.out.println(s.Age);
		s.Rollno=10;
		System.out.println(s.Rollno);
		
		
	}
}
