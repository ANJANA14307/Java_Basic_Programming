package qs_code;

public class Automorphic {
	    public static int power(int base,int exp)
	    {
	        int p=1;
	        for(int i=1;i<=exp;i++)
	        {
	            p*=base;
	        }
	        return p;
	    }
	    public static int count(int n)
	    {
	    	int temp=n,ct=0;
	    	while(temp>0)
	    	{
	    		temp/=10;
	    		ct++;
	    	}
	    	return ct;
	    }


	    public  static boolean isAutomorphic(int n)
	    {
	        int temp=n,sq,ld;
	        int len=count(n);
	        int div=power(10,len);
	        sq=temp*temp;
	        ld=sq%div;
	        
	        if(ld==n)
	        {
	            return true;
	        }
	        else return false;
	        
	    }
	    public static void main(String[] args)
	    {
	    	boolean res=isAutomorphic(13);
	    	System.out.println(res);
	    }

	}



