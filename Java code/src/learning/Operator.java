package learning;

public class Operator {

	/*
	 * 
	 * Arithmetic  + , - , * , / , %
	 * Bitwise
	 * Relational
	 * Logical
	 * 
	 */
	public static void main(String[] args) 
	{
		int a=10,b=25,c=45;
		int sum = a+b+c;
		int diff=c-b-a;
		
		double div = (double)c/b; // will give int without double div (double)c/b
		
		System.out.println(sum);
		System.out.println(diff);
		System.out.println(div);
		
		a += b; //a = a+b
		a += 1; //a = a+1
		a++;    //a = a+1
		++a;    //pre inciment
		a++;    // post incriment
		
		
		b = ++a; // b = a + 1
		
		b = a++; // b = a; a = a + 1
		

	}

}
