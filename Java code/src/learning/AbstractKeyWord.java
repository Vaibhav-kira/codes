package learning;

abstract class Human              // Cannot create object of abstract class  only used to be used by another class using extends 
{
	public abstract void eat();  // if want to declare a method
	
	// if abstract to method we need to have abstract class
	
	public void sleep()
	{
		
	}
}

class Man extends Human
{
	// need to define a abstract method
	
	public void eat()
	{
		System.out.println("Hi");
	}
	
}

class Printer
{
	public void show(Number i)          // Number will have every integer float double short long byte etc. 
	{
		System.out.println(i);          // Number is a abstract class 
 	}
}

public class AbstractKeyWord 
{
	
	public static void main(String args[])
	{
		
		Man obj = new Man();
		
		Printer obj1 = new Printer();
		
		obj1.show(5);
		obj1.show(5.36);
		obj1.show(2.365652533);
		
		//Number nu = new Number(5.7); // error
		
	}

}
