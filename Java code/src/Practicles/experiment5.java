package Practicles;

// Differentiate between method overloading and method overriding

class A5
{
	A5()
	{
		System.out.println("Class A constructor");
	}
	A5(int a)
	{
		System.out.println(a);
	}
	void print()
	{
		System.out.println("Class A");
	}
	
	void print(int a)
	{
		System.out.println("Class A ---> "+a);
	}
	void print(int a,int b)                                  // overloading different parameters or different number of parameters
	{
		System.out.println("Class A ---> "+a+" ---> "+b);
	}

}

class B5 extends A5
{
	B5()
	{
		//super();
		System.out.println("Class B constructor");
	}
	@Override
	void print()
	{
		System.out.println("Class B extends A");
	}
	
}

public class experiment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A5 obj=new A5();
		B5 obj1=new B5();
		obj1.print();
		obj.print(6);
		obj.print(5, 9);
	}

}
