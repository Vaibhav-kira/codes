package learning;

class Calce
{
	int a;
	int b;
	public Calce(int a,int b)
	{
		this.a=a;                // represent current object ....
		this.b=b;
	}
}
public class ThisKeyWord {
	public static void main(String args[])
	{
		Calce obj = new Calce(5,6);
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
}
