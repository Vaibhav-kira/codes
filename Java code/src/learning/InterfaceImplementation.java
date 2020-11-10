package learning;

/*class Vaibhav
{
	
}

class hellow
{
	
}

class Ahuja extends Vaibhav , hellow 
{
	
}                                            Not possible as java does not support two extend
*/
class pagal                    
{
	
}
interface Vaibhav                                   // by default abstract class           cannot object of interface 
{
	void show(); // We can declare a method                  // by default public and abstract 
	/*public void how()
	{
		
	}                     // Cannot define a method 
	*/
}

interface hellow
{
	
}

class Ahuja implements Vaibhav , hellow             // We use interface and implements
{
	public void show()
	{
		
	}
													// Must contain defination of method declare in interface
}   
class Alco extends pagal implements Vaibhav        // We can also extend class and implement other interface
{
	public void show()
	{
		
	}
	
}
// Cannot extends an interface !!!!
// Cannot implements a class !!!!!  
public class InterfaceImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vaibhav obj = new Ahuja();
		// refrence of Vaibhav but object is of class Ahuja
		// Vaibhav obj = new Vaibhav
		// It is not possible as Vaibhav is interface thus an abstract class that means it cannot have an object 
		
	}

}
