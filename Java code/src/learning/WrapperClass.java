package learning;

// int    ,   float     ,    double
// Integer 


public class WrapperClass {

	public static void main(String[] args) 
	{
		int i=5; // Primitive datatype         not acceptable in oops 
		
		Integer i2 = new Integer(i); // Booking / Wrapping when passing primitive datatype in a Wrapper class .
		
		Integer ii = new Integer(5);      // Wrapper class    // Number sper class
		
		// extends Number

		int k = ii.intValue();            // Un-boxinng / Unwrapping 
		
		Integer ihj = 6; // auto-boxing auto-wrapping  
		
		int hju = ihj; // auto-un-boxing auto-un-wrapper
		
		Integer iop = Integer.valueOf(5); // Is used to yield better space and time complexities ....  
		
		Float ff = new Float(5.6);
		
		Double dd = new Double(6.3563);
		
		Boolean bb = new Boolean(true);
		
		Character cc = new Character('A');
		
		String str = "1234";
		
		//int ko = str; // error
		
		int ko = Integer.parseInt(str); // parseInt is a static method Integer.parseInt(str) is used ....
		
		//Long 
		//Short
		//Byte
		
		
	}

}
