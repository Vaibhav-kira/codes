package learning;

class Outer                           // Outer.class
{
	int a;
	public void show()
	{
		
	}
	
	class Inner                       // Outer$Inner.class
	{
		public void display()
		{
			System.out.println("Inner display");
		}
	}
	
	static class InnerStatic
	{
		
	}
	
}

public class InnerDemo {

	public static void main(String[] args) 
	{
		
		Outer obj = new Outer();
		
		Outer.Inner obj1 = obj.new Inner();
		
		obj1.display();
		
		Outer.InnerStatic obj3 = new Outer.InnerStatic();
       // a bit different for static inner class outer 
	}

}
