package qs_code;

public class prime {
	public static void check(int n)
	{
		if(n<=2)
		{
			System.out.println(" Prime");
		}
		else {
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
					{
				System.out.println("not Prime");
				break;

					}
		else
		{
			System.out.println(" Prime");break;

		}
		}
		}
	}
	public static void main(String[] args)
	{
		check(7);
		
	}

}
