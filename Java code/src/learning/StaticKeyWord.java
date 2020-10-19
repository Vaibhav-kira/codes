package learning;

class Emp
{
	int eid;
	int salary;
	static String ceo;     // it will be class specific not object specific
	
	static                       // executed before constructor always;
	{
		ceo ="larry";//Only once  // if multiple static blocks 
	}                             // sequence matters
	
	public Emp()
	{
		eid=0;
		salary=5;
		//ceo = "larry"    // will run every time object is created 
	}
	
	public void show()
	{
		System.out.println(eid + "  :  "+salary+"  :  "+ceo);
	}
}

public class StaticKeyWord {

	int i=0;
	
	public static void main(String[] args) 
	{
		
		//i=2; // only static variables in staic methods ....
		
		Emp naven = new Emp();
		Emp rahul = new Emp();
		
		naven.eid = 8;
		naven.salary = 4000;
		//naven.ceo = "Vaibhav";
		
		rahul.eid=9;
		rahul.salary=5000;
		//rahul.ceo="Ahuja";               // If ceo changes it should change for all employe
		
		Emp.ceo="Ahuja"; // we don't need object .
		// we can make method static
		//i.e. hoe main is called withoud object
		
		naven.show();
		rahul.show();       

	}

}
