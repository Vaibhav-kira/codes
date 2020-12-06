package Practicles;



// different types of inheritance in java
//IS-A, HAS-A
//Class in which you are creating object is called HAS-A
//class which extends another IS-A

//java does not support multiple inheritance 

class A3
{
	
}

class B3 extends A3
{
	
}

class C3 extends B3
{
	
}

class D3 
{
	
}

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



public class experiment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
