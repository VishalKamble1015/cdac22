import java.util.*;
class Decimal
{
	public static void main(String args[])
	{	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt()
		String bin="";
		int rem;
		while(n!=0)
		{
		    rem=n%2;
			bin= rem + bin;
			n=n/2;
		}
		System.out.print(bin);
	}
}