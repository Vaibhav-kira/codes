package learning;

class Calci
{
	public int adding(int ... i )  // will reach as an array ....
	{
		int sum=0;
		for(int k : i)
			sum+=k;
		return sum;
			
	}
}


public class Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calci obj = new Calci();
		
		int sum=obj.adding(3,5,4,5,6,7,8,9,10,12,47,58,68,562,35,23,458,2536,1425,3652,1452,3);  // variable arguments 
		System.out.println(sum);

	}

}
