package Practicles;

interface Vaibhav6                                   // by default abstract class           cannot object of interface 
{
	void show(); // We can declare a method                  // by default public and abstract 
	/*public void how()
	{
		
	}                     // Cannot define a method 
	*/
}

class A6 implements Vaibhav6
{
	public void show()                // must include public
	{
		System.out.println("hellow ");
	}
}

public class experiment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A6 obj = new A6();
		obj.show();
	}

}
