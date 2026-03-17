package qs_code;

public class rev2 {
	public static int power(int base,int exp)
	{
		int p=1;
		for(int i=1;i<=exp;i++)
		{
			p=(int)p*base;
		}
		return p;
	}
	
	public static int count(int n)
	{
		int ct=0,temp=n;
		while(temp>0)
		{
			temp/=10;
			ct+=1;
		}
		return ct;
	}
	public static int reverse(int n)
	{
		int r,div,fh,sh,temp,half,rev=0;
		temp=n;
		int l=count(n);
		half=l/2;
		div=power(10,half);
		fh=n/div;
		sh=n%div;
		temp=sh;
		
		int finalr=0;
		finalr=sh*div+fh;
		return finalr;
		
		
	}
	public static void main(String[] args)
	{
		int res;
		res=reverse(903512);
		System.out.println(res);
	}
}

	
