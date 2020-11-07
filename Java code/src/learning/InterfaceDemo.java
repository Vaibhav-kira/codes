package learning;

class Pen
{
	public void write()
	{
		System.out.println("I am a pen");
	}
}

class Pencil
{
	public void write()
	{
		System.out.println("I am a pen");
	}
}

class Kit
{
	public void doSomething(Pen p)
	{
		p.write();
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
		Kit k = new Kit();
		
		Pen p = new Pen();
		
		Pencil pe = new Pencil();
		
		k.doSomething(p);
		
		// k.doSomething(pe); error as no method which has a Pencil as a argument....	

	}

}
