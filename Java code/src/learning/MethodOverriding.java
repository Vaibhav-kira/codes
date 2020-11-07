package learning;

class G
{
	
	public void show()
	{
		System.out.println("Show in G ");
	}
	
}

class K extends G
{
	@Override              // Annotation in java which says that show over rides a method
	public void show()     // if there is a spelling mistake it will simply show error if show1()
	{
		//super.show();//will show the output of G show also
		System.out.println("Show in k ");
	}
}

class L extends G
{
	@Override
	public void show()
	{
		System.out.println("Show in L");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		K obj = new K();
		
		obj.show();        // Show in K overrides Show in G
		
		G obj5 = new K();                // run time 
		
		obj5.show();                     // run time polymorphism
		
		//reference of G object of K
		// will call K methods only if methods are present in both
		
		obj5 = new L();                   // Dynamic method dispatch
		obj5.show();
		
		

	}

}
