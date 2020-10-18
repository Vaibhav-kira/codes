package learning;

public class Iteration {

	public static void main(String[] args) {
		
		int i=1;
		int n=5;
				
		while(i<=n)
		{
			if(n>100)
				break;
			System.out.println("while");
			i++;
		}
		
		for(int j=1;j<n;j++)
		{
			System.out.println("For");
		}
		
		for(i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
