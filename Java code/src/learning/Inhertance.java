package learning;

// IS-A, HAS-A

class Calculator                    // Super class
{
	public int add(int i,int j)
	{
		return i+j;
	}
}

class CalcAdv extends Calculator    // Sub class
{
	public int sub(int i,int j)                     // class which exteds another IS-A
	{
		return i-j;
	}
}

class CalcVeryAdv extends CalcAdv    //Multi level Inheritance
{
	public int multiply(int i, int j)
	{
		return i*j;
	}
}

// Java does not support multiple inheritance 

public class Inhertance {
	public static void main(String args[])                // Class in which yu are creating object is called HAS-A
	{
		
		CalcVeryAdv c1 = new CalcVeryAdv();
		
		System.out.println(c1.add(5, 6));
		System.out.println(c1.sub(6, 5));
		System.out.println(c1.multiply(7, 5));
		
		
	}
}
