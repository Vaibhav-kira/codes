package read_write_file;

class A
{
	public void show()
	{
		System.out.println("Show in A");
	}
}

class B extends A
{
	@Override
	public void show()
	{
		System.out.println("I am best");
	}
}

interface Vaibhav
{
	void show();
}

public class AnonymusClass {

	public static void main(String[] args) {
		
		A obj = new A();
		obj.show();
		B obj1 = new B();
		obj1.show();
		
		A ano = new A()
				{                                          // new class without name
			public void show()                             // Anonymous class 
			{                                              // Limited scope 
				System.out.println("I am best");
			}
			
				};
		ano.show();
		
		//Vaibhav obj32 = new Vaibhav();   // error as cannot create a object of interface as implementation/defination is not present 
		
		Vaibhav kla = new Vaibhav()
				{
			public void show()
			{
				System.out.println("I am the best");
			}
				};
		
		
	}

}
