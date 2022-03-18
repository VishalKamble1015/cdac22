import java.util.*;
class Octal
{
	public static void main(String args[])
	{	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String bin="";
		int rem;
		while(n!=0)
		{
		    rem=n%8;
			bin= rem + bin;
			n=n/8;
		}
		System.out.print(bin);
	}
}