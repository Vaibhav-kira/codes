package learning;

public class TernamryAndSwitch {

	public static void main(String[] args) 
	{
		
		int i = 8;
		int j = 6;
		
		/*if(i>6)
		 * 	j=1;
		 *else
		 *	j=2;
		 */
		
		j = i>6? 1:2;
		System.out.println(j);
		
		System.out.println("Switch case .... ");
		
		int n = 4;
		
		//in words  like one , two , three
		
		switch(n)  // will work for int , char and string(java > 1.8) not for double ....
		{
		case 1 :
		{
			System.out.println("One");
			break;
		}
		case 2:
		{
			System.out.println("Two");
		    break;
		}
		case 3:
		{
			System.out.println("Three");
			break;
		}
		case 4:
		{
			System.out.println("Four");
			break;
		}
		case 5:
		{
			System.out.println("Five");
			break;
		}
		default:
		{
			System.out.println("Number does not match");
			break;
		}
		}
		

	}

}
