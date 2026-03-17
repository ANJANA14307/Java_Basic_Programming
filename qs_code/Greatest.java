package qs_code;

public class Greatest {
	public static int large(int a, int b)
	{
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static void main(String[] args)
	{
		int a,b;
		a=30;
		b=11;
		int res=large(a,b);
		System.out.println(res);
	}

}
