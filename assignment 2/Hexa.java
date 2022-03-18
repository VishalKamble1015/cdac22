import java.util.*;
class Hexa
{
	public static void main(String args[])
	{	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt()
		String bin="";
		int rem;
		while(n!=0)
		{
		    rem=n%16;
			bin= rem + bin;
			n=n/16;
		}
		System.out.print(bin);
	}
}