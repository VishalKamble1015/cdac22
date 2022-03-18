class P11
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)//row
			{
			
			for(int j=i;j<=5;j++)//space
			{
			System.out.print(" ");
			}
			for (int k=1;k<=2*i-1;k++)//print *
			{ 
				
				System.out.print("*");
			}
			
		System.out.println();
	}
	}
}