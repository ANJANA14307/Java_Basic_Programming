package qs_code;

public class ArmstronRange {
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
	public static int power(int n,int exp)
	{
		int p=1;
		for(int i=1;i<=exp;i++)
		{
			p=(int)p*n;
		}
		return p;
	}
	public static boolean isArm(int n)
	{
		int r,sum=0,temp=n;
		int ct=len(n);
		while(temp>0)
		{
			r=temp%10;
			sum+=power(r,ct);
			temp/=10;
		}
		if(sum==n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void Armstrong(int s,int e)
	{
		int i;
		for(i=s;i<=e;i++)
			{
			if(isArm(i)==true)
			{
				System.out.println(i);
			}
			}
	}
	public static void main(String[] args)
	{
		Armstrong(100,500);
	}
	

}
