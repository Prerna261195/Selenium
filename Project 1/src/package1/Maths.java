package package1;


////////////////////////////////////////////   ((((10+2)+2)-2)*2)/2)   //////////////////////////////////////////////


public class Maths {

	public int sum(int a, int b)   
	 {
		 int c;
		 c=a+b;
		 System.out.println("So, the result of addition:" +c);
		 return c;
	 }

	 public int sub(int a, int b) 
	{
		 int z;
		 z=a-b;
		 System.out.println("So, the result of subtraction is:" +z);
	     return z;
	}
	 public int multi(int x1, int x2)
	 {
		 int x3;
		 x3=x1*x2;
		 System.out.println("final result is:" +x3);
		 return x3;
	 }
	 
	 public void div (int t, int s)
	 {
		 int u;
		 u=t/s;
		 System.out.println("final result is:" +u);
		 
	 }
	 
	 public static void main(String[] args) {
		
		 Maths p=new Maths();
		 int sumResult=p.sum(10, 2);
		int sumResult2=p.sum(sumResult, 2);
	    int subResult=p.sub(sumResult2, 2);
	    int multiResult=p.multi(subResult, 2);
	    p.div(multiResult, 2);
	}
}
