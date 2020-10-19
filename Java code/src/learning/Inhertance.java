package learning;

class Calculator                    // Super class
{
	public int add(int i,int j)
	{
		return i+j;
	}
}

class CalcAdv extends Calculator    // Sub class
{
	public int sub(int i,int j)
	{
		return i-j;
	}
}

public class Inhertance {
	public static void main(String args[])
	{
		
		CalcAdv c1 = new CalcAdv();
		
		System.out.println(c1.add(5, 6));
		System.out.println(c1.sub(6, 5));
		
		
	}
}
