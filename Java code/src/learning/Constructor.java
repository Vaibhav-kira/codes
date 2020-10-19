package learning;

class A
{
	int i;
	float f;
	public A()      //default
	{
		i=0;
		f=0.0f;
	}
	
	public A(int a,float b)   // Constructor overloading
	{
		i=a;
		f=b;
	}
	
}

public class Constructor {
	public static void main(String args[])  // You cannot create object withot main and cannot create main without object as every thing is implemented through class
	{                                      // i.e. why static is used 
		
		A obj = new A(5,5.6f); // constructor are called automatically 
		
		System.out.println(obj.f);
		System.out.println((double)obj.i);
		
	}
}
