package learning;

class M
{
	final int DAY=0;   // becomes a constant  
	final int MONTH;
	public M()
	{
		//DAY=6;   // cannot change the value of final ....
		MONTH = 5; // can assighn only once
	}
		
}

final class Lo
{
	public void show()
	{
		
	}
}

/*class H extends Lo  // cannot subclass a final class
{
	
}
*/


// Cannot override a final method also ....



public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		M obj = new M();
		System.out.println(obj.DAY);

	}

}
