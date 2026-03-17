package qs_code;

public class Fibo {
	public static void fibo(int n)
	{
		int a=0,b=1,c,i;
		for(i=0;i<=n;i++)
		{
			if(a>n)
			{
				System.out.println(a);return;
			}
		
			c=a+b;
			a=b;
			b=c;
			}
	    }
	public static void main(String[] args)
	{
		
		fibo(5000);
	}

}
