package learning;

abstract class Writer             // no error as we are not creating object of Writer it is only used for reference .... 
{
	abstract public void write();  
}

class Pen extends Writer
{
	public void write()
	{
		System.out.println("I am a pen");
	}
}

class Pencil extends Writer
{
	public void write()
	{
		System.out.println("I am a pencil");
	}
}

class Kit
{
	public void doSomething(Writer p)
	{
		p.write();
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
		Kit k = new Kit();
		
		Writer p = new Pen();
		
		Writer pe = new Pencil();
		
		k.doSomething(p);
		
		k.doSomething(pe); // it now works as super class is as argument and reference used in p and pe is of super class 
		
		// k.doSomething(pe); error as no method which has a Pencil as a argument....	

	}

}
