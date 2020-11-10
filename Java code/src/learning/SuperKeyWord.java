package learning;

class Al
{
	public Al()
	{
		System.out.println("In A");
	}
	public Al(int i)
	{
		System.out.println("In A int");
	}
}
class B extends Al
{
	B()
	{
		super(); // will be there by default
		System.out.println("In B");
	}
	public B(int i)
	{
		super();// will be there by default 
		//super(i);
		// if put parameter in super .... parametraiswed of super will be called 
		System.out.println("In B int");
	}
}

public class SuperKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Aa obj = new Aa();
		System.out.println();
		B obj1 = new B(); // super class + sub class both
		// when ever you create object of sub class object of super class is automatically formed 
		
		System.out.println();
		
		B obj2 = new B(5);// calls the normal cnstructor of super class but parameterized of sub 
		//will called default constructor of super class
		
		

	}

}
