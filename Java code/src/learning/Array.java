package learning;

class Abb
{
	
}

public class Array {
	public static void main(String args[])
	{
			// if different arrays of different lengths i.e. 1st array has 3 elements second has 2 thirsed had 7 and so on ....
		    // this is known as jagged array ....
		
		int num[] =new int[5] ;
		
		int num2[]= {5,6,7,8,9,10};
		
		A obj[] = new A[5];
		
		System.out.println(num[2]);
		
		num[0]=8;
		num[1]=7;
		num[2]=54;                             //  1-D array ....
		num[3]=89;
		num[4]=69;
		System.out.println(num[2]);
		
		for(int i =0 ;i<5;i++)
			System.out.print(num[i]+" ");
		
		System.out.println(" ");
		System.out.println();
		
		int d[][] = 
			{
					{1,2,3,4,5},
					{5,3,6},
					{1,5,3,2,6}
		    };
		
		
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[i].length;j++)
			{
				System.out.print( d[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		for(int i : num)
		{
			System.out.print(i+" ");
		}
		
		System.out.println(" ");
		System.out.println();
		
		for(int i[] : d)
		{
			for(int j : i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
	}
}
