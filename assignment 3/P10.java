class P10
{
	public static void main(String args[])
	{
	for (int i=5;i>=1;i--)//row
		
			{int  ch=65;
			for (int j=1;j<=i;j++)//space
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print((char)(ch+k)+" ");
			}
			
			System.out.println();
			}
	}
}