package learning;

public class Patterns {
	public static void main(String args[])
	{
		int n = 6;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=i)
					System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 'A';i<='F';i++)
		{
			for(int j = 'A'; j <= 'F'; j++)
			{
				if(j<=i)
					System.out.print((char)j + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 1;i<=n;i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(j==1 || j==n || i==1 || i==n)
					System.out.print("$ ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
