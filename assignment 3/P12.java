class P12
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)//row
			{
			
			for(int j=i;j<=5;j++)//space
			{
			System.out.print(" ");
			}
			for (int k=1;k<=i;k++)//print *(condition for 1,3,5 coloumn)
			{ 
				
				System.out.print(i+" ");//for printing 1 22 333 444 5555
				
			}
			
		System.out.println();
	}
	}
}