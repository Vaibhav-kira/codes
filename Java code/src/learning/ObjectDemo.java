package learning;

// Creating a calculatr

class Calc
{
	int num1;   // 0
	int num2;   // 0
	int num3;   // by default zero ....
	int num4;   // 0 
	
	public void perform()
	{
		num3=num1+num2;
	}
	
}

public class ObjectDemo {

	public static void main(String[] args) 
	{
		
		Calc obj; // reference 
		obj = new Calc() ; // new keyword is used to allocate space   how much space to allocate is defined by constructor
		
		Calc obj1 = new Calc();
		
		obj1.num1=5;
		obj1.num2=10;
		System.out.println(obj1.num3);
		obj1.perform();
		System.out.println(obj1.num3);
		

	}

}
