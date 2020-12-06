package Practicles;

/* Constructor name must be the same as its class name
A Constructor must have no explicit return type
A Java constructor cannot be abstract, static, final, and synchronized
*/
class A_1
{
	public
	int a,b,c;
	A_1()
	{
		// default constructor , no-arg constructor
		a=0;
		b=0;
		c=0;
	}
	A_1(int a,int b ,int c)
	{
		// parameterised constructor
		this.a=a;
		this.b=b;
		this.c=c;
	}

}

public class experiment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_1 obj = new A_1();
		A_1 obj1= new A_1(1,2,3);
		System.out.println(String.valueOf(obj.a)+"    "+String.valueOf(obj.a)+"    "+String.valueOf(obj.a));
		System.out.println(String.valueOf(obj1.a)+"    "+String.valueOf(obj1.a)+"    "+String.valueOf(obj1.a));


	}

}
