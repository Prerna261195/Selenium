package package1;


////////////////////////////////////////////    ((((10/2)-2)-2)+2)*2)   //////////////////////////////////////////////


public class Mathss 
{
	public int div(int a, int b)   
	 {
		 int c;
		 c=a/b;
		 System.out.println("So, the result of division:" +c);
		 return c;
	 }

	 public int sub(int a, int b) 
	{
		 int z;
		 z=a-b;
		 System.out.println("So, the result of subtraction is:" +z);
	     return z;
	}
	 public int sum(int a, int b)
	 {
		 int x;
		 x=a+b;
		 System.out.println("final result of addition is:" +x);
		 return x;
	 }
	 
	 public void multi(int t, int s)
	 {
		 int u;
		 u=t*s;
		 System.out.println("final result is:" +u);
		 
	 }
	 
	 public static void main(String[] args) 
	 {
		 Mathss q=new Mathss();
		 int divResult=q.div(10, 2);
			int subResult=q.sub(divResult, 2);
		    int subResult2=q.sub(subResult, 2);
		    int sumResult=q.sum(subResult2, 2);
		    q.multi(sumResult, 2);
	 }
		

}
