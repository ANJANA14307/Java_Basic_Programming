package qs_code;

public class Armstrong {
	public static int len(int n)
	{
		int ct=0,temp=n;
		while(temp>0)
		{
			temp/=10;
			ct+=1;
		}
		return ct;
		
	}
	public static int arm(int n)
	{
		int sum=0,r,ct,temp;
		temp=n;
		ct=len(n);
		while(temp>0)
		{
			r=temp%10;
			sum+=(int)Math.pow(r, ct);
			temp/=10;
		}
		return sum;

		
	}
	public static void main(String[] args)
	{	int n=407;
		int res=arm(n);
		if(res==n)
		{
			System.out.println("Armstrong");
		}
		else {
		System.out.println("Not Armstrong");}
	
		
	}

}
