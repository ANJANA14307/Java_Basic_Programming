package qs_code;
import java.lang.Math.*;
import java.util.Scanner;
public class QuadraticEquation {
	public static void root(int a, int b, int c)
	{
		int d=(int)b*b-4*a*c;
		int r1,r2;
		if(d==0)
		{
			System.out.println( "Real roots");
			int r=(int)-b/2*a;
			System.out.println("The real root is= "+r);
		}
		else if(d>0)
		{
			System.out.println( "Real and distinct roots");
			r1=(int)(-b+Math.sqrt(d))/2*a;
			r2=(int)(-b-Math.sqrt(d))/2*a;
			System.out.println(r1+","+r2);
		}
		else
		{
			System.out.println( "Imaginary roots");
			System.out.println("Real root: "+ (int)(-b/2*a) +", Imaginary root: "+(int)Math.sqrt(Math.abs(d))/2*a);
		}
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x,y,z;
		System.out.print("Enter x the coeff :");
		x=sc.nextInt();
		System.out.print("Enter y the coeff :");
		y=sc.nextInt();
		System.out.print("Enter z the coeff :");
		z=sc.nextInt();
		root(x,y,z);
		
	}

}
