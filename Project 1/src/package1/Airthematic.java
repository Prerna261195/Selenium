package package1;

//////////////////////////////////////////////  (10+2)(10-2)   ////////////////////////////////////////////////////

public class Airthematic
{
 public int sum(int a, int b)   
 {
	 int c;
	 c=a+b;
	 System.out.println("So, the result is addition:" +c);
	 return c;
 }

 public int sub(int a, int b) 
{
	 int z;
	 z=a-b;
	 System.out.println("So, the result of subtraction is:" +z);
     return z;
}
 public void multi(int x1, int x2)
 {
	 int x3;
	 x3=x1*x2;
	 System.out.println("final result is:" +x3);
	 
 }
	public static void main(String[] args) {
	
		Airthematic ob=new Airthematic();
		int sumResult=ob.sum(10, 2);
		int subResult=ob.sub(10, 2);
		ob.multi(sumResult, subResult);
	}
}
 
 