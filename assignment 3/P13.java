class P13
{
	public static void main(String args[])
	{char ch='A';
		for (int i=1;i<=5;i++)//row
			{
			
			for(int j=i;j<=5;j++)//space
			{
			System.out.print(" ");
			}
			for (int k=1;k<=i;k++)//print *(condition for 1,3,5 coloumn)
			{ 
				
				System.out.print(ch+" ");//for printing 1 22 333 444 5555
				
			}
			ch++;
		System.out.println();
	}
	}
}